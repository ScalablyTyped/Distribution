package typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
  */
@js.native
trait ValidatingWebhook extends js.Object {
  
  /**
    * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
    */
  var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * ClientConfig defines how to communicate with the hook. Required
    */
  var clientConfig: Input[WebhookClientConfig] = js.native
  
  /**
    * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
    */
  var failurePolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
    *
    * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
    *
    * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
    *
    * Defaults to "Exact"
    */
  var matchPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
    */
  var name: Input[String] = js.native
  
  /**
    * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
    *
    * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
    *   "matchExpressions": [
    *     {
    *       "key": "runlevel",
    *       "operator": "NotIn",
    *       "values": [
    *         "0",
    *         "1"
    *       ]
    *     }
    *   ]
    * }
    *
    * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
    *   "matchExpressions": [
    *     {
    *       "key": "environment",
    *       "operator": "In",
    *       "values": [
    *         "prod",
    *         "staging"
    *       ]
    *     }
    *   ]
    * }
    *
    * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
    *
    * Default to the empty LabelSelector, which matches everything.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
    */
  var objectSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
    */
  var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.native
  
  /**
    * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
    */
  var sideEffects: js.UndefOr[Input[String]] = js.native
  
  /**
    * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}
object ValidatingWebhook {
  
  @scala.inline
  def apply(clientConfig: Input[WebhookClientConfig], name: Input[String]): ValidatingWebhook = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatingWebhook]
  }
  
  @scala.inline
  implicit class ValidatingWebhookOps[Self <: ValidatingWebhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientConfig(value: Input[WebhookClientConfig]): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdmissionReviewVersionsVarargs(value: Input[String]*): Self = this.set("admissionReviewVersions", js.Array(value :_*))
    
    @scala.inline
    def setAdmissionReviewVersions(value: Input[js.Array[Input[String]]]): Self = this.set("admissionReviewVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmissionReviewVersions: Self = this.set("admissionReviewVersions", js.undefined)
    
    @scala.inline
    def setFailurePolicy(value: Input[String]): Self = this.set("failurePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailurePolicy: Self = this.set("failurePolicy", js.undefined)
    
    @scala.inline
    def setMatchPolicy(value: Input[String]): Self = this.set("matchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPolicy: Self = this.set("matchPolicy", js.undefined)
    
    @scala.inline
    def setNamespaceSelector(value: Input[LabelSelector]): Self = this.set("namespaceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceSelector: Self = this.set("namespaceSelector", js.undefined)
    
    @scala.inline
    def setObjectSelector(value: Input[LabelSelector]): Self = this.set("objectSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSelector: Self = this.set("objectSelector", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Input[RuleWithOperations]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: Input[js.Array[Input[RuleWithOperations]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Input[String]): Self = this.set("sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideEffects: Self = this.set("sideEffects", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Input[Double]): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
}

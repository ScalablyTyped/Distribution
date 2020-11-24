package typings.pulumiKubernetes.outputMod.admissionregistration.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
  */
@js.native
trait MutatingWebhook extends js.Object {
  
  /**
    * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
    */
  var admissionReviewVersions: js.Array[String] = js.native
  
  /**
    * ClientConfig defines how to communicate with the hook. Required
    */
  var clientConfig: WebhookClientConfig = js.native
  
  /**
    * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
    */
  var failurePolicy: String = js.native
  
  /**
    * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
    *
    * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
    *
    * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
    *
    * Defaults to "Exact"
    */
  var matchPolicy: String = js.native
  
  /**
    * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
    */
  var name: String = js.native
  
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
    * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
    *
    * Default to the empty LabelSelector, which matches everything.
    */
  var namespaceSelector: LabelSelector = js.native
  
  /**
    * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
    */
  var objectSelector: LabelSelector = js.native
  
  /**
    * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
    *
    * Never: the webhook will not be called more than once in a single admission evaluation.
    *
    * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
    *
    * Defaults to "Never".
    */
  var reinvocationPolicy: String = js.native
  
  /**
    * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
    */
  var rules: js.Array[RuleWithOperations] = js.native
  
  /**
    * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
    */
  var sideEffects: String = js.native
  
  /**
    * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
    */
  var timeoutSeconds: Double = js.native
}
object MutatingWebhook {
  
  @scala.inline
  def apply(
    admissionReviewVersions: js.Array[String],
    clientConfig: WebhookClientConfig,
    failurePolicy: String,
    matchPolicy: String,
    name: String,
    namespaceSelector: LabelSelector,
    objectSelector: LabelSelector,
    reinvocationPolicy: String,
    rules: js.Array[RuleWithOperations],
    sideEffects: String,
    timeoutSeconds: Double
  ): MutatingWebhook = {
    val __obj = js.Dynamic.literal(admissionReviewVersions = admissionReviewVersions.asInstanceOf[js.Any], clientConfig = clientConfig.asInstanceOf[js.Any], failurePolicy = failurePolicy.asInstanceOf[js.Any], matchPolicy = matchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], objectSelector = objectSelector.asInstanceOf[js.Any], reinvocationPolicy = reinvocationPolicy.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatingWebhook]
  }
  
  @scala.inline
  implicit class MutatingWebhookOps[Self <: MutatingWebhook] (val x: Self) extends AnyVal {
    
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
    def setAdmissionReviewVersionsVarargs(value: String*): Self = this.set("admissionReviewVersions", js.Array(value :_*))
    
    @scala.inline
    def setAdmissionReviewVersions(value: js.Array[String]): Self = this.set("admissionReviewVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConfig(value: WebhookClientConfig): Self = this.set("clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailurePolicy(value: String): Self = this.set("failurePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPolicy(value: String): Self = this.set("matchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceSelector(value: LabelSelector): Self = this.set("namespaceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSelector(value: LabelSelector): Self = this.set("objectSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReinvocationPolicy(value: String): Self = this.set("reinvocationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: RuleWithOperations*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[RuleWithOperations]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideEffects(value: String): Self = this.set("sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
  }
}

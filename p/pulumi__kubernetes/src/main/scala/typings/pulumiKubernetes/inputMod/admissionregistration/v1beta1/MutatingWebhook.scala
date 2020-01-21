package typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MutatingWebhook describes an admission webhook and the resources and operations it applies
  * to.
  */
trait MutatingWebhook extends js.Object {
  /**
    * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
    * Webhook expects. API server will try to use first version in the list which it supports. If
    * none of the versions specified in this list supported by API server, validation will fail
    * for this object. If a persisted webhook configuration specifies allowed versions and does
    * not include any versions known to the API Server, calls to the webhook will fail and be
    * subject to the failure policy. Default to `['v1beta1']`.
    */
  var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ClientConfig defines how to communicate with the hook. Required
    */
  var clientConfig: Input[WebhookClientConfig]
  /**
    * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
    * allowed values are Ignore or Fail. Defaults to Ignore.
    */
  var failurePolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
    * are "Exact" or "Equivalent".
    *
    * - Exact: match a request only if it exactly matches a specified rule. For example, if
    * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
    * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
    * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
    *
    * - Equivalent: match a request if modifies a resource listed in rules, even via another API
    * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
    * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
    * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
    * converted to apps/v1 and sent to the webhook.
    *
    * Defaults to "Exact"
    */
  var matchPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the admission webhook. Name should be fully qualified, e.g.,
    * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
    * kubernetes.io is the name of the organization. Required.
    */
  var name: Input[String]
  /**
    * NamespaceSelector decides whether to run the webhook on an object based on whether the
    * namespace for that object matches the selector. If the object itself is a namespace, the
    * matching is performed on object.metadata.labels. If the object is another cluster scoped
    * resource, it never skips the webhook.
    *
    * For example, to run the webhook on any objects whose namespace is not associated with
    * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
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
    * If instead you want to only run the webhook on any objects whose namespace is associated
    * with the "environment" of "prod" or "staging"; you will set the selector as follows:
    * "namespaceSelector": {
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
    * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more
    * examples of label selectors.
    *
    * Default to the empty LabelSelector, which matches everything.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * ObjectSelector decides whether to run the webhook based on if the object has matching
    * labels. objectSelector is evaluated against both the oldObject and newObject that would be
    * sent to the webhook, and is considered to match if either object matches the selector. A
    * null object (oldObject in the case of create, or newObject in the case of delete) or an
    * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
    * not considered to match. Use the object selector only if the webhook is opt-in, because end
    * users may skip the admission webhook by setting the labels. Default to the empty
    * LabelSelector, which matches everything.
    */
  var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * reinvocationPolicy indicates whether this webhook should be called multiple times as part
    * of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
    *
    * Never: the webhook will not be called more than once in a single admission evaluation.
    *
    * IfNeeded: the webhook will be called at least one additional time as part of the admission
    * evaluation if the object being admitted is modified by other admission plugins after the
    * initial webhook call. Webhooks that specify this option *must* be idempotent, able to
    * process objects they previously admitted. Note: * the number of additional invocations is
    * not guaranteed to be exactly one. * if additional invocations result in further
    * modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks
    * that use this option may be reordered to minimize the number of additional invocations. *
    * to validate an object after all mutations are guaranteed complete, use a validating
    * admission webhook instead.
    *
    * Defaults to "Never".
    */
  var reinvocationPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Rules describes what operations on what resources/subresources the webhook cares about. The
    * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
    * state which cannot be recovered from without completely disabling the plugin,
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
    * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
    */
  var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.undefined
  /**
    * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown,
    * None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system,
    * since a request may be rejected by a future step in the admission change and the side
    * effects therefore need to be undone. Requests with the dryRun attribute will be
    * auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to
    * Unknown.
    */
  var sideEffects: js.UndefOr[Input[String]] = js.undefined
  /**
    * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
    * webhook call will be ignored or the API call will fail based on the failure policy. The
    * timeout value must be between 1 and 30 seconds. Default to 30 seconds.
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object MutatingWebhook {
  @scala.inline
  def apply(
    clientConfig: Input[WebhookClientConfig],
    name: Input[String],
    admissionReviewVersions: Input[js.Array[Input[String]]] = null,
    failurePolicy: Input[String] = null,
    matchPolicy: Input[String] = null,
    namespaceSelector: Input[LabelSelector] = null,
    objectSelector: Input[LabelSelector] = null,
    reinvocationPolicy: Input[String] = null,
    rules: Input[js.Array[Input[RuleWithOperations]]] = null,
    sideEffects: Input[String] = null,
    timeoutSeconds: Input[Double] = null
  ): MutatingWebhook = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (admissionReviewVersions != null) __obj.updateDynamic("admissionReviewVersions")(admissionReviewVersions.asInstanceOf[js.Any])
    if (failurePolicy != null) __obj.updateDynamic("failurePolicy")(failurePolicy.asInstanceOf[js.Any])
    if (matchPolicy != null) __obj.updateDynamic("matchPolicy")(matchPolicy.asInstanceOf[js.Any])
    if (namespaceSelector != null) __obj.updateDynamic("namespaceSelector")(namespaceSelector.asInstanceOf[js.Any])
    if (objectSelector != null) __obj.updateDynamic("objectSelector")(objectSelector.asInstanceOf[js.Any])
    if (reinvocationPolicy != null) __obj.updateDynamic("reinvocationPolicy")(reinvocationPolicy.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (sideEffects != null) __obj.updateDynamic("sideEffects")(sideEffects.asInstanceOf[js.Any])
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatingWebhook]
  }
}


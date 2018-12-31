package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webhook describes an admission webhook and the resources and operations it applies to.
  */
trait Webhook extends js.Object {
  /**
    * ClientConfig defines how to communicate with the hook. Required
    */
  val clientConfig: WebhookClientConfig
  /**
    * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
    * allowed values are Ignore or Fail. Defaults to Ignore.
    */
  val failurePolicy: java.lang.String
  /**
    * The name of the admission webhook. Name should be fully qualified, e.g.,
    * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
    * kubernetes.io is the name of the organization. Required.
    */
  val name: java.lang.String
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
  val namespaceSelector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * Rules describes what operations on what resources/subresources the webhook cares about. The
    * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
    * state which cannot be recovered from without completely disabling the plugin,
    * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
    * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
    */
  val rules: js.Array[RuleWithOperations]
  /**
    * SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown,
    * None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system,
    * since a request may be rejected by a future step in the admission change and the side
    * effects therefore need to be undone. Requests with the dryRun attribute will be
    * auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to
    * Unknown.
    */
  val sideEffects: java.lang.String
}


package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
  * or reject and may change the object.
  */
trait MutatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfiguration
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  val webhooks: js.Array[Webhook]
}

object MutatingWebhookConfiguration {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1beta1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.MutatingWebhookConfiguration,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    webhooks: js.Array[Webhook]
  ): MutatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, webhooks = webhooks)
  
    __obj.asInstanceOf[MutatingWebhookConfiguration]
  }
}


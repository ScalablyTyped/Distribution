package typings.atPulumiKubernetes.typesOutputMod.admissionregistrationNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
  * accept or reject and object without changing it.
  */
trait ValidatingWebhookConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `admissionregistrationDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  val metadata: ObjectMeta
  /**
    * Webhooks is a list of webhooks and the affected resources and operations.
    */
  val webhooks: js.Array[ValidatingWebhook]
}

object ValidatingWebhookConfiguration {
  @scala.inline
  def apply(
    apiVersion: `admissionregistrationDOTk8sDOTio/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration,
    metadata: ObjectMeta,
    webhooks: js.Array[ValidatingWebhook]
  ): ValidatingWebhookConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, webhooks = webhooks)
  
    __obj.asInstanceOf[ValidatingWebhookConfiguration]
  }
}


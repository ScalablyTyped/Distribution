package typings.atPulumiKubernetes.typesOutputMod.admissionregistration.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
  */
trait ValidatingWebhookConfigurationList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `admissionregistrationDOTk8sDOTio/v1beta1`
  /**
    * List of ValidatingWebhookConfiguration.
    */
  val items: js.Array[ValidatingWebhookConfiguration]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object ValidatingWebhookConfigurationList {
  @scala.inline
  def apply(
    apiVersion: `admissionregistrationDOTk8sDOTio/v1beta1`,
    items: js.Array[ValidatingWebhookConfiguration],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList,
    metadata: ListMeta
  ): ValidatingWebhookConfigurationList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[ValidatingWebhookConfigurationList]
  }
}


package typings.atPulumiKubernetes.typesOutputMod.admissionregistration.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
  */
trait MutatingWebhookConfigurationList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: admissionregistrationDotk8sDotioSlashv1
  /**
    * List of MutatingWebhookConfiguration.
    */
  val items: js.Array[MutatingWebhookConfiguration]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfigurationList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object MutatingWebhookConfigurationList {
  @scala.inline
  def apply(
    apiVersion: admissionregistrationDotk8sDotioSlashv1,
    items: js.Array[MutatingWebhookConfiguration],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfigurationList,
    metadata: ListMeta
  ): MutatingWebhookConfigurationList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MutatingWebhookConfigurationList]
  }
}


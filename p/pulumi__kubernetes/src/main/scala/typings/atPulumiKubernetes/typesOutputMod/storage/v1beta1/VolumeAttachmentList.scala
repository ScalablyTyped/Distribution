package typings.atPulumiKubernetes.typesOutputMod.storage.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentList is a collection of VolumeAttachment objects.
  */
trait VolumeAttachmentList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: storageDotk8sDotioSlashv1beta1
  /**
    * Items is the list of VolumeAttachments
    */
  val items: js.Array[VolumeAttachment]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachmentList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object VolumeAttachmentList {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1beta1,
    items: js.Array[VolumeAttachment],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachmentList,
    metadata: ListMeta
  ): VolumeAttachmentList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VolumeAttachmentList]
  }
}


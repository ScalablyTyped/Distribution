package typings.pulumiKubernetes.outputMod.storage.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
  *
  * VolumeAttachment objects are non-namespaced.
  */
@js.native
trait VolumeAttachment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: storageDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment = js.native
  /**
    * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
    */
  var spec: VolumeAttachmentSpec = js.native
  /**
    * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
    */
  var status: VolumeAttachmentStatus = js.native
}

object VolumeAttachment {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment,
    metadata: ObjectMeta,
    spec: VolumeAttachmentSpec,
    status: VolumeAttachmentStatus
  ): VolumeAttachment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachment]
  }
  @scala.inline
  implicit class VolumeAttachmentOps[Self <: VolumeAttachment] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: storageDotk8sDotioSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: VolumeAttachmentSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: VolumeAttachmentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


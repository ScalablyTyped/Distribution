package typings.pulumiKubernetes.inputMod.storage.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typings.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]] = js.native
  /**
    * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
    */
  var spec: Input[VolumeAttachmentSpec] = js.native
  /**
    * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
    */
  var status: js.UndefOr[Input[VolumeAttachmentStatus]] = js.native
}

object VolumeAttachment {
  @scala.inline
  def apply(spec: Input[VolumeAttachmentSpec]): VolumeAttachment = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
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
    def setSpec(value: Input[VolumeAttachmentSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[storageDotk8sDotioSlashv1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setStatus(value: Input[VolumeAttachmentStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}


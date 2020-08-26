package typings.pulumiKubernetes.inputMod.storage.v1alpha1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
  */
@js.native
trait VolumeAttachmentStatus extends js.Object {
  /**
    * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachError: js.UndefOr[Input[VolumeError]] = js.native
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attached: Input[Boolean] = js.native
  /**
    * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
    */
  var detachError: js.UndefOr[Input[VolumeError]] = js.native
}

object VolumeAttachmentStatus {
  @scala.inline
  def apply(attached: Input[Boolean]): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
  @scala.inline
  implicit class VolumeAttachmentStatusOps[Self <: VolumeAttachmentStatus] (val x: Self) extends AnyVal {
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
    def setAttached(value: Input[Boolean]): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachError(value: Input[VolumeError]): Self = this.set("attachError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachError: Self = this.set("attachError", js.undefined)
    @scala.inline
    def setAttachmentMetadata(value: Input[StringDictionary[Input[String]]]): Self = this.set("attachmentMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentMetadata: Self = this.set("attachmentMetadata", js.undefined)
    @scala.inline
    def setDetachError(value: Input[VolumeError]): Self = this.set("detachError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachError: Self = this.set("detachError", js.undefined)
  }
  
}


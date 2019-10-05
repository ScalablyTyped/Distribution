package typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
  */
trait VolumeAttachmentStatus extends js.Object {
  /**
    * The last error encountered during attach operation, if any. This field must only be set by
    * the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachError: js.UndefOr[Input[VolumeError]] = js.undefined
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity
    * completing the attach operation, i.e. the external-attacher.
    */
  var attached: Input[Boolean]
  /**
    * Upon successful attach, this field is populated with any information returned by the attach
    * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
    * only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  var attachmentMetadata: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * The last error encountered during detach operation, if any. This field must only be set by
    * the entity completing the detach operation, i.e. the external-attacher.
    */
  var detachError: js.UndefOr[Input[VolumeError]] = js.undefined
}

object VolumeAttachmentStatus {
  @scala.inline
  def apply(
    attached: Input[Boolean],
    attachError: Input[VolumeError] = null,
    attachmentMetadata: Input[StringDictionary[Input[String]]] = null,
    detachError: Input[VolumeError] = null
  ): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any])
    if (attachError != null) __obj.updateDynamic("attachError")(attachError.asInstanceOf[js.Any])
    if (attachmentMetadata != null) __obj.updateDynamic("attachmentMetadata")(attachmentMetadata.asInstanceOf[js.Any])
    if (detachError != null) __obj.updateDynamic("detachError")(detachError.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
}


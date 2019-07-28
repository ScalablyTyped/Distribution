package typings.atPulumiKubernetes.typesOutputMod.storageNs.v1Ns

import org.scalablytyped.runtime.StringDictionary
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
  val attachError: VolumeError
  /**
    * Indicates the volume is successfully attached. This field must only be set by the entity
    * completing the attach operation, i.e. the external-attacher.
    */
  val attached: Boolean
  /**
    * Upon successful attach, this field is populated with any information returned by the attach
    * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
    * only be set by the entity completing the attach operation, i.e. the external-attacher.
    */
  val attachmentMetadata: StringDictionary[String]
  /**
    * The last error encountered during detach operation, if any. This field must only be set by
    * the entity completing the detach operation, i.e. the external-attacher.
    */
  val detachError: VolumeError
}

object VolumeAttachmentStatus {
  @scala.inline
  def apply(
    attachError: VolumeError,
    attached: Boolean,
    attachmentMetadata: StringDictionary[String],
    detachError: VolumeError
  ): VolumeAttachmentStatus = {
    val __obj = js.Dynamic.literal(attachError = attachError, attached = attached, attachmentMetadata = attachmentMetadata, detachError = detachError)
  
    __obj.asInstanceOf[VolumeAttachmentStatus]
  }
}


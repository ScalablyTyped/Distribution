package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image, document preview, or video preview attachment.  */
@JSGlobal("SP.Social.SocialAttachment")
@js.native
class SocialAttachment () extends ClientValueObject {
  /** Specifies the type of object that the attachment contains. */
  def get_attachmentKind(): SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def get_clickAction(): SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  def get_contentUri(): String = js.native
  /** Provides a text description of the attachment. */
  def get_description(): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  def get_height(): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def get_length(): Double = js.native
  /** Provides the attachment name. */
  def get_name(): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def get_previewUri(): String = js.native
  /** Provides the attachment URI. */
  def get_uri(): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  def get_width(): Double = js.native
  /** Specifies the type of object that the attachment contains. */
  def set_attachmentKind(value: SocialAttachmentKind): SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def set_clickAction(value: SocialAttachmentAction): SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  def set_contentUri(value: String): String = js.native
  /** Provides a text description of the attachment. */
  def set_description(value: String): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  def set_height(value: Double): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def set_length(value: Double): Double = js.native
  /** Provides the attachment name. */
  def set_name(value: String): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def set_previewUri(value: String): String = js.native
  /** Provides the attachment URI. */
  def set_uri(value: String): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  def set_width(value: Double): Double = js.native
}


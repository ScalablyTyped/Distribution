package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image, document preview, or video preview attachment.  */
@JSGlobal("SP.Social.SocialAttachment")
@js.native
class SocialAttachment ()
  extends typings.sharepoint.SP.Social.SocialAttachment {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies the type of object that the attachment contains. */
  /* CompleteClass */
  override def get_attachmentKind(): typings.sharepoint.SP.Social.SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  /* CompleteClass */
  override def get_clickAction(): typings.sharepoint.SP.Social.SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  /* CompleteClass */
  override def get_contentUri(): String = js.native
  /** Provides a text description of the attachment. */
  /* CompleteClass */
  override def get_description(): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  /* CompleteClass */
  override def get_height(): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  /* CompleteClass */
  override def get_length(): Double = js.native
  /** Provides the attachment name. */
  /* CompleteClass */
  override def get_name(): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  /* CompleteClass */
  override def get_previewUri(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Provides the attachment URI. */
  /* CompleteClass */
  override def get_uri(): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  /* CompleteClass */
  override def get_width(): Double = js.native
  /** Specifies the type of object that the attachment contains. */
  /* CompleteClass */
  override def set_attachmentKind(value: typings.sharepoint.SP.Social.SocialAttachmentKind): typings.sharepoint.SP.Social.SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  /* CompleteClass */
  override def set_clickAction(value: typings.sharepoint.SP.Social.SocialAttachmentAction): typings.sharepoint.SP.Social.SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  /* CompleteClass */
  override def set_contentUri(value: String): String = js.native
  /** Provides a text description of the attachment. */
  /* CompleteClass */
  override def set_description(value: String): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  /* CompleteClass */
  override def set_height(value: Double): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  /* CompleteClass */
  override def set_length(value: Double): Double = js.native
  /** Provides the attachment name. */
  /* CompleteClass */
  override def set_name(value: String): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  /* CompleteClass */
  override def set_previewUri(value: String): String = js.native
  /** Provides the attachment URI. */
  /* CompleteClass */
  override def set_uri(value: String): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  /* CompleteClass */
  override def set_width(value: Double): Double = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


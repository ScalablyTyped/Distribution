package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a post read from the server. */
@JSGlobal("SP.Social.SocialPost")
@js.native
class SocialPost ()
  extends typings.sharepoint.SP.Social.SocialPost {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies an image, document preview, or video preview attachment */
  /* CompleteClass */
  override def get_attachment(): typings.sharepoint.SP.Social.SocialAttachment = js.native
  /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
  /* CompleteClass */
  override def get_attributes(): typings.sharepoint.SP.Social.SocialPostAttributes = js.native
  /** Specifies the author of the post as an index to the social thread's Actors array. */
  /* CompleteClass */
  override def get_authorIndex(): Double = js.native
  /** Specifies the date and time that the post was created on the server. */
  /* CompleteClass */
  override def get_createdTime(): String = js.native
  /** Specifies the unique identifier of the post. */
  /* CompleteClass */
  override def get_id(): String = js.native
  /** Specifies information about users who like the post. */
  /* CompleteClass */
  override def get_likerInfo(): typings.sharepoint.SP.Social.SocialPostActorInfo = js.native
  /** Specifies the date and time that the post was last modified on the server. */
  /* CompleteClass */
  override def get_modifiedTime(): String = js.native
  /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
  /* CompleteClass */
  override def get_overlays(): js.Array[typings.sharepoint.SP.Social.SocialDataOverlay] = js.native
  /** Specifies whether a post is the root post or a reply post in a thread */
  /* CompleteClass */
  override def get_postType(): typings.sharepoint.SP.Social.SocialPostType = js.native
  /** Specifies the URI of the image to be displayed with the post.  */
  /* CompleteClass */
  override def get_preferredImageUri(): String = js.native
  /** Specifies the link to a web site associated with the application that created the post. */
  /* CompleteClass */
  override def get_source(): typings.sharepoint.SP.Social.SocialLink = js.native
  /** Specifies the text of the post. */
  /* CompleteClass */
  override def get_text(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


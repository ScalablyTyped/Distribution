package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a post read from the server. */
trait SocialPost extends ClientValueObject {
  /** Specifies an image, document preview, or video preview attachment */
  def get_attachment(): SocialAttachment
  /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
  def get_attributes(): SocialPostAttributes
  /** Specifies the author of the post as an index to the social thread's Actors array. */
  def get_authorIndex(): Double
  /** Specifies the date and time that the post was created on the server. */
  def get_createdTime(): String
  /** Specifies the unique identifier of the post. */
  def get_id(): String
  /** Specifies information about users who like the post. */
  def get_likerInfo(): SocialPostActorInfo
  /** Specifies the date and time that the post was last modified on the server. */
  def get_modifiedTime(): String
  /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
  def get_overlays(): js.Array[SocialDataOverlay]
  /** Specifies whether a post is the root post or a reply post in a thread */
  def get_postType(): SocialPostType
  /** Specifies the URI of the image to be displayed with the post.  */
  def get_preferredImageUri(): String
  /** Specifies the link to a web site associated with the application that created the post. */
  def get_source(): SocialLink
  /** Specifies the text of the post. */
  def get_text(): String
}

object SocialPost {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_attachment: () => SocialAttachment,
    get_attributes: () => SocialPostAttributes,
    get_authorIndex: () => Double,
    get_createdTime: () => String,
    get_id: () => String,
    get_likerInfo: () => SocialPostActorInfo,
    get_modifiedTime: () => String,
    get_overlays: () => js.Array[SocialDataOverlay],
    get_postType: () => SocialPostType,
    get_preferredImageUri: () => String,
    get_source: () => SocialLink,
    get_text: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPost = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_attachment = js.Any.fromFunction0(get_attachment), get_attributes = js.Any.fromFunction0(get_attributes), get_authorIndex = js.Any.fromFunction0(get_authorIndex), get_createdTime = js.Any.fromFunction0(get_createdTime), get_id = js.Any.fromFunction0(get_id), get_likerInfo = js.Any.fromFunction0(get_likerInfo), get_modifiedTime = js.Any.fromFunction0(get_modifiedTime), get_overlays = js.Any.fromFunction0(get_overlays), get_postType = js.Any.fromFunction0(get_postType), get_preferredImageUri = js.Any.fromFunction0(get_preferredImageUri), get_source = js.Any.fromFunction0(get_source), get_text = js.Any.fromFunction0(get_text), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPost]
  }
}


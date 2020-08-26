package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a post read from the server. */
@js.native
trait SocialPost extends ClientValueObject {
  /** Specifies an image, document preview, or video preview attachment */
  def get_attachment(): SocialAttachment = js.native
  /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
  def get_attributes(): SocialPostAttributes = js.native
  /** Specifies the author of the post as an index to the social thread's Actors array. */
  def get_authorIndex(): Double = js.native
  /** Specifies the date and time that the post was created on the server. */
  def get_createdTime(): String = js.native
  /** Specifies the unique identifier of the post. */
  def get_id(): String = js.native
  /** Specifies information about users who like the post. */
  def get_likerInfo(): SocialPostActorInfo = js.native
  /** Specifies the date and time that the post was last modified on the server. */
  def get_modifiedTime(): String = js.native
  /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
  def get_overlays(): js.Array[SocialDataOverlay] = js.native
  /** Specifies whether a post is the root post or a reply post in a thread */
  def get_postType(): SocialPostType = js.native
  /** Specifies the URI of the image to be displayed with the post.  */
  def get_preferredImageUri(): String = js.native
  /** Specifies the link to a web site associated with the application that created the post. */
  def get_source(): SocialLink = js.native
  /** Specifies the text of the post. */
  def get_text(): String = js.native
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
  @scala.inline
  implicit class SocialPostOps[Self <: SocialPost] (val x: Self) extends AnyVal {
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
    def setGet_attachment(value: () => SocialAttachment): Self = this.set("get_attachment", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_attributes(value: () => SocialPostAttributes): Self = this.set("get_attributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_authorIndex(value: () => Double): Self = this.set("get_authorIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_createdTime(value: () => String): Self = this.set("get_createdTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_likerInfo(value: () => SocialPostActorInfo): Self = this.set("get_likerInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_modifiedTime(value: () => String): Self = this.set("get_modifiedTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_overlays(value: () => js.Array[SocialDataOverlay]): Self = this.set("get_overlays", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_postType(value: () => SocialPostType): Self = this.set("get_postType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_preferredImageUri(value: () => String): Self = this.set("get_preferredImageUri", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_source(value: () => SocialLink): Self = this.set("get_source", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_text(value: () => String): Self = this.set("get_text", js.Any.fromFunction0(value))
  }
  
}


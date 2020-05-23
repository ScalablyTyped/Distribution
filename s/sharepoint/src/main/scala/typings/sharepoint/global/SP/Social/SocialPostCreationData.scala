package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the content of a post in the SocialFeedManager.createPost method.
  The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
@JSGlobal("SP.Social.SocialPostCreationData")
@js.native
class SocialPostCreationData ()
  extends typings.sharepoint.SP.Social.SocialPostCreationData {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies an image, document preview, or video preview to be used in the post. */
  /* CompleteClass */
  override def get_attachment(): typings.sharepoint.SP.Social.SocialAttachment = js.native
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  /* CompleteClass */
  override def get_contentItems(): js.Array[typings.sharepoint.SP.Social.SocialDataItem] = js.native
  /** Contains the text body of the post. */
  /* CompleteClass */
  override def get_contentText(): String = js.native
  /** Specifies additional information when creating server-generated posts */
  /* CompleteClass */
  override def get_definitionData(): typings.sharepoint.SP.Social.SocialPostDefinitionData = js.native
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  /* CompleteClass */
  override def get_securityUris(): js.Array[String] = js.native
  /** Specifies the link to a web site associated with the application that created the post */
  /* CompleteClass */
  override def get_source(): typings.sharepoint.SP.Social.SocialLink = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Indicates whether the post is to be used as the current user's new status message. */
  /* CompleteClass */
  override def get_updateStatusText(): Boolean = js.native
  /** Specifies an image, document preview, or video preview to be used in the post. */
  /* CompleteClass */
  override def set_attachment(value: typings.sharepoint.SP.Social.SocialAttachment): typings.sharepoint.SP.Social.SocialAttachment = js.native
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  /* CompleteClass */
  override def set_contentItems(value: js.Array[typings.sharepoint.SP.Social.SocialDataItem]): js.Array[typings.sharepoint.SP.Social.SocialDataItem] = js.native
  /** Contains the text body of the post.
    It can optionally contain one or more substitution references to elements in the zero-based ContentItems array.
    A substitution reference consists of a series of characters that consist of an open-brace character ({) followed by one of more digits in the range 0 to 9 and terminated by a close-brace character (}).
    The substitution reference is replaced by the text value of the element in the in the array at the offset specified by the value of the digits.
    For example, the text string "{0}" is replaced by the first element in the ContentItems array. */
  /* CompleteClass */
  override def set_contentText(value: String): String = js.native
  /** Specifies additional information when creating server-generated posts */
  /* CompleteClass */
  override def set_definitionData(value: typings.sharepoint.SP.Social.SocialPostDefinitionData): typings.sharepoint.SP.Social.SocialPostDefinitionData = js.native
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  /* CompleteClass */
  override def set_securityUris(value: js.Array[String]): js.Array[String] = js.native
  /** Specifies the link to a web site associated with the application that created the post */
  /* CompleteClass */
  override def set_source(value: typings.sharepoint.SP.Social.SocialLink): typings.sharepoint.SP.Social.SocialLink = js.native
  /** Indicates whether the post is to be used as the current user's new status message. */
  /* CompleteClass */
  override def set_updateStatusText(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


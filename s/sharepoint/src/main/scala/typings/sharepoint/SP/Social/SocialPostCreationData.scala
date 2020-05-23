package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the content of a post in the SocialFeedManager.createPost method.
  The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
trait SocialPostCreationData extends ClientValueObject {
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def get_attachment(): SocialAttachment
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def get_contentItems(): js.Array[SocialDataItem]
  /** Contains the text body of the post. */
  def get_contentText(): String
  /** Specifies additional information when creating server-generated posts */
  def get_definitionData(): SocialPostDefinitionData
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def get_securityUris(): js.Array[String]
  /** Specifies the link to a web site associated with the application that created the post */
  def get_source(): SocialLink
  /** Indicates whether the post is to be used as the current user's new status message. */
  def get_updateStatusText(): Boolean
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def set_attachment(value: SocialAttachment): SocialAttachment
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def set_contentItems(value: js.Array[SocialDataItem]): js.Array[SocialDataItem]
  /** Contains the text body of the post.
    It can optionally contain one or more substitution references to elements in the zero-based ContentItems array.
    A substitution reference consists of a series of characters that consist of an open-brace character ({) followed by one of more digits in the range 0 to 9 and terminated by a close-brace character (}).
    The substitution reference is replaced by the text value of the element in the in the array at the offset specified by the value of the digits.
    For example, the text string "{0}" is replaced by the first element in the ContentItems array. */
  def set_contentText(value: String): String
  /** Specifies additional information when creating server-generated posts */
  def set_definitionData(value: SocialPostDefinitionData): SocialPostDefinitionData
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def set_securityUris(value: js.Array[String]): js.Array[String]
  /** Specifies the link to a web site associated with the application that created the post */
  def set_source(value: SocialLink): SocialLink
  /** Indicates whether the post is to be used as the current user's new status message. */
  def set_updateStatusText(value: Boolean): Boolean
}

object SocialPostCreationData {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_attachment: () => SocialAttachment,
    get_contentItems: () => js.Array[SocialDataItem],
    get_contentText: () => String,
    get_definitionData: () => SocialPostDefinitionData,
    get_securityUris: () => js.Array[String],
    get_source: () => SocialLink,
    get_typeId: () => String,
    get_updateStatusText: () => Boolean,
    set_attachment: SocialAttachment => SocialAttachment,
    set_contentItems: js.Array[SocialDataItem] => js.Array[SocialDataItem],
    set_contentText: String => String,
    set_definitionData: SocialPostDefinitionData => SocialPostDefinitionData,
    set_securityUris: js.Array[String] => js.Array[String],
    set_source: SocialLink => SocialLink,
    set_updateStatusText: Boolean => Boolean,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostCreationData = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_attachment = js.Any.fromFunction0(get_attachment), get_contentItems = js.Any.fromFunction0(get_contentItems), get_contentText = js.Any.fromFunction0(get_contentText), get_definitionData = js.Any.fromFunction0(get_definitionData), get_securityUris = js.Any.fromFunction0(get_securityUris), get_source = js.Any.fromFunction0(get_source), get_typeId = js.Any.fromFunction0(get_typeId), get_updateStatusText = js.Any.fromFunction0(get_updateStatusText), set_attachment = js.Any.fromFunction1(set_attachment), set_contentItems = js.Any.fromFunction1(set_contentItems), set_contentText = js.Any.fromFunction1(set_contentText), set_definitionData = js.Any.fromFunction1(set_definitionData), set_securityUris = js.Any.fromFunction1(set_securityUris), set_source = js.Any.fromFunction1(set_source), set_updateStatusText = js.Any.fromFunction1(set_updateStatusText), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostCreationData]
  }
}


package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the content of a post in the SocialFeedManager.createPost method.
  The post consists of a text message, which can optionally include social tags, mentions of users, and links. */
@JSGlobal("SP.Social.SocialPostCreationData")
@js.native
class SocialPostCreationData ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def get_attachment(): SocialAttachment = js.native
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def get_contentItems(): js.Array[SocialDataItem] = js.native
  /** Contains the text body of the post. */
  def get_contentText(): java.lang.String = js.native
  /** Specifies additional information when creating server-generated posts */
  def get_definitionData(): SocialPostDefinitionData = js.native
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def get_securityUris(): js.Array[java.lang.String] = js.native
  /** Specifies the link to a web site associated with the application that created the post */
  def get_source(): SocialLink = js.native
  /** Indicates whether the post is to be used as the current user's new status message. */
  def get_updateStatusText(): scala.Boolean = js.native
  /** Specifies an image, document preview, or video preview to be used in the post. */
  def set_attachment(value: SocialAttachment): SocialAttachment = js.native
  /** Specifies an array consisting of social tags, user mentions, links to documents, links to sites, and generic links.
    Each element in the array is inserted into the ContentText string if there is a substitution reference to the array element in the string. */
  def set_contentItems(value: js.Array[SocialDataItem]): js.Array[SocialDataItem] = js.native
  /** Contains the text body of the post.
    It can optionally contain one or more substitution references to elements in the zero-based ContentItems array.
    A substitution reference consists of a series of characters that consist of an open-brace character ({) followed by one of more digits in the range 0 to 9 and terminated by a close-brace character (}).
    The substitution reference is replaced by the text value of the element in the in the array at the offset specified by the value of the digits.
    For example, the text string "{0}" is replaced by the first element in the ContentItems array. */
  def set_contentText(value: java.lang.String): java.lang.String = js.native
  /** Specifies additional information when creating server-generated posts */
  def set_definitionData(value: SocialPostDefinitionData): SocialPostDefinitionData = js.native
  /** Specifies that access to the post SHOULD be restricted to users that have access to the objects identified by the array of URIs */
  def set_securityUris(value: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /** Specifies the link to a web site associated with the application that created the post */
  def set_source(value: SocialLink): SocialLink = js.native
  /** Indicates whether the post is to be used as the current user's new status message. */
  def set_updateStatusText(value: scala.Boolean): scala.Boolean = js.native
}


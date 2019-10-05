package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a user, document, site, tag, or link to be inserted in a new post.
  The SocialPostCreationData class defines the content text that contains substitution strings.
  Each substitution string is replaced by a SocialDataItem value. */
@JSGlobal("SP.Social.SocialDataItem")
@js.native
class SocialDataItem () extends ClientValueObject {
  /** Identifies the user.  */
  def get_accountName(): String = js.native
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  def get_itemType(): SocialDataItemType = js.native
  /** Identifies the tag.  */
  def get_tagGuid(): String = js.native
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  def get_text(): String = js.native
  /** Identifies the site, document, or link.  */
  def get_uri(): String = js.native
  /** Identifies the user.  */
  def set_accountName(value: String): String = js.native
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  def set_itemType(value: SocialDataItemType): SocialDataItemType = js.native
  /** Identifies the tag.  */
  def set_tagGuid(value: String): String = js.native
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  def set_text(value: String): String = js.native
  /** Identifies the site, document, or link.  */
  def set_uri(value: String): String = js.native
}


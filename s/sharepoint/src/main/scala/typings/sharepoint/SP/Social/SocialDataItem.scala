package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a user, document, site, tag, or link to be inserted in a new post.
  The SocialPostCreationData class defines the content text that contains substitution strings.
  Each substitution string is replaced by a SocialDataItem value. */
trait SocialDataItem extends ClientValueObject {
  /** Identifies the user.  */
  def get_accountName(): String
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  def get_itemType(): SocialDataItemType
  /** Identifies the tag.  */
  def get_tagGuid(): String
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  def get_text(): String
  /** Identifies the site, document, or link.  */
  def get_uri(): String
  /** Identifies the user.  */
  def set_accountName(value: String): String
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  def set_itemType(value: SocialDataItemType): SocialDataItemType
  /** Identifies the tag.  */
  def set_tagGuid(value: String): String
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  def set_text(value: String): String
  /** Identifies the site, document, or link.  */
  def set_uri(value: String): String
}

object SocialDataItem {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_accountName: () => String,
    get_itemType: () => SocialDataItemType,
    get_tagGuid: () => String,
    get_text: () => String,
    get_typeId: () => String,
    get_uri: () => String,
    set_accountName: String => String,
    set_itemType: SocialDataItemType => SocialDataItemType,
    set_tagGuid: String => String,
    set_text: String => String,
    set_uri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialDataItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_accountName = js.Any.fromFunction0(get_accountName), get_itemType = js.Any.fromFunction0(get_itemType), get_tagGuid = js.Any.fromFunction0(get_tagGuid), get_text = js.Any.fromFunction0(get_text), get_typeId = js.Any.fromFunction0(get_typeId), get_uri = js.Any.fromFunction0(get_uri), set_accountName = js.Any.fromFunction1(set_accountName), set_itemType = js.Any.fromFunction1(set_itemType), set_tagGuid = js.Any.fromFunction1(set_tagGuid), set_text = js.Any.fromFunction1(set_text), set_uri = js.Any.fromFunction1(set_uri), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialDataItem]
  }
}


package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an item to be inserted in a post by replacing a token in the post definition.
  This type can only be specified in a server-to-server call. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItem")
@js.native
class SocialPostDefinitionDataItem () extends ClientValueObject {
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  def get_accountName(): String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def get_itemType(): SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  def get_placeholderName(): String = js.native
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  def get_tagGuid(): String = js.native
  /** Specifies the text that is substituted for the placeholder */
  def get_text(): String = js.native
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def get_uri(): String = js.native
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  def set_accountName(value: String): String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def set_itemType(value: SocialPostDefinitionDataItemType): SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  def set_placeholderName(value: String): String = js.native
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  def set_tagGuid(value: String): String = js.native
  /** Specifies the text that is substituted for the placeholder */
  def set_text(value: String): String = js.native
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def set_uri(value: String): String = js.native
}


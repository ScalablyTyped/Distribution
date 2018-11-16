package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an item to be inserted in a post by replacing a token in the post definition.
            This type can only be specified in a server-to-server call. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItem")
@js.native
class SocialPostDefinitionDataItem ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** Specifies the name of the user.
                  This property is only used if the ItemType property specifies that the item is a User. */
  def get_accountName(): java.lang.String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def get_itemType(): SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  def get_placeholderName(): java.lang.String = js.native
  /** Specifies the GUID that identifies the tag.
                  This property is only used if the ItemType property specifies that the item is a Tag. */
  def get_tagGuid(): java.lang.String = js.native
  /** Specifies the text that is substituted for the placeholder */
  def get_text(): java.lang.String = js.native
  /** Specifies the URI of the document, site, or link.
                  This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def get_uri(): java.lang.String = js.native
  /** Specifies the name of the user.
                  This property is only used if the ItemType property specifies that the item is a User. */
  def set_accountName(value: java.lang.String): java.lang.String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def set_itemType(value: SocialPostDefinitionDataItemType): SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  def set_placeholderName(value: java.lang.String): java.lang.String = js.native
  /** Specifies the GUID that identifies the tag.
                  This property is only used if the ItemType property specifies that the item is a Tag. */
  def set_tagGuid(value: java.lang.String): java.lang.String = js.native
  /** Specifies the text that is substituted for the placeholder */
  def set_text(value: java.lang.String): java.lang.String = js.native
  /** Specifies the URI of the document, site, or link.
                  This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def set_uri(value: java.lang.String): java.lang.String = js.native
}


package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an item to be inserted in a post by replacing a token in the post definition.
  This type can only be specified in a server-to-server call. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItem")
@js.native
class SocialPostDefinitionDataItem ()
  extends typings.sharepoint.SP.Social.SocialPostDefinitionDataItem {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  /* CompleteClass */
  override def get_accountName(): String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  /* CompleteClass */
  override def get_itemType(): typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  /* CompleteClass */
  override def get_placeholderName(): String = js.native
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  /* CompleteClass */
  override def get_tagGuid(): String = js.native
  /** Specifies the text that is substituted for the placeholder */
  /* CompleteClass */
  override def get_text(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  /* CompleteClass */
  override def get_uri(): String = js.native
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  /* CompleteClass */
  override def set_accountName(value: String): String = js.native
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  /* CompleteClass */
  override def set_itemType(value: typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType): typings.sharepoint.SP.Social.SocialPostDefinitionDataItemType = js.native
  /** Specifies the post definition token to be replaced by the item */
  /* CompleteClass */
  override def set_placeholderName(value: String): String = js.native
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  /* CompleteClass */
  override def set_tagGuid(value: String): String = js.native
  /** Specifies the text that is substituted for the placeholder */
  /* CompleteClass */
  override def set_text(value: String): String = js.native
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  /* CompleteClass */
  override def set_uri(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


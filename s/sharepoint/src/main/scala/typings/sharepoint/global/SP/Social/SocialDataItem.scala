package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a user, document, site, tag, or link to be inserted in a new post.
  The SocialPostCreationData class defines the content text that contains substitution strings.
  Each substitution string is replaced by a SocialDataItem value. */
@JSGlobal("SP.Social.SocialDataItem")
@js.native
class SocialDataItem ()
  extends typings.sharepoint.SP.Social.SocialDataItem {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Identifies the user.  */
  /* CompleteClass */
  override def get_accountName(): String = js.native
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  /* CompleteClass */
  override def get_itemType(): typings.sharepoint.SP.Social.SocialDataItemType = js.native
  /** Identifies the tag.  */
  /* CompleteClass */
  override def get_tagGuid(): String = js.native
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  /* CompleteClass */
  override def get_text(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Identifies the site, document, or link.  */
  /* CompleteClass */
  override def get_uri(): String = js.native
  /** Identifies the user.  */
  /* CompleteClass */
  override def set_accountName(value: String): String = js.native
  /** Specifies whether the item being inserted is a user, document, site, tag, or link. */
  /* CompleteClass */
  override def set_itemType(value: typings.sharepoint.SP.Social.SocialDataItemType): typings.sharepoint.SP.Social.SocialDataItemType = js.native
  /** Identifies the tag.  */
  /* CompleteClass */
  override def set_tagGuid(value: String): String = js.native
  /** Specifies the plain text to be inserted in the created post. The server can use the specified text or can use text that identifies the item, for example the name specified in a user profile.  */
  /* CompleteClass */
  override def set_text(value: String): String = js.native
  /** Identifies the site, document, or link.  */
  /* CompleteClass */
  override def set_uri(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


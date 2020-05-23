package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a followed content resource. */
trait FollowedItem extends ClientValueObject {
  /** Additional metadata associated with this item */
  def get_data(): StringDictionary[js.Any]
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def get_fileType(): String
  /** Provides information about the application that opens a followed document. */
  def get_fileTypeProgid(): String
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def get_flags(): String
  /** Indicates whether the followed site has a feed. */
  def get_hasFeed(): Boolean
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def get_hidden(): Boolean
  /** Specifies the URL of an icon to represent this item. */
  def get_iconUrl(): String
  /** Specifies the identification for this item in the Content database. */
  def get_itemId(): Double
  /** Specifies the type of this item. */
  def get_itemType(): FollowedItemType
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def get_listId(): String
  /** Specifies the URL of this item's parent list or web. */
  def get_parentUrl(): String
  /** Provides information about the followed document to the application that opens it. */
  def get_serverUrlProgid(): String
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def get_siteId(): String
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def get_subtype(): Double
  /** Specifies the item of this item */
  def get_title(): String
  /** Specifies the GUID for this item in the Content database. */
  def get_uniqueId(): Guid
  /** Specifies the URL of this item. */
  def get_url(): String
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def get_webId(): Guid
  /** Additional metadata associated with this item */
  def set_data(value: StringDictionary[js.Any]): StringDictionary[js.Any]
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def set_fileType(value: String): String
  /** Provides information about the application that opens a followed document. */
  def set_fileTypeProgid(value: String): String
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def set_flags(value: String): String
  /** Indicates whether the followed site has a feed. */
  def set_hasFeed(value: Boolean): Boolean
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def set_hidden(value: Boolean): Boolean
  /** Specifies the URL of an icon to represent this item. */
  def set_iconUrl(value: String): String
  /** Specifies the identification for this item in the Content database. */
  def set_itemId(value: Double): Double
  /** Specifies the type of this item. */
  def set_itemType(value: FollowedItemType): FollowedItemType
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def set_listId(value: String): String
  /** Specifies the URL of this item's parent list or web. */
  def set_parentUrl(value: String): String
  /** Provides information about the followed document to the application that opens it. */
  def set_serverUrlProgid(value: String): String
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def set_siteId(value: String): String
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def set_subtype(value: Double): Double
  /** Specifies the item of this item */
  def set_title(value: String): String
  /** Specifies the GUID for this item in the Content database. */
  def set_uniqueId(value: Guid): Guid
  /** Specifies the URL of this item. */
  def set_url(value: String): String
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def set_webId(value: Guid): js.Any
}

object FollowedItem {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_data: () => StringDictionary[js.Any],
    get_fileType: () => String,
    get_fileTypeProgid: () => String,
    get_flags: () => String,
    get_hasFeed: () => Boolean,
    get_hidden: () => Boolean,
    get_iconUrl: () => String,
    get_itemId: () => Double,
    get_itemType: () => FollowedItemType,
    get_listId: () => String,
    get_parentUrl: () => String,
    get_serverUrlProgid: () => String,
    get_siteId: () => String,
    get_subtype: () => Double,
    get_title: () => String,
    get_typeId: () => String,
    get_uniqueId: () => Guid,
    get_url: () => String,
    get_webId: () => Guid,
    set_data: StringDictionary[js.Any] => StringDictionary[js.Any],
    set_fileType: String => String,
    set_fileTypeProgid: String => String,
    set_flags: String => String,
    set_hasFeed: Boolean => Boolean,
    set_hidden: Boolean => Boolean,
    set_iconUrl: String => String,
    set_itemId: Double => Double,
    set_itemType: FollowedItemType => FollowedItemType,
    set_listId: String => String,
    set_parentUrl: String => String,
    set_serverUrlProgid: String => String,
    set_siteId: String => String,
    set_subtype: Double => Double,
    set_title: String => String,
    set_uniqueId: Guid => Guid,
    set_url: String => String,
    set_webId: Guid => js.Any,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FollowedItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_data = js.Any.fromFunction0(get_data), get_fileType = js.Any.fromFunction0(get_fileType), get_fileTypeProgid = js.Any.fromFunction0(get_fileTypeProgid), get_flags = js.Any.fromFunction0(get_flags), get_hasFeed = js.Any.fromFunction0(get_hasFeed), get_hidden = js.Any.fromFunction0(get_hidden), get_iconUrl = js.Any.fromFunction0(get_iconUrl), get_itemId = js.Any.fromFunction0(get_itemId), get_itemType = js.Any.fromFunction0(get_itemType), get_listId = js.Any.fromFunction0(get_listId), get_parentUrl = js.Any.fromFunction0(get_parentUrl), get_serverUrlProgid = js.Any.fromFunction0(get_serverUrlProgid), get_siteId = js.Any.fromFunction0(get_siteId), get_subtype = js.Any.fromFunction0(get_subtype), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_uniqueId = js.Any.fromFunction0(get_uniqueId), get_url = js.Any.fromFunction0(get_url), get_webId = js.Any.fromFunction0(get_webId), set_data = js.Any.fromFunction1(set_data), set_fileType = js.Any.fromFunction1(set_fileType), set_fileTypeProgid = js.Any.fromFunction1(set_fileTypeProgid), set_flags = js.Any.fromFunction1(set_flags), set_hasFeed = js.Any.fromFunction1(set_hasFeed), set_hidden = js.Any.fromFunction1(set_hidden), set_iconUrl = js.Any.fromFunction1(set_iconUrl), set_itemId = js.Any.fromFunction1(set_itemId), set_itemType = js.Any.fromFunction1(set_itemType), set_listId = js.Any.fromFunction1(set_listId), set_parentUrl = js.Any.fromFunction1(set_parentUrl), set_serverUrlProgid = js.Any.fromFunction1(set_serverUrlProgid), set_siteId = js.Any.fromFunction1(set_siteId), set_subtype = js.Any.fromFunction1(set_subtype), set_title = js.Any.fromFunction1(set_title), set_uniqueId = js.Any.fromFunction1(set_uniqueId), set_url = js.Any.fromFunction1(set_url), set_webId = js.Any.fromFunction1(set_webId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FollowedItem]
  }
}


package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a followed content resource. */
@JSGlobal("SP.UserProfiles.FollowedItem")
@js.native
class FollowedItem ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** Additional metadata associated with this item */
  def get_data(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def get_fileType(): java.lang.String = js.native
  /** Provides information about the application that opens a followed document. */
  def get_fileTypeProgid(): java.lang.String = js.native
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def get_flags(): java.lang.String = js.native
  /** Indicates whether the followed site has a feed. */
  def get_hasFeed(): scala.Boolean = js.native
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def get_hidden(): scala.Boolean = js.native
  /** Specifies the URL of an icon to represent this item. */
  def get_iconUrl(): java.lang.String = js.native
  /** Specifies the identification for this item in the Content database. */
  def get_itemId(): scala.Double = js.native
  /** Specifies the type of this item. */
  def get_itemType(): FollowedItemType = js.native
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def get_listId(): java.lang.String = js.native
  /** Specifies the URL of this item's parent list or web. */
  def get_parentUrl(): java.lang.String = js.native
  /** Provides information about the followed document to the application that opens it. */
  def get_serverUrlProgid(): java.lang.String = js.native
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def get_siteId(): java.lang.String = js.native
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def get_subtype(): scala.Double = js.native
  /** Specifies the item of this item */
  def get_title(): java.lang.String = js.native
  /** Specifies the GUID for this item in the Content database. */
  def get_uniqueId(): sharepointLib.SPNs.Guid = js.native
  /** Specifies the URL of this item. */
  def get_url(): java.lang.String = js.native
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def get_webId(): sharepointLib.SPNs.Guid = js.native
  /** Additional metadata associated with this item */
  def set_data(value: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /** Specifies the type of the file if this item is a file. Otherwise, this property is the empty string. */
  def set_fileType(value: java.lang.String): java.lang.String = js.native
  /** Provides information about the application that opens a followed document. */
  def set_fileTypeProgid(value: java.lang.String): java.lang.String = js.native
  /** Specifies additional information about the followed item.
    The server stores the data so that it can return it to the client. */
  def set_flags(value: java.lang.String): java.lang.String = js.native
  /** Indicates whether the followed site has a feed. */
  def set_hasFeed(value: scala.Boolean): scala.Boolean = js.native
  /** Specifies if the item is hidden from the user. If true this item will not generate activity in the user's feed. */
  def set_hidden(value: scala.Boolean): scala.Boolean = js.native
  /** Specifies the URL of an icon to represent this item. */
  def set_iconUrl(value: java.lang.String): java.lang.String = js.native
  /** Specifies the identification for this item in the Content database. */
  def set_itemId(value: scala.Double): scala.Double = js.native
  /** Specifies the type of this item. */
  def set_itemType(value: FollowedItemType): FollowedItemType = js.native
  /** The ListId property specifies the list identification (GUID) for this item in the Content database if this item is a list or the list identification for its parent list.
    If the ItemType is Document, this property is specified, but if the ItemType is Site, then this property is not specified. */
  def set_listId(value: java.lang.String): java.lang.String = js.native
  /** Specifies the URL of this item's parent list or web. */
  def set_parentUrl(value: java.lang.String): java.lang.String = js.native
  /** Provides information about the followed document to the application that opens it. */
  def set_serverUrlProgid(value: java.lang.String): java.lang.String = js.native
  /** Specifies the site identification (GUID) in the Content database for this item if this item is a site, or for its parent site if this item is not a site. */
  def set_siteId(value: java.lang.String): java.lang.String = js.native
  /** Specifies the subtype of this item.
    If the ItemType is Site, the Subtype specifies the web template identification.
    If the ItemType is Document, the Subtype has a value of 1. */
  def set_subtype(value: scala.Double): scala.Double = js.native
  /** Specifies the item of this item */
  def set_title(value: java.lang.String): java.lang.String = js.native
  /** Specifies the GUID for this item in the Content database. */
  def set_uniqueId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  /** Specifies the URL of this item. */
  def set_url(value: java.lang.String): java.lang.String = js.native
  /** Specifies the site identification (GUID) in the Content database for this item if it is a site, or the identification of its parent site if this item is a document. */
  def set_webId(value: sharepointLib.SPNs.Guid): js.Any = js.native
}


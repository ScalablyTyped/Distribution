package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.IntResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to followed content items. */
@js.native
trait FollowedContent extends ClientObject {
  /** Finds the original item that is being pointed to in the Followed Content list and updates the Title, Url, and IconUrl fields if they have been changed.
    @param url The URL of the original item as stored in the Followed Content list. */
  def findAndUpdateFollowedItem(url: String): FollowedItem = js.native
  /** The Follow method adds the specified document or site to the list of followed content.
    @param url  URL that identifies the item to follow.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId>
    @param data Optional parameter that holds application-defined data for the item.
    */
  def follow(url: String): FollowResult = js.native
  def follow(url: String, data: FollowedItemData): FollowResult = js.native
  /** The FollowItem method is reserved for server-to-server use only.
    The server sets the specified item to be followed by the current user.
    This method cannot be called from the client. */
  def followItem(item: FollowedItem): FollowResult = js.native
  /** Retrieves the followed status of the specified document or site.
    Returns a value of type FollowedStatus, wrapped into a SP.IntResult object.
    @param url  URL that identifies the followed item.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId> */
  def getFollowedStatus(url: String): IntResult = js.native
  /** Returns the followed item identified by a given URL or returns null if the item does not exist.
    @param url  URL that identifies the followed item.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId> */
  def getItem(url: String): FollowedItem = js.native
  /** Returns an array of zero or more followed items described by the type and subtype parameters.
    @param options Describes the type of item to return.
    @param subType Integer that identifies the sites to return by the web template. */
  def getItems(options: FollowedContentQueryOptions, subtype: Double): js.Array[FollowedItem] = js.native
  /** Gets the location of the followed sites view */
  def get_followedDocumentsUrl(): String = js.native
  /** Gets the location of the followed documents view. */
  def get_followedSitesUrl(): String = js.native
  /** Determines if the specified document or site is being followed.
    @param url  URL that identifies the item that is supposed to be followed.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId> */
  def isFollowed(url: String): BooleanResult = js.native
  /** Returns the refreshed item that is being pointed to in the Social list.
    @param item The original item as stored in the Followed Content list. */
  def refreshFollowedItem(item: FollowedItem): FollowedItem = js.native
  /** Removes the specified document or site from list of followed content.
    @param url  URL that identifies the item to stop following.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId> */
  def stopFollowing(url: String): Unit = js.native
  /** Updates the properties for followed item with specified URL.
    @param url  URL that identifies the followed item.
    The url parameter can identify an existing document or site using the url property of the original item.
    The url parameter can also identify a document with the following format: http:// host/site?listId=<listGuid>&itemId=<itemId>
    @param data Application-defined data stored with the followed item. */
  def updateData(url: String, data: FollowedItemData): Unit = js.native
}


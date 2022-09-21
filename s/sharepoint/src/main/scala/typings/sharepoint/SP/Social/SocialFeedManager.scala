package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.IntResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to social feeds.
  It provides methods to create posts, delete posts, read posts, and perform other operations on posts. */
@js.native
trait SocialFeedManager
  extends StObject
     with ClientObject {
  
  /** Creates an image attachment for a future post. */
  def createImageAttachment(name: String, description: String, imageData: Any): SocialAttachment = js.native
  
  /** Creates a post in the current user's newsfeed, in the specified user's feed, or in the specified thread.
    This method returns a new or a modified thread.
    @param targetId Optional, specifies the target of the post.
    If this parameter is null, the post is created as a root post in the current user's feed.
    If this parameter is set to a site URL or a site actor identification, the post is created as a root post in the specified site feed.
    If this parameter is set to a thread identification, the post is created as a reply post in the specified thread.
    @param creationData Specifies the format and content of the post. */
  def createPost(targetId: String, creationData: SocialPostCreationData): SocialThread = js.native
  
  /** Deletes the specified post.
    This method returns a digest of the modified thread.
    If the entire thread is deleted, this method returns null.
    If the post being deleted is the root post of a thread, all reply posts are also deleted.
    @param postId   Specifies the post to be deleted.
    Corresponds the value returned from SocialPost.get_id(). */
  def deletePost(postId: String): SocialThread = js.native
  
  /** Returns the set of users who have liked the specified post.
    @param postId   Specifies the post being queried for information about users that like the post.
    Corresponds the value returned from SocialPost.get_id().*/
  def getAllLikers(postId: String): js.Array[SocialActor] = js.native
  
  /** Returns a feed for the current user.
    The feed consists of an array of message threads.
    Each thread consists of a root post and an array of reply posts. */
  def getFeed(`type`: SocialFeedType, options: SocialFeedOptions): SocialFeed = js.native
  
  /** Returns the public feed for a user or for a site.
    The feed lists activity by the user and posts created by the server for that user.
    For example, the feed can include posts indicating the user's birthday or indicating that the user liked a post.
    @param actorId  Corresponds to the value returned by SocialActor.get_id().
    If the actorId specifies the current user, this method returns the public feed for the current user. */
  def getFeedFor(actorId: String, options: SocialFeedOptions): SocialFeed = js.native
  
  /** Returns the root post and all reply posts in the thread. */
  def getFullThread(threadId: String): SocialThread = js.native
  
  /** Returns a feed containing mention reference threads from the current user's personal feed. */
  def getMentions(clearUnreadMentions: Boolean, options: SocialFeedOptions): SocialFeed = js.native
  
  /** Generates a preview for the content specified by the URL. */
  def getPreview(itemUrl: String): SocialAttachment = js.native
  
  /** Returns the preview image data for an image attachment.
    @param url Specifies the URL of the preview image relative to the personal site portal.
    @param key Specifies the URL-encoded key to decrypt the image.
    @param iv Specifies the URL-encoded initialization vector for decrypting the image. */
  def getPreviewImage(url: String, key: String, iv: String): Any = js.native
  
  /** Returns the server's count of unread mentions of the current user.
    The server maintains a count of unread mentions in posts, but does not track which mentions have been read.
    When a new mention is stored on the server, it increments the unread mention for the user specified by the mention.
    The unread mention count is cleared by the GetMentions method. */
  def getUnreadMentionCount(): IntResult = js.native
  
  /** Returns the current user */
  def get_owner(): SocialActor = js.native
  
  /** Specifies the URI of the personal site portal. */
  def get_personalSitePortalUri(): String = js.native
  
  /** Specifies that the current user likes the specified post.
    Returns a digest thread containing the specified post.
    A digest thread contains the root post and a selection of reply posts */
  def likePost(postId: String): SocialThread = js.native
  
  /** Prevents any user from adding a new reply post to the specified thread.
    Once a thread is locked, no new reply posts can be added until after the thread has been unlocked with the unlockThread method.
    This method returns a digest of the locked thread */
  def lockThread(threadId: String): SocialThread = js.native
  
  /** Suppresses activity notifications for the current user of updates to the specified thread. */
  def suppressThreadNotifications(threadId: String): Unit = js.native
  
  /** Specifies that the current user does not like the specified post.
    Returns a digest thread containing the specified post.  */
  def unlikePost(postId: String): SocialThread = js.native
  
  /** Allows users to add new reply posts to the specified thread. */
  def unlockThread(threadId: String): SocialThread = js.native
}

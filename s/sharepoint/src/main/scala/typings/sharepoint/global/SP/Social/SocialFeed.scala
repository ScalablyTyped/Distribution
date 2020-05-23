package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
@JSGlobal("SP.Social.SocialFeed")
@js.native
class SocialFeed ()
  extends typings.sharepoint.SP.Social.SocialFeed {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies attributes of the returned feed.
    The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
  /* CompleteClass */
  override def get_attributes(): typings.sharepoint.SP.Social.SocialFeedAttributes = js.native
  /** Returns the date-time of the most recent post that was requested.
    The most recent post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property. */
  /* CompleteClass */
  override def get_newestProcessed(): String = js.native
  /** The OldestProcessed property returns the date-time of the oldest post that was requested.
    The oldest post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property */
  /* CompleteClass */
  override def get_oldestProcessed(): String = js.native
  /** Contains the social threads in the feed. */
  /* CompleteClass */
  override def get_threads(): js.Array[typings.sharepoint.SP.Social.SocialThread] = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
  /* CompleteClass */
  override def get_unreadMentionCount(): Double = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


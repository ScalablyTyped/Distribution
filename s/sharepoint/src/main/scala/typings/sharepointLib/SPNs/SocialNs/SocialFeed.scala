package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
@JSGlobal("SP.Social.SocialFeed")
@js.native
class SocialFeed ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** Specifies attributes of the returned feed.
    The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
  def get_attributes(): SocialFeedAttributes = js.native
  /** Returns the date-time of the most recent post that was requested.
    The most recent post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property. */
  def get_newestProcessed(): java.lang.String = js.native
  /** The OldestProcessed property returns the date-time of the oldest post that was requested.
    The oldest post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property */
  def get_oldestProcessed(): java.lang.String = js.native
  /** Contains the social threads in the feed. */
  def get_threads(): js.Array[SocialThread] = js.native
  /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
  def get_unreadMentionCount(): scala.Double = js.native
}


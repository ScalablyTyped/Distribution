package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
@js.native
trait SocialFeed extends ClientValueObject {
  /** Specifies attributes of the returned feed.
    The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
  def get_attributes(): SocialFeedAttributes = js.native
  /** Returns the date-time of the most recent post that was requested.
    The most recent post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property. */
  def get_newestProcessed(): String = js.native
  /** The OldestProcessed property returns the date-time of the oldest post that was requested.
    The oldest post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property */
  def get_oldestProcessed(): String = js.native
  /** Contains the social threads in the feed. */
  def get_threads(): js.Array[SocialThread] = js.native
  /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
  def get_unreadMentionCount(): Double = js.native
}

object SocialFeed {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_attributes: () => SocialFeedAttributes,
    get_newestProcessed: () => String,
    get_oldestProcessed: () => String,
    get_threads: () => js.Array[SocialThread],
    get_typeId: () => String,
    get_unreadMentionCount: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialFeed = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_attributes = js.Any.fromFunction0(get_attributes), get_newestProcessed = js.Any.fromFunction0(get_newestProcessed), get_oldestProcessed = js.Any.fromFunction0(get_oldestProcessed), get_threads = js.Any.fromFunction0(get_threads), get_typeId = js.Any.fromFunction0(get_typeId), get_unreadMentionCount = js.Any.fromFunction0(get_unreadMentionCount), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialFeed]
  }
  @scala.inline
  implicit class SocialFeedOps[Self <: SocialFeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_attributes(value: () => SocialFeedAttributes): Self = this.set("get_attributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_newestProcessed(value: () => String): Self = this.set("get_newestProcessed", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_oldestProcessed(value: () => String): Self = this.set("get_oldestProcessed", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_threads(value: () => js.Array[SocialThread]): Self = this.set("get_threads", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_unreadMentionCount(value: () => Double): Self = this.set("get_unreadMentionCount", js.Any.fromFunction0(value))
  }
  
}


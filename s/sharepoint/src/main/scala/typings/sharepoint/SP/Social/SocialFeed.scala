package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a feed, which contains an array of SocialThreads, each of which specifies a root SocialPost object and an array of response SocialPost objects. */
trait SocialFeed
  extends StObject
     with ClientValueObject {
  
  /** Specifies attributes of the returned feed.
    The attributes specify if the requested feed has additional threads that were not included in the returned thread. */
  def get_attributes(): SocialFeedAttributes
  
  /** Returns the date-time of the most recent post that was requested.
    The most recent post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property. */
  def get_newestProcessed(): String
  
  /** The OldestProcessed property returns the date-time of the oldest post that was requested.
    The oldest post that was requested can be removed from the feed if the current user does not have access to it.
    Consequently, the feed does not always contain the post with the date specified in this property */
  def get_oldestProcessed(): String
  
  /** Contains the social threads in the feed. */
  def get_threads(): js.Array[SocialThread]
  
  /** Returns the number of mentions of the current user that have been added to the feed on the server since the time that the unread mention count was cleared for the current user. */
  def get_unreadMentionCount(): Double
}
object SocialFeed {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
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
  implicit open class MutableBuilder[Self <: SocialFeed] (val x: Self) extends AnyVal {
    
    inline def setGet_attributes(value: () => SocialFeedAttributes): Self = StObject.set(x, "get_attributes", js.Any.fromFunction0(value))
    
    inline def setGet_newestProcessed(value: () => String): Self = StObject.set(x, "get_newestProcessed", js.Any.fromFunction0(value))
    
    inline def setGet_oldestProcessed(value: () => String): Self = StObject.set(x, "get_oldestProcessed", js.Any.fromFunction0(value))
    
    inline def setGet_threads(value: () => js.Array[SocialThread]): Self = StObject.set(x, "get_threads", js.Any.fromFunction0(value))
    
    inline def setGet_unreadMentionCount(value: () => Double): Self = StObject.set(x, "get_unreadMentionCount", js.Any.fromFunction0(value))
  }
}

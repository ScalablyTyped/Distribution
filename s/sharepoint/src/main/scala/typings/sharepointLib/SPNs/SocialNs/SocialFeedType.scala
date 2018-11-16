package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedType extends js.Object

/** Identifies the kind of post to be retrieved.  */
@JSGlobal("SP.Social.SocialFeedType")
@js.native
object SocialFeedType extends js.Object {
  @js.native
  sealed trait everyone
    extends sharepointLib.SPNs.SocialNs.SocialFeedType
  
  @js.native
  sealed trait likes
    extends sharepointLib.SPNs.SocialNs.SocialFeedType
  
  @js.native
  sealed trait news
    extends sharepointLib.SPNs.SocialNs.SocialFeedType
  
  @js.native
  sealed trait personal
    extends sharepointLib.SPNs.SocialNs.SocialFeedType
  
  @js.native
  sealed trait timeline
    extends sharepointLib.SPNs.SocialNs.SocialFeedType
  
  val everyone: everyone with java.lang.String = js.native
  val likes: likes with java.lang.String = js.native
  val news: news with java.lang.String = js.native
  val personal: personal with java.lang.String = js.native
  val timeline: timeline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialFeedType with java.lang.String] = js.native
}


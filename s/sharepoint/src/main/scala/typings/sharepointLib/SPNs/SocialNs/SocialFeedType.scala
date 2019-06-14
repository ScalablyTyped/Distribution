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
  
  /* 4 */ val everyone: everyone with scala.Double = js.native
  /* 3 */ val likes: likes with scala.Double = js.native
  /* 1 */ val news: news with scala.Double = js.native
  /* 0 */ val personal: personal with scala.Double = js.native
  /* 2 */ val timeline: timeline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialFeedType with scala.Double] = js.native
}


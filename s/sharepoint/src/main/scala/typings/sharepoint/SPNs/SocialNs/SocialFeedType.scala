package typings.sharepoint.SPNs.SocialNs

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
  sealed trait everyone extends SocialFeedType
  
  @js.native
  sealed trait likes extends SocialFeedType
  
  @js.native
  sealed trait news extends SocialFeedType
  
  @js.native
  sealed trait personal extends SocialFeedType
  
  @js.native
  sealed trait timeline extends SocialFeedType
  
  /* 4 */ val everyone: typings.sharepoint.SPNs.SocialNs.SocialFeedType.everyone with Double = js.native
  /* 3 */ val likes: typings.sharepoint.SPNs.SocialNs.SocialFeedType.likes with Double = js.native
  /* 1 */ val news: typings.sharepoint.SPNs.SocialNs.SocialFeedType.news with Double = js.native
  /* 0 */ val personal: typings.sharepoint.SPNs.SocialNs.SocialFeedType.personal with Double = js.native
  /* 2 */ val timeline: typings.sharepoint.SPNs.SocialNs.SocialFeedType.timeline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedType with Double] = js.native
}


package typings.sharepoint.SP.Social

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
  
  /* 4 */ val everyone: typings.sharepoint.SP.Social.SocialFeedType.everyone with Double = js.native
  /* 3 */ val likes: typings.sharepoint.SP.Social.SocialFeedType.likes with Double = js.native
  /* 1 */ val news: typings.sharepoint.SP.Social.SocialFeedType.news with Double = js.native
  /* 0 */ val personal: typings.sharepoint.SP.Social.SocialFeedType.personal with Double = js.native
  /* 2 */ val timeline: typings.sharepoint.SP.Social.SocialFeedType.timeline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedType with Double] = js.native
}


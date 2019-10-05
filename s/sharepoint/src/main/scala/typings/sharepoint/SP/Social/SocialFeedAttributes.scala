package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedAttributes extends js.Object

// For some reasons this enum doesn't exist
// enum SocialFollowResult {
//    ok = 0,
//    alreadyFollowing = 1,
//    limitReached = 2,
//    internalError = 3
// }
/** Provides information about the feed.
  This type provides information about whether the feed on the server contains additional threads that were not returned. */
@JSGlobal("SP.Social.SocialFeedAttributes")
@js.native
object SocialFeedAttributes extends js.Object {
  @js.native
  sealed trait moreThreadsAvailable extends SocialFeedAttributes
  
  @js.native
  sealed trait none extends SocialFeedAttributes
  
  /* 1 */ val moreThreadsAvailable: typings.sharepoint.SP.Social.SocialFeedAttributes.moreThreadsAvailable with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.Social.SocialFeedAttributes.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedAttributes with Double] = js.native
}


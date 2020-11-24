package typings.sharepoint.global.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Social.SocialFeedAttributes with Double] = js.native
  
  /* 1 */ val moreThreadsAvailable: typings.sharepoint.SP.Social.SocialFeedAttributes.moreThreadsAvailable with Double = js.native
  
  /* 0 */ val none: typings.sharepoint.SP.Social.SocialFeedAttributes.none with Double = js.native
}

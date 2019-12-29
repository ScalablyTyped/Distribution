package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedAttributes with Double] = js.native
  /* 1 */ @js.native
  object moreThreadsAvailable extends TopLevel[moreThreadsAvailable with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}


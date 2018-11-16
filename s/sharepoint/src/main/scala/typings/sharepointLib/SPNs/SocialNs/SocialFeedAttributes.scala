package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait moreThreadsAvailable
    extends sharepointLib.SPNs.SocialNs.SocialFeedAttributes
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.SocialNs.SocialFeedAttributes
  
  val moreThreadsAvailable: moreThreadsAvailable with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialFeedAttributes with java.lang.String] = js.native
}


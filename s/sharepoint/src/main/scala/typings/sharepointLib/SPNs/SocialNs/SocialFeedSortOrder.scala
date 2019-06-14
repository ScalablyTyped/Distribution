package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedSortOrder extends js.Object

/** Specifies whether the sort order is by creation time or modification time. */
@JSGlobal("SP.Social.SocialFeedSortOrder")
@js.native
object SocialFeedSortOrder extends js.Object {
  @js.native
  sealed trait byCreatedTime
    extends sharepointLib.SPNs.SocialNs.SocialFeedSortOrder
  
  @js.native
  sealed trait byModifiedTime
    extends sharepointLib.SPNs.SocialNs.SocialFeedSortOrder
  
  /* 1 */ val byCreatedTime: byCreatedTime with scala.Double = js.native
  /* 0 */ val byModifiedTime: byModifiedTime with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialFeedSortOrder with scala.Double] = js.native
}


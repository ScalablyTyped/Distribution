package typings.sharepoint.SP.Social

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
  sealed trait byCreatedTime extends SocialFeedSortOrder
  
  @js.native
  sealed trait byModifiedTime extends SocialFeedSortOrder
  
  /* 1 */ val byCreatedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byCreatedTime with Double = js.native
  /* 0 */ val byModifiedTime: typings.sharepoint.SP.Social.SocialFeedSortOrder.byModifiedTime with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedSortOrder with Double] = js.native
}


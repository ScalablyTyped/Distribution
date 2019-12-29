package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialFeedSortOrder with Double] = js.native
  /* 1 */ @js.native
  object byCreatedTime extends TopLevel[byCreatedTime with Double]
  
  /* 0 */ @js.native
  object byModifiedTime extends TopLevel[byModifiedTime with Double]
  
}


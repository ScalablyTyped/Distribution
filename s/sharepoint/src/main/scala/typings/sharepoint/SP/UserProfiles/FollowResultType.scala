package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowResultType extends js.Object

@JSGlobal("SP.UserProfiles.FollowResultType")
@js.native
object FollowResultType extends js.Object {
  /** The request failed. */
  @js.native
  sealed trait failed extends FollowResultType
  
  /** The request succeeded and the item is being followed. */
  @js.native
  sealed trait followed extends FollowResultType
  
  /** The request encountered the maximum follow limit. */
  @js.native
  sealed trait hitFollowLimit extends FollowResultType
  
  /** The item was already being followed by the current user so there is no change in status. */
  @js.native
  sealed trait refollowed extends FollowResultType
  
  /** Result is unknown */
  @js.native
  sealed trait unknown extends FollowResultType
  
  /* 4 */ val failed: typings.sharepoint.SP.UserProfiles.FollowResultType.failed with Double = js.native
  /* 1 */ val followed: typings.sharepoint.SP.UserProfiles.FollowResultType.followed with Double = js.native
  /* 3 */ val hitFollowLimit: typings.sharepoint.SP.UserProfiles.FollowResultType.hitFollowLimit with Double = js.native
  /* 2 */ val refollowed: typings.sharepoint.SP.UserProfiles.FollowResultType.refollowed with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SP.UserProfiles.FollowResultType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowResultType with Double] = js.native
}


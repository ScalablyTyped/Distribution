package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedStatus extends js.Object

@JSGlobal("SP.UserProfiles.FollowedStatus")
@js.native
object FollowedStatus extends js.Object {
  @js.native
  sealed trait followed extends FollowedStatus
  
  @js.native
  sealed trait notFollowable extends FollowedStatus
  
  @js.native
  sealed trait notFollowed extends FollowedStatus
  
  /* 0 */ val followed: typings.sharepoint.SP.UserProfiles.FollowedStatus.followed with Double = js.native
  /* 2 */ val notFollowable: typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowable with Double = js.native
  /* 1 */ val notFollowed: typings.sharepoint.SP.UserProfiles.FollowedStatus.notFollowed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedStatus with Double] = js.native
}


package typings.sharepoint.SPNs.UserProfilesNs

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
  
  /* 0 */ val followed: typings.sharepoint.SPNs.UserProfilesNs.FollowedStatus.followed with Double = js.native
  /* 2 */ val notFollowable: typings.sharepoint.SPNs.UserProfilesNs.FollowedStatus.notFollowable with Double = js.native
  /* 1 */ val notFollowed: typings.sharepoint.SPNs.UserProfilesNs.FollowedStatus.notFollowed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedStatus with Double] = js.native
}


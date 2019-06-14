package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedStatus extends js.Object

@JSGlobal("SP.UserProfiles.FollowedStatus")
@js.native
object FollowedStatus extends js.Object {
  @js.native
  sealed trait followed
    extends sharepointLib.SPNs.UserProfilesNs.FollowedStatus
  
  @js.native
  sealed trait notFollowable
    extends sharepointLib.SPNs.UserProfilesNs.FollowedStatus
  
  @js.native
  sealed trait notFollowed
    extends sharepointLib.SPNs.UserProfilesNs.FollowedStatus
  
  /* 0 */ val followed: followed with scala.Double = js.native
  /* 2 */ val notFollowable: notFollowable with scala.Double = js.native
  /* 1 */ val notFollowed: notFollowed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedStatus with scala.Double] = js.native
}


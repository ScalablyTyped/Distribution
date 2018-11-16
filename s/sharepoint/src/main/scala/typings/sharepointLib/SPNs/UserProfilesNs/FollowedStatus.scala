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
  
  val followed: followed with java.lang.String = js.native
  val notFollowable: notFollowable with java.lang.String = js.native
  val notFollowed: notFollowed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedStatus with java.lang.String] = js.native
}


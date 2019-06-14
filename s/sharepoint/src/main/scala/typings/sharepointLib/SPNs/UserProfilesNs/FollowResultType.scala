package typings
package sharepointLib.SPNs.UserProfilesNs

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
  sealed trait failed
    extends sharepointLib.SPNs.UserProfilesNs.FollowResultType
  
  /** The request succeeded and the item is being followed. */
  @js.native
  sealed trait followed
    extends sharepointLib.SPNs.UserProfilesNs.FollowResultType
  
  /** The request encountered the maximum follow limit. */
  @js.native
  sealed trait hitFollowLimit
    extends sharepointLib.SPNs.UserProfilesNs.FollowResultType
  
  /** The item was already being followed by the current user so there is no change in status. */
  @js.native
  sealed trait refollowed
    extends sharepointLib.SPNs.UserProfilesNs.FollowResultType
  
  /** Result is unknown */
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.UserProfilesNs.FollowResultType
  
  /* 4 */ val failed: failed with scala.Double = js.native
  /* 1 */ val followed: followed with scala.Double = js.native
  /* 3 */ val hitFollowLimit: hitFollowLimit with scala.Double = js.native
  /* 2 */ val refollowed: refollowed with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowResultType with scala.Double] = js.native
}


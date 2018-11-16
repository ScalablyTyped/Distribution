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
  
  val failed: failed with java.lang.String = js.native
  val followed: followed with java.lang.String = js.native
  val hitFollowLimit: hitFollowLimit with java.lang.String = js.native
  val refollowed: refollowed with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowResultType with java.lang.String] = js.native
}


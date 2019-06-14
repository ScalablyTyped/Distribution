package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedItemType extends js.Object

@JSGlobal("SP.UserProfiles.FollowedItemType")
@js.native
object FollowedItemType extends js.Object {
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UserProfilesNs.FollowedItemType
  
  @js.native
  sealed trait document
    extends sharepointLib.SPNs.UserProfilesNs.FollowedItemType
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.UserProfilesNs.FollowedItemType
  
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.UserProfilesNs.FollowedItemType
  
  /* 3 */ val all: all with scala.Double = js.native
  /* 1 */ val document: document with scala.Double = js.native
  /* 2 */ val site: site with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedItemType with scala.Double] = js.native
}


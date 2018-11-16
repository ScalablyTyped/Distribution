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
  
  val all: all with java.lang.String = js.native
  val document: document with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedItemType with java.lang.String] = js.native
}


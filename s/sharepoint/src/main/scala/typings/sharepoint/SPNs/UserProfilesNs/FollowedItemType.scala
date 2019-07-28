package typings.sharepoint.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedItemType extends js.Object

@JSGlobal("SP.UserProfiles.FollowedItemType")
@js.native
object FollowedItemType extends js.Object {
  @js.native
  sealed trait all extends FollowedItemType
  
  @js.native
  sealed trait document extends FollowedItemType
  
  @js.native
  sealed trait site extends FollowedItemType
  
  @js.native
  sealed trait unknown extends FollowedItemType
  
  /* 3 */ val all: typings.sharepoint.SPNs.UserProfilesNs.FollowedItemType.all with Double = js.native
  /* 1 */ val document: typings.sharepoint.SPNs.UserProfilesNs.FollowedItemType.document with Double = js.native
  /* 2 */ val site: typings.sharepoint.SPNs.UserProfilesNs.FollowedItemType.site with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SPNs.UserProfilesNs.FollowedItemType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedItemType with Double] = js.native
}


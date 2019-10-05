package typings.sharepoint.SP.UserProfiles

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
  
  /* 3 */ val all: typings.sharepoint.SP.UserProfiles.FollowedItemType.all with Double = js.native
  /* 1 */ val document: typings.sharepoint.SP.UserProfiles.FollowedItemType.document with Double = js.native
  /* 2 */ val site: typings.sharepoint.SP.UserProfiles.FollowedItemType.site with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SP.UserProfiles.FollowedItemType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedItemType with Double] = js.native
}


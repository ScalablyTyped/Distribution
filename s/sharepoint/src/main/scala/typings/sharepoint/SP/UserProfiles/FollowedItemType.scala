package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

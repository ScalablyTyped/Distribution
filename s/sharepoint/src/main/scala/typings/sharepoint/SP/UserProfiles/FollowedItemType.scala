package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowedItemType extends StObject
@JSGlobal("SP.UserProfiles.FollowedItemType")
@js.native
object FollowedItemType extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with FollowedItemType
  
  @js.native
  sealed trait document
    extends StObject
       with FollowedItemType
  
  @js.native
  sealed trait site
    extends StObject
       with FollowedItemType
  
  @js.native
  sealed trait unknown
    extends StObject
       with FollowedItemType
}

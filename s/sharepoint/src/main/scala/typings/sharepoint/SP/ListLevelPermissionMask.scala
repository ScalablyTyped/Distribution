package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelPermissionMask extends StObject
@JSGlobal("SP.ListLevelPermissionMask")
@js.native
object ListLevelPermissionMask extends StObject {
  
  // : 8,
  @js.native
  sealed trait approveItems extends ListLevelPermissionMask
  
  // : 128,
  @js.native
  sealed trait breakCheckout extends ListLevelPermissionMask
  
  // : 4,
  @js.native
  sealed trait deleteListItems extends ListLevelPermissionMask
  
  // : 64,
  @js.native
  sealed trait deleteVersions extends ListLevelPermissionMask
  
  // : 2,
  @js.native
  sealed trait editListItems extends ListLevelPermissionMask
  
  // : 1,
  @js.native
  sealed trait insertListItems extends ListLevelPermissionMask
  
  // : 512,
  @js.native
  sealed trait manageLists extends ListLevelPermissionMask
  
  // : 256,
  @js.native
  sealed trait managePersonalViews extends ListLevelPermissionMask
  
  // : 16,
  @js.native
  sealed trait openItems extends ListLevelPermissionMask
  
  @js.native
  sealed trait viewListItems extends ListLevelPermissionMask
  
  // : 32,
  @js.native
  sealed trait viewVersions extends ListLevelPermissionMask
}

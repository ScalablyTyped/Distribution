package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelPermissionMask extends StObject
@JSGlobal("SP.ListLevelPermissionMask")
@js.native
object ListLevelPermissionMask extends StObject {
  
  // : 8,
  @js.native
  sealed trait approveItems
    extends StObject
       with ListLevelPermissionMask
  
  // : 128,
  @js.native
  sealed trait breakCheckout
    extends StObject
       with ListLevelPermissionMask
  
  // : 4,
  @js.native
  sealed trait deleteListItems
    extends StObject
       with ListLevelPermissionMask
  
  // : 64,
  @js.native
  sealed trait deleteVersions
    extends StObject
       with ListLevelPermissionMask
  
  // : 2,
  @js.native
  sealed trait editListItems
    extends StObject
       with ListLevelPermissionMask
  
  // : 1,
  @js.native
  sealed trait insertListItems
    extends StObject
       with ListLevelPermissionMask
  
  // : 512,
  @js.native
  sealed trait manageLists
    extends StObject
       with ListLevelPermissionMask
  
  // : 256,
  @js.native
  sealed trait managePersonalViews
    extends StObject
       with ListLevelPermissionMask
  
  // : 16,
  @js.native
  sealed trait openItems
    extends StObject
       with ListLevelPermissionMask
  
  @js.native
  sealed trait viewListItems
    extends StObject
       with ListLevelPermissionMask
  
  // : 32,
  @js.native
  sealed trait viewVersions
    extends StObject
       with ListLevelPermissionMask
}

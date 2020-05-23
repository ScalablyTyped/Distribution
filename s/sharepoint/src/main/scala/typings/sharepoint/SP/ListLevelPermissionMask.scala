package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelPermissionMask extends js.Object

@JSGlobal("SP.ListLevelPermissionMask")
@js.native
object ListLevelPermissionMask extends js.Object {
   // : 16,
  @js.native
  sealed trait approveItems extends ListLevelPermissionMask
  
   // : 256,
  @js.native
  sealed trait breakCheckout extends ListLevelPermissionMask
  
   // : 8,
  @js.native
  sealed trait deleteListItems extends ListLevelPermissionMask
  
   // : 128,
  @js.native
  sealed trait deleteVersions extends ListLevelPermissionMask
  
   // : 4,
  @js.native
  sealed trait editListItems extends ListLevelPermissionMask
  
   // : 2,
  @js.native
  sealed trait insertListItems extends ListLevelPermissionMask
  
  @js.native
  sealed trait manageLists extends ListLevelPermissionMask
  
   // : 512,
  @js.native
  sealed trait managePersonalViews extends ListLevelPermissionMask
  
   // : 32,
  @js.native
  sealed trait openItems extends ListLevelPermissionMask
  
   // : 1,
  @js.native
  sealed trait viewListItems extends ListLevelPermissionMask
  
   // : 64,
  @js.native
  sealed trait viewVersions extends ListLevelPermissionMask
  
}


package typings.sharepoint.SPNs

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
  
  /* 4 */ val approveItems: typings.sharepoint.SPNs.ListLevelPermissionMask.approveItems with Double = js.native
  /* 8 */ val breakCheckout: typings.sharepoint.SPNs.ListLevelPermissionMask.breakCheckout with Double = js.native
  /* 3 */ val deleteListItems: typings.sharepoint.SPNs.ListLevelPermissionMask.deleteListItems with Double = js.native
  /* 7 */ val deleteVersions: typings.sharepoint.SPNs.ListLevelPermissionMask.deleteVersions with Double = js.native
  /* 2 */ val editListItems: typings.sharepoint.SPNs.ListLevelPermissionMask.editListItems with Double = js.native
  /* 1 */ val insertListItems: typings.sharepoint.SPNs.ListLevelPermissionMask.insertListItems with Double = js.native
  /* 10 */ val manageLists: typings.sharepoint.SPNs.ListLevelPermissionMask.manageLists with Double = js.native
  /* 9 */ val managePersonalViews: typings.sharepoint.SPNs.ListLevelPermissionMask.managePersonalViews with Double = js.native
  /* 5 */ val openItems: typings.sharepoint.SPNs.ListLevelPermissionMask.openItems with Double = js.native
  /* 0 */ val viewListItems: typings.sharepoint.SPNs.ListLevelPermissionMask.viewListItems with Double = js.native
  /* 6 */ val viewVersions: typings.sharepoint.SPNs.ListLevelPermissionMask.viewVersions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelPermissionMask with Double] = js.native
}


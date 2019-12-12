package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.ListLevelPermissionMask.approveItems
import typings.sharepoint.SP.ListLevelPermissionMask.breakCheckout
import typings.sharepoint.SP.ListLevelPermissionMask.deleteListItems
import typings.sharepoint.SP.ListLevelPermissionMask.deleteVersions
import typings.sharepoint.SP.ListLevelPermissionMask.editListItems
import typings.sharepoint.SP.ListLevelPermissionMask.insertListItems
import typings.sharepoint.SP.ListLevelPermissionMask.manageLists
import typings.sharepoint.SP.ListLevelPermissionMask.managePersonalViews
import typings.sharepoint.SP.ListLevelPermissionMask.openItems
import typings.sharepoint.SP.ListLevelPermissionMask.viewListItems
import typings.sharepoint.SP.ListLevelPermissionMask.viewVersions
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelPermissionMask with Double] = js.native
  /* 4 */ @js.native
  object approveItems extends TopLevel[approveItems with Double]
  
  /* 8 */ @js.native
  object breakCheckout extends TopLevel[breakCheckout with Double]
  
  /* 3 */ @js.native
  object deleteListItems extends TopLevel[deleteListItems with Double]
  
  /* 7 */ @js.native
  object deleteVersions extends TopLevel[deleteVersions with Double]
  
  /* 2 */ @js.native
  object editListItems extends TopLevel[editListItems with Double]
  
  /* 1 */ @js.native
  object insertListItems extends TopLevel[insertListItems with Double]
  
  /* 10 */ @js.native
  object manageLists extends TopLevel[manageLists with Double]
  
  /* 9 */ @js.native
  object managePersonalViews extends TopLevel[managePersonalViews with Double]
  
  /* 5 */ @js.native
  object openItems extends TopLevel[openItems with Double]
  
  /* 0 */ @js.native
  object viewListItems extends TopLevel[viewListItems with Double]
  
  /* 6 */ @js.native
  object viewVersions extends TopLevel[viewVersions with Double]
  
}


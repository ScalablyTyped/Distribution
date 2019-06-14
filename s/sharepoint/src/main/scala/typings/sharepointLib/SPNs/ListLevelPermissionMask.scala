package typings
package sharepointLib.SPNs

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
  sealed trait approveItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 256,
  @js.native
  sealed trait breakCheckout
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 8,
  @js.native
  sealed trait deleteListItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 128,
  @js.native
  sealed trait deleteVersions
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 4,
  @js.native
  sealed trait editListItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 2,
  @js.native
  sealed trait insertListItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
  @js.native
  sealed trait manageLists
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 512,
  @js.native
  sealed trait managePersonalViews
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 32,
  @js.native
  sealed trait openItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 1,
  @js.native
  sealed trait viewListItems
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
   // : 64,
  @js.native
  sealed trait viewVersions
    extends sharepointLib.SPNs.ListLevelPermissionMask
  
  /* 4 */ val approveItems: approveItems with scala.Double = js.native
  /* 8 */ val breakCheckout: breakCheckout with scala.Double = js.native
  /* 3 */ val deleteListItems: deleteListItems with scala.Double = js.native
  /* 7 */ val deleteVersions: deleteVersions with scala.Double = js.native
  /* 2 */ val editListItems: editListItems with scala.Double = js.native
  /* 1 */ val insertListItems: insertListItems with scala.Double = js.native
  /* 10 */ val manageLists: manageLists with scala.Double = js.native
  /* 9 */ val managePersonalViews: managePersonalViews with scala.Double = js.native
  /* 5 */ val openItems: openItems with scala.Double = js.native
  /* 0 */ val viewListItems: viewListItems with scala.Double = js.native
  /* 6 */ val viewVersions: viewVersions with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ListLevelPermissionMask with scala.Double] = js.native
}


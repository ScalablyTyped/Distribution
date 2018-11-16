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
  
  val approveItems: approveItems with java.lang.String = js.native
  val breakCheckout: breakCheckout with java.lang.String = js.native
  val deleteListItems: deleteListItems with java.lang.String = js.native
  val deleteVersions: deleteVersions with java.lang.String = js.native
  val editListItems: editListItems with java.lang.String = js.native
  val insertListItems: insertListItems with java.lang.String = js.native
  val manageLists: manageLists with java.lang.String = js.native
  val managePersonalViews: managePersonalViews with java.lang.String = js.native
  val openItems: openItems with java.lang.String = js.native
  val viewListItems: viewListItems with java.lang.String = js.native
  val viewVersions: viewVersions with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ListLevelPermissionMask with java.lang.String] = js.native
}


package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1EmployeeRole")
@js.native
object V1EmployeeRoleNs extends js.Object {
  @js.native
  sealed trait PermissionsEnum extends js.Object
  
  @js.native
  object PermissionsEnum extends js.Object {
    @js.native
    sealed trait REGISTER_ACCESS_SALES_HISTORY extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_APPLY_RESTRICTED_DISCOUNTS extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_CHANGE_SETTINGS extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_EDIT_ITEM extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_ISSUE_REFUNDS extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE extends PermissionsEnum
    
    @js.native
    sealed trait REGISTER_VIEW_SUMMARY_REPORTS extends PermissionsEnum
    
    /* "REGISTER_ACCESS_SALES_HISTORY" */ val REGISTER_ACCESS_SALES_HISTORY: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_ACCESS_SALES_HISTORY with String = js.native
    /* "REGISTER_APPLY_RESTRICTED_DISCOUNTS" */ val REGISTER_APPLY_RESTRICTED_DISCOUNTS: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_APPLY_RESTRICTED_DISCOUNTS with String = js.native
    /* "REGISTER_CHANGE_SETTINGS" */ val REGISTER_CHANGE_SETTINGS: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_CHANGE_SETTINGS with String = js.native
    /* "REGISTER_EDIT_ITEM" */ val REGISTER_EDIT_ITEM: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_EDIT_ITEM with String = js.native
    /* "REGISTER_ISSUE_REFUNDS" */ val REGISTER_ISSUE_REFUNDS: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_ISSUE_REFUNDS with String = js.native
    /* "REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE" */ val REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE with String = js.native
    /* "REGISTER_VIEW_SUMMARY_REPORTS" */ val REGISTER_VIEW_SUMMARY_REPORTS: typings.squareDashConnect.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum.REGISTER_VIEW_SUMMARY_REPORTS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PermissionsEnum with String] = js.native
  }
  
}


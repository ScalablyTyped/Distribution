package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait REGISTER_ACCESS_SALES_HISTORY
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_APPLY_RESTRICTED_DISCOUNTS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_CHANGE_SETTINGS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_EDIT_ITEM
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_ISSUE_REFUNDS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait REGISTER_VIEW_SUMMARY_REPORTS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    /* "REGISTER_ACCESS_SALES_HISTORY" */ val REGISTER_ACCESS_SALES_HISTORY: REGISTER_ACCESS_SALES_HISTORY with java.lang.String = js.native
    /* "REGISTER_APPLY_RESTRICTED_DISCOUNTS" */ val REGISTER_APPLY_RESTRICTED_DISCOUNTS: REGISTER_APPLY_RESTRICTED_DISCOUNTS with java.lang.String = js.native
    /* "REGISTER_CHANGE_SETTINGS" */ val REGISTER_CHANGE_SETTINGS: REGISTER_CHANGE_SETTINGS with java.lang.String = js.native
    /* "REGISTER_EDIT_ITEM" */ val REGISTER_EDIT_ITEM: REGISTER_EDIT_ITEM with java.lang.String = js.native
    /* "REGISTER_ISSUE_REFUNDS" */ val REGISTER_ISSUE_REFUNDS: REGISTER_ISSUE_REFUNDS with java.lang.String = js.native
    /* "REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE" */ val REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE: REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE with java.lang.String = js.native
    /* "REGISTER_VIEW_SUMMARY_REPORTS" */ val REGISTER_VIEW_SUMMARY_REPORTS: REGISTER_VIEW_SUMMARY_REPORTS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum with java.lang.String
      ] = js.native
  }
  
}


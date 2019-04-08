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
    sealed trait ACCESSSALESHISTORY
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait APPLYRESTRICTEDDISCOUNTS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait CHANGESETTINGS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait EDITITEM
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait ISSUEREFUNDS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait OPENCASHDRAWEROUTSIDESALE
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    @js.native
    sealed trait VIEWSUMMARYREPORTS
      extends squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum
    
    /* "REGISTER_ACCESS_SALES_HISTORY" */ val ACCESSSALESHISTORY: ACCESSSALESHISTORY with java.lang.String = js.native
    /* "REGISTER_APPLY_RESTRICTED_DISCOUNTS" */ val APPLYRESTRICTEDDISCOUNTS: APPLYRESTRICTEDDISCOUNTS with java.lang.String = js.native
    /* "REGISTER_CHANGE_SETTINGS" */ val CHANGESETTINGS: CHANGESETTINGS with java.lang.String = js.native
    /* "REGISTER_EDIT_ITEM" */ val EDITITEM: EDITITEM with java.lang.String = js.native
    /* "REGISTER_ISSUE_REFUNDS" */ val ISSUEREFUNDS: ISSUEREFUNDS with java.lang.String = js.native
    /* "REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE" */ val OPENCASHDRAWEROUTSIDESALE: OPENCASHDRAWEROUTSIDESALE with java.lang.String = js.native
    /* "REGISTER_VIEW_SUMMARY_REPORTS" */ val VIEWSUMMARYREPORTS: VIEWSUMMARYREPORTS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1EmployeeRoleNs.PermissionsEnum with java.lang.String
      ] = js.native
  }
  
}


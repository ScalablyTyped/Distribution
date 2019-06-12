package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SourceApplication")
@js.native
object SourceApplicationNs extends js.Object {
  @js.native
  sealed trait ProductEnum extends js.Object
  
  @js.native
  object ProductEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait BILLING
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait DASHBOARD
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait EXTERNAL_API
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait INVOICES
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait ITEM_LIBRARY_IMPORT
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait ONLINE_STORE
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait PAYROLL
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait SQUARE_POS
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: APPOINTMENTS with java.lang.String = js.native
    /* "BILLING" */ val BILLING: BILLING with java.lang.String = js.native
    /* "DASHBOARD" */ val DASHBOARD: DASHBOARD with java.lang.String = js.native
    /* "EXTERNAL_API" */ val EXTERNAL_API: EXTERNAL_API with java.lang.String = js.native
    /* "INVOICES" */ val INVOICES: INVOICES with java.lang.String = js.native
    /* "ITEM_LIBRARY_IMPORT" */ val ITEM_LIBRARY_IMPORT: ITEM_LIBRARY_IMPORT with java.lang.String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: ONLINE_STORE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "PAYROLL" */ val PAYROLL: PAYROLL with java.lang.String = js.native
    /* "SQUARE_POS" */ val SQUARE_POS: SQUARE_POS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum with java.lang.String
      ] = js.native
  }
  
}


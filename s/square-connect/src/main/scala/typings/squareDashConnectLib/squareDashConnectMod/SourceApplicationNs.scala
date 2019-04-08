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
    sealed trait EXTERNALAPI
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait INVOICES
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait ITEMLIBRARYIMPORT
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait ONLINESTORE
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait PAYROLL
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    @js.native
    sealed trait SQUAREPOS
      extends squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: APPOINTMENTS with java.lang.String = js.native
    /* "BILLING" */ val BILLING: BILLING with java.lang.String = js.native
    /* "DASHBOARD" */ val DASHBOARD: DASHBOARD with java.lang.String = js.native
    /* "EXTERNAL_API" */ val EXTERNALAPI: EXTERNALAPI with java.lang.String = js.native
    /* "INVOICES" */ val INVOICES: INVOICES with java.lang.String = js.native
    /* "ITEM_LIBRARY_IMPORT" */ val ITEMLIBRARYIMPORT: ITEMLIBRARYIMPORT with java.lang.String = js.native
    /* "ONLINE_STORE" */ val ONLINESTORE: ONLINESTORE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "PAYROLL" */ val PAYROLL: PAYROLL with java.lang.String = js.native
    /* "SQUARE_POS" */ val SQUAREPOS: SQUAREPOS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SourceApplicationNs.ProductEnum with java.lang.String
      ] = js.native
  }
  
}


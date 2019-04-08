package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Transaction")
@js.native
object TransactionNs extends js.Object {
  @js.native
  sealed trait ProductEnum extends js.Object
  
  @js.native
  object ProductEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait BILLING
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait EXTERNALAPI
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait INVOICES
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait ONLINESTORE
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait PAYROLL
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    @js.native
    sealed trait REGISTER
      extends squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: APPOINTMENTS with java.lang.String = js.native
    /* "BILLING" */ val BILLING: BILLING with java.lang.String = js.native
    /* "EXTERNAL_API" */ val EXTERNALAPI: EXTERNALAPI with java.lang.String = js.native
    /* "INVOICES" */ val INVOICES: INVOICES with java.lang.String = js.native
    /* "ONLINE_STORE" */ val ONLINESTORE: ONLINESTORE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "PAYROLL" */ val PAYROLL: PAYROLL with java.lang.String = js.native
    /* "REGISTER" */ val REGISTER: REGISTER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.TransactionNs.ProductEnum with java.lang.String
      ] = js.native
  }
  
}


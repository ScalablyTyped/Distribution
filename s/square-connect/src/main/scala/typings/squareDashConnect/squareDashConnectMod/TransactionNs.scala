package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum
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
    sealed trait APPOINTMENTS extends ProductEnum
    
    @js.native
    sealed trait BILLING extends ProductEnum
    
    @js.native
    sealed trait EXTERNAL_API extends ProductEnum
    
    @js.native
    sealed trait INVOICES extends ProductEnum
    
    @js.native
    sealed trait ONLINE_STORE extends ProductEnum
    
    @js.native
    sealed trait OTHER extends ProductEnum
    
    @js.native
    sealed trait PAYROLL extends ProductEnum
    
    @js.native
    sealed trait REGISTER extends ProductEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.APPOINTMENTS with String = js.native
    /* "BILLING" */ val BILLING: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.BILLING with String = js.native
    /* "EXTERNAL_API" */ val EXTERNAL_API: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.EXTERNAL_API with String = js.native
    /* "INVOICES" */ val INVOICES: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.INVOICES with String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.ONLINE_STORE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.OTHER with String = js.native
    /* "PAYROLL" */ val PAYROLL: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.PAYROLL with String = js.native
    /* "REGISTER" */ val REGISTER: typings.squareDashConnect.squareDashConnectMod.TransactionNs.ProductEnum.REGISTER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProductEnum with String] = js.native
  }
  
}


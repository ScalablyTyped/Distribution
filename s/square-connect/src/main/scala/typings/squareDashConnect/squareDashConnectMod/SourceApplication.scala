package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SourceApplication")
@js.native
class SourceApplication () extends js.Object {
  /**
    * Read-only Square ID assigned to the application. Only used for [Product](#type-product) type `EXTERNAL_API`.
    */
  var application_id: js.UndefOr[String] = js.native
  /**
    * Read-only display name assigned to the application (e.g. "Custom Application", "Square POS 4.74 for Android").
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Read-only [Product](#type-product) type for the application. See [Product](#type-product) for possible values.
    */
  var product: js.UndefOr[ProductEnum] = js.native
}

@JSImport("square-connect", "SourceApplication")
@js.native
object SourceApplication extends js.Object {
  @js.native
  sealed trait ProductEnum extends js.Object
  
  @js.native
  object ProductEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS extends ProductEnum
    
    @js.native
    sealed trait BILLING extends ProductEnum
    
    @js.native
    sealed trait DASHBOARD extends ProductEnum
    
    @js.native
    sealed trait EXTERNAL_API extends ProductEnum
    
    @js.native
    sealed trait INVOICES extends ProductEnum
    
    @js.native
    sealed trait ITEM_LIBRARY_IMPORT extends ProductEnum
    
    @js.native
    sealed trait ONLINE_STORE extends ProductEnum
    
    @js.native
    sealed trait OTHER extends ProductEnum
    
    @js.native
    sealed trait PAYROLL extends ProductEnum
    
    @js.native
    sealed trait SQUARE_POS extends ProductEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.APPOINTMENTS with String = js.native
    /* "BILLING" */ val BILLING: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.BILLING with String = js.native
    /* "DASHBOARD" */ val DASHBOARD: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.DASHBOARD with String = js.native
    /* "EXTERNAL_API" */ val EXTERNAL_API: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.EXTERNAL_API with String = js.native
    /* "INVOICES" */ val INVOICES: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.INVOICES with String = js.native
    /* "ITEM_LIBRARY_IMPORT" */ val ITEM_LIBRARY_IMPORT: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.ITEM_LIBRARY_IMPORT with String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.ONLINE_STORE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.OTHER with String = js.native
    /* "PAYROLL" */ val PAYROLL: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.PAYROLL with String = js.native
    /* "SQUARE_POS" */ val SQUARE_POS: typings.squareDashConnect.squareDashConnectMod.SourceApplication.ProductEnum.SQUARE_POS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProductEnum with String] = js.native
  }
  
}


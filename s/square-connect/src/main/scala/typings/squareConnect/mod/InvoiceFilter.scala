package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoiceFilter")
@js.native
open class InvoiceFilter () extends StObject {
  
  /**
    * Limits the search to the specified customers, within the specified locations.
    * Specifying a customer is optional. In the current implementation, a maximum of one customer can be specified.
    */
  var customer_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Limits the search to the specified locations. A location is required.
    * In the current implementation, only one location can be specified.
    */
  var location_ids: js.Array[String] = js.native
}

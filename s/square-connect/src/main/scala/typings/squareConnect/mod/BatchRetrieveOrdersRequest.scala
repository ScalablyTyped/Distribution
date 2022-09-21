package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveOrdersRequest")
@js.native
open class BatchRetrieveOrdersRequest () extends StObject {
  
  /**
    * The ID of the location for these orders.
    * This field is optional: omit it to retrieve orders within the scope of the current authorization's merchant ID.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the orders to retrieve. A maximum of 100 orders can be retrieved per request.
    */
  var order_ids: js.Array[String] = js.native
}

package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderEntry")
@js.native
open class OrderEntry () extends StObject {
  
  /**
    * The location id the Order belongs to.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The id of the Order.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * Version number which is incremented each time an update is committed to the order.
    * Orders that were not created through the API will not include a version and thus cannot be updated.
    * [Read more about working with versions](https://developer.squareup.com/docs/orders-api/manage-orders#update-orders).
    */
  var version: js.UndefOr[Double] = js.native
}

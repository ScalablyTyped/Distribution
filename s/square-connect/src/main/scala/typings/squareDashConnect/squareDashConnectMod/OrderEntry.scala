package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderEntry")
@js.native
class OrderEntry () extends js.Object {
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
    * [Read more about working with versions](/orders-api/manage-orders#update-orders).
    */
  var version: js.UndefOr[Double] = js.native
}


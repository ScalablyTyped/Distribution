package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchOrdersFulfillmentFilter")
@js.native
class SearchOrdersFulfillmentFilter () extends StObject {
  
  /**
    * List of `fulfillment states` to filter for. Will return orders if any of its fulfillments match any of the
    * fulfillment states listed in this field. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var fulfillment_states: js.UndefOr[js.Array[FulfillmentStateType]] = js.native
  
  /**
    * List of `fulfillment types` to filter for. Will return orders if any of its fulfillments match any of the fulfillment
    * types listed in this field. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values.
    */
  var fulfillment_types: js.UndefOr[js.Array[FulfillmentType]] = js.native
}

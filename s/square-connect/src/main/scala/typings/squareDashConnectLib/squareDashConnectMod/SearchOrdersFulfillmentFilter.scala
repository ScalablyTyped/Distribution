package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersFulfillmentFilter")
@js.native
class SearchOrdersFulfillmentFilter () extends js.Object {
  /**
    * List of [fulfillment states](#type-orderfulfillmentstate) to filter for.
    * Will return orders if any of its fulfillments match any of the fulfillment states listed in this field.
    * See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values.
    */
  var fulfillment_states: js.UndefOr[
    js.Array[
      squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    ]
  ] = js.native
  /**
    * List of [fulfillment types](#type-orderfulfillmenttype) to filter for.
    * Will return orders if any of its fulfillments match any of the fulfillment types listed in this field.
    * See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values.
    */
  var fulfillment_types: js.Array[
    squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentTypesEnum
  ] = js.native
}


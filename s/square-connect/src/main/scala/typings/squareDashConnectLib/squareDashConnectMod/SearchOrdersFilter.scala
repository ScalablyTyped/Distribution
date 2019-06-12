package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersFilter")
@js.native
class SearchOrdersFilter () extends js.Object {
  /**
    * Filter by customers associated with the order.
    */
  var customer_filter: js.UndefOr[SearchOrdersCustomerFilter] = js.native
  /**
    * Filter for results within a time range.
    */
  var date_time_filter: js.UndefOr[SearchOrdersDateTimeFilter] = js.native
  /**
    * Filter by fulfillment type or state.
    */
  var fulfillment_filter: js.UndefOr[SearchOrdersFulfillmentFilter] = js.native
  /**
    * Filter by source of order.
    */
  var source_filter: js.UndefOr[SearchOrdersSourceFilter] = js.native
  /**
    * Filter by [`OrderState`](#type-orderstate).
    */
  var state_filter: js.UndefOr[SearchOrdersStateFilter] = js.native
}


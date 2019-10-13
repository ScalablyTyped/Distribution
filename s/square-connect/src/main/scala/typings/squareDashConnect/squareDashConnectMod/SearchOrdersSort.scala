package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectStrings.CLOSED_AT
import typings.squareDashConnect.squareDashConnectStrings.CREATED_AT
import typings.squareDashConnect.squareDashConnectStrings.UPDATED_AT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersSort")
@js.native
class SearchOrdersSort () extends js.Object {
  /**
    * The field to sort by.
    * @note When using a [DateTimeFilter](#type-searchordersfilter), `sort_field` must match the timestamp field that
    * the DateTimeFilter uses to filter. For example, If you set your `sort_field` to `CLOSED_AT` and you use a
    * DateTimeFilter, your DateTimeFilter must filter for orders by their `CLOSED_AT` date. If this field does not
    * match the timestamp field in `DateTimeFilter`, SearchOrders will return an error. Default: `CREATED_AT`.
    * See [SearchOrdersSortField](#type-searchorderssortfield) for possible values.
    */
  var sort_field: CREATED_AT | UPDATED_AT | CLOSED_AT = js.native
  /**
    * The chronological order in which results are returned. Defaults to `DESC`.
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderType] = js.native
}


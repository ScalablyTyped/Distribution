package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCustomersRequest")
@js.native
class ListCustomersRequest () extends js.Object {
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of
    * results for your original query. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Indicates how Customers should be sorted. Default: `DEFAULT`.
    * See [CustomerSortField](#type-customersortfield) for possible values.
    */
  var sort_field: js.UndefOr[String] = js.native
  /**
    * Indicates whether Customers should be sorted in ascending (`ASC`) or descending (`DESC`) order. Default: `ASC`.
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderType] = js.native
}


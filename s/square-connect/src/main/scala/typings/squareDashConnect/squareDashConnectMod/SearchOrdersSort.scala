package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum
import typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersSort")
@js.native
class SearchOrdersSort () extends js.Object {
  /**
    * The field to sort by.
    * @important When using a [DateTimeFilter](#type-searchordersfilter), `sort_field` must match the set time range field.
    * If this field does not match the time range field in `DateTimeFilter`, SearchOrder will return an error.
    * Default: `CREATED_AT`. See [SearchOrdersSortField](#type-searchorderssortfield) for possible values.
    */
  var sort_field: SortFieldEnum = js.native
  /**
    * The order in which results are returned. Defaults to `DESC`. See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderEnum] = js.native
}


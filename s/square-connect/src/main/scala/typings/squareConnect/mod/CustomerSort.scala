package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerSort")
@js.native
class CustomerSort () extends js.Object {
  /**
    * Indicates the information used to sort the results. For example, by creation date. Default: `DEFAULT`.
    * See [CustomerSortField](#type-customersortfield) for possible values.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Indicates the order in which results should be displayed based on the value of the sort field. String comparisons
    * use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings. Default: `ASC`.
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderType] = js.native
}


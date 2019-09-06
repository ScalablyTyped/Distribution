package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerSortNs.FieldEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerSort")
@js.native
class CustomerSort () extends js.Object {
  /**
    * The field to sort the results on. It could be the total money spent at the merchant, the date of the first visit (etc).
    * See [CustomerSortField](#type-customersortfield) for possible values.
    */
  var field: js.UndefOr[FieldEnum] = js.native
  /**
    * Indicates the order in which results should be displayed based on the value of the sort field.
    * String comparisons use standard alphabetic comparison to determine order.
    * Strings representing numbers are sorted as strings. See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[SortOrderEnum] = js.native
}


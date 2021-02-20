package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomersRequest")
@js.native
class ListCustomersRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
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

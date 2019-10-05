package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ListCustomersRequest.SortFieldEnum
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
  var sort_field: js.UndefOr[SortFieldEnum] = js.native
  /**
    * Indicates whether Customers should be sorted in ascending (`ASC`) or descending (`DESC`) order. Default: `ASC`.
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderEnum] = js.native
}

@JSImport("square-connect", "ListCustomersRequest")
@js.native
object ListCustomersRequest extends js.Object {
  @js.native
  sealed trait SortFieldEnum extends js.Object
  
  @js.native
  object SortFieldEnum extends js.Object {
    @js.native
    sealed trait CREATED_AT extends SortFieldEnum
    
    @js.native
    sealed trait DEFAULT extends SortFieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequest.SortFieldEnum.CREATED_AT with String = js.native
    /* "DEFAULT" */ val DEFAULT: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequest.SortFieldEnum.DEFAULT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortFieldEnum with String] = js.native
  }
  
}


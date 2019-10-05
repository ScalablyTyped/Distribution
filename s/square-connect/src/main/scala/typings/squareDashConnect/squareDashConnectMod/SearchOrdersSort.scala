package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchOrdersSort.SortFieldEnum
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
  var sort_field: SortFieldEnum = js.native
  /**
    * The chronological order in which results are returned. Defaults to `DESC`.
    * See [SortOrder](#type-sortorder) for possible values.
    */
  var sort_order: js.UndefOr[SortOrderEnum] = js.native
}

@JSImport("square-connect", "SearchOrdersSort")
@js.native
object SearchOrdersSort extends js.Object {
  @js.native
  sealed trait SortFieldEnum extends js.Object
  
  @js.native
  object SortFieldEnum extends js.Object {
    @js.native
    sealed trait CLOSED_AT extends SortFieldEnum
    
    @js.native
    sealed trait CREATED_AT extends SortFieldEnum
    
    @js.native
    sealed trait UPDATED_AT extends SortFieldEnum
    
    /* "CLOSED_AT" */ val CLOSED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSort.SortFieldEnum.CLOSED_AT with String = js.native
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSort.SortFieldEnum.CREATED_AT with String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSort.SortFieldEnum.UPDATED_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortFieldEnum with String] = js.native
  }
  
}


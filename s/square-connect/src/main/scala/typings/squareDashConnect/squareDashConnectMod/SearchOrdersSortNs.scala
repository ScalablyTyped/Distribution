package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum
import typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersSort")
@js.native
object SearchOrdersSortNs extends js.Object {
  @js.native
  sealed trait SortFieldEnum extends js.Object
  
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortFieldEnum extends js.Object {
    @js.native
    sealed trait CLOSED_AT extends SortFieldEnum
    
    @js.native
    sealed trait CREATED_AT extends SortFieldEnum
    
    @js.native
    sealed trait UPDATED_AT extends SortFieldEnum
    
    /* "CLOSED_AT" */ val CLOSED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum.CLOSED_AT with String = js.native
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum.CREATED_AT with String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum.UPDATED_AT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortFieldEnum with String] = js.native
  }
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends SortOrderEnum
    
    @js.native
    sealed trait DESC extends SortOrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
  }
  
}


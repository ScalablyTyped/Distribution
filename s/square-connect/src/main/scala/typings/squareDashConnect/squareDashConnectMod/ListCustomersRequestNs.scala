package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum
import typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCustomersRequest")
@js.native
object ListCustomersRequestNs extends js.Object {
  @js.native
  sealed trait SortFieldEnum extends js.Object
  
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortFieldEnum extends js.Object {
    @js.native
    sealed trait CREATED_AT extends SortFieldEnum
    
    @js.native
    sealed trait DEFAULT extends SortFieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum.CREATED_AT with String = js.native
    /* "DEFAULT" */ val DEFAULT: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum.DEFAULT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortFieldEnum with String] = js.native
  }
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC extends SortOrderEnum
    
    @js.native
    sealed trait DESC extends SortOrderEnum
    
    /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum.ASC with String = js.native
    /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
  }
  
}


package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CLOSED_AT
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum
    
    @js.native
    sealed trait CREATED_AT
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum
    
    @js.native
    sealed trait UPDATED_AT
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum
    
    /* "CLOSED_AT" */ val CLOSED_AT: CLOSED_AT with java.lang.String = js.native
    /* "CREATED_AT" */ val CREATED_AT: CREATED_AT with java.lang.String = js.native
    /* "UPDATED_AT" */ val UPDATED_AT: UPDATED_AT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortFieldEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchOrdersSortNs.SortOrderEnum with java.lang.String
      ] = js.native
  }
  
}


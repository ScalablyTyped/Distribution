package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CREATEDAT
      extends squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum
    
    @js.native
    sealed trait DEFAULT
      extends squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum
    
    /* "CREATED_AT" */ val CREATEDAT: CREATEDAT with java.lang.String = js.native
    /* "DEFAULT" */ val DEFAULT: DEFAULT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortFieldEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ListCustomersRequestNs.SortOrderEnum with java.lang.String
      ] = js.native
  }
  
}


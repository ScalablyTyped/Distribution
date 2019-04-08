package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListTransactionsRequest")
@js.native
object ListTransactionsRequestNs extends js.Object {
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.ListTransactionsRequestNs.SortOrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.ListTransactionsRequestNs.SortOrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ListTransactionsRequestNs.SortOrderEnum with java.lang.String
      ] = js.native
  }
  
}


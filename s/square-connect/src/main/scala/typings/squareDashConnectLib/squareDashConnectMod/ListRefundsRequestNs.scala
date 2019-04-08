package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListRefundsRequest")
@js.native
object ListRefundsRequestNs extends js.Object {
  @js.native
  sealed trait SortOrderEnum extends js.Object
  
  @js.native
  object SortOrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.ListRefundsRequestNs.SortOrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.ListRefundsRequestNs.SortOrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.ListRefundsRequestNs.SortOrderEnum with java.lang.String
      ] = js.native
  }
  
}


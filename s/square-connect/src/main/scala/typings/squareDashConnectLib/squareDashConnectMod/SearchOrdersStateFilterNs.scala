package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersStateFilter")
@js.native
object SearchOrdersStateFilterNs extends js.Object {
  @js.native
  sealed trait StatesEnum extends js.Object
  
  @js.native
  object StatesEnum extends js.Object {
    @js.native
    sealed trait CANCELED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersStateFilterNs.StatesEnum
    
    @js.native
    sealed trait COMPLETED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersStateFilterNs.StatesEnum
    
    @js.native
    sealed trait OPEN
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersStateFilterNs.StatesEnum
    
    /* "CANCELED" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "COMPLETED" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "OPEN" */ val OPEN: OPEN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchOrdersStateFilterNs.StatesEnum with java.lang.String
      ] = js.native
  }
  
}


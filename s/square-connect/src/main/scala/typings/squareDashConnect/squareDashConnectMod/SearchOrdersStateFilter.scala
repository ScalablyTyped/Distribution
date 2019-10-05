package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchOrdersStateFilter.StatesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersStateFilter")
@js.native
class SearchOrdersStateFilter () extends js.Object {
  /**
    * States to filter for. See [OrderState](#type-orderstate) for possible values.
    */
  var states: js.Array[StatesEnum] = js.native
}

@JSImport("square-connect", "SearchOrdersStateFilter")
@js.native
object SearchOrdersStateFilter extends js.Object {
  @js.native
  sealed trait StatesEnum extends js.Object
  
  @js.native
  object StatesEnum extends js.Object {
    @js.native
    sealed trait CANCELED extends StatesEnum
    
    @js.native
    sealed trait COMPLETED extends StatesEnum
    
    @js.native
    sealed trait OPEN extends StatesEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersStateFilter.StatesEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersStateFilter.StatesEnum.COMPLETED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.SearchOrdersStateFilter.StatesEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatesEnum with String] = js.native
  }
  
}


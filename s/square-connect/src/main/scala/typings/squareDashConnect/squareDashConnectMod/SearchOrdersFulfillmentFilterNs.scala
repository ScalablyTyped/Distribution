package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
import typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentTypesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersFulfillmentFilter")
@js.native
object SearchOrdersFulfillmentFilterNs extends js.Object {
  @js.native
  sealed trait FulfillmentStatesEnum extends js.Object
  
  @js.native
  sealed trait FulfillmentTypesEnum extends js.Object
  
  @js.native
  object FulfillmentStatesEnum extends js.Object {
    @js.native
    sealed trait CANCELED extends FulfillmentStatesEnum
    
    @js.native
    sealed trait COMPLETED extends FulfillmentStatesEnum
    
    @js.native
    sealed trait FAILED extends FulfillmentStatesEnum
    
    @js.native
    sealed trait PREPARED extends FulfillmentStatesEnum
    
    @js.native
    sealed trait PROPOSED extends FulfillmentStatesEnum
    
    @js.native
    sealed trait RESERVED extends FulfillmentStatesEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.COMPLETED with String = js.native
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.FAILED with String = js.native
    /* "PREPARED" */ val PREPARED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.PREPARED with String = js.native
    /* "PROPOSED" */ val PROPOSED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.PROPOSED with String = js.native
    /* "RESERVED" */ val RESERVED: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum.RESERVED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FulfillmentStatesEnum with String] = js.native
  }
  
  @js.native
  object FulfillmentTypesEnum extends js.Object {
    @js.native
    sealed trait PICKUP extends FulfillmentTypesEnum
    
    /* "PICKUP" */ val PICKUP: typings.squareDashConnect.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentTypesEnum.PICKUP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FulfillmentTypesEnum with String] = js.native
  }
  
}


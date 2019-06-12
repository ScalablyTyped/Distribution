package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CANCELED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    @js.native
    sealed trait COMPLETED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    @js.native
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    @js.native
    sealed trait PREPARED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    @js.native
    sealed trait PROPOSED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    @js.native
    sealed trait RESERVED
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum
    
    /* "CANCELED" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "COMPLETED" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "PREPARED" */ val PREPARED: PREPARED with java.lang.String = js.native
    /* "PROPOSED" */ val PROPOSED: PROPOSED with java.lang.String = js.native
    /* "RESERVED" */ val RESERVED: RESERVED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentStatesEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object FulfillmentTypesEnum extends js.Object {
    @js.native
    sealed trait PICKUP
      extends squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentTypesEnum
    
    /* "PICKUP" */ val PICKUP: PICKUP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchOrdersFulfillmentFilterNs.FulfillmentTypesEnum with java.lang.String
      ] = js.native
  }
  
}


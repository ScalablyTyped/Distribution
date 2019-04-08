package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListSettlementsRequest")
@js.native
object V1ListSettlementsRequestNs extends js.Object {
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.OrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.OrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.OrderEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.StatusEnum
    
    @js.native
    sealed trait SENT
      extends squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.StatusEnum
    
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "SENT" */ val SENT: SENT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1ListSettlementsRequestNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}


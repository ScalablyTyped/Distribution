package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListRefundsRequest")
@js.native
object V1ListRefundsRequestNs extends js.Object {
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.V1ListRefundsRequestNs.OrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.V1ListRefundsRequestNs.OrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1ListRefundsRequestNs.OrderEnum with java.lang.String
      ] = js.native
  }
  
}


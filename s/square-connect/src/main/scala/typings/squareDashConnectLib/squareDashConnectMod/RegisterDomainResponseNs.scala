package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
object RegisterDomainResponseNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait PENDING
      extends squareDashConnectLib.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum
    
    @js.native
    sealed trait VERIFIED
      extends squareDashConnectLib.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum
    
    /* "PENDING" */ val PENDING: PENDING with java.lang.String = js.native
    /* "VERIFIED" */ val VERIFIED: VERIFIED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}


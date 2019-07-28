package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum
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
    sealed trait PENDING extends StatusEnum
    
    @js.native
    sealed trait VERIFIED extends StatusEnum
    
    /* "PENDING" */ val PENDING: typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum.PENDING with String = js.native
    /* "VERIFIED" */ val VERIFIED: typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum.VERIFIED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}


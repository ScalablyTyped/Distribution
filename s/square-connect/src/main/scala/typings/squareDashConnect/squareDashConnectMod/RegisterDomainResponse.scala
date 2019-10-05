package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponse.StatusEnum
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
class RegisterDomainResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * Status of the domain registration.
    * See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
}

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
object RegisterDomainResponse extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait PENDING extends StatusEnum
    
    @js.native
    sealed trait VERIFIED extends StatusEnum
    
    /* "PENDING" */ val PENDING: typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponse.StatusEnum.PENDING with String = js.native
    /* "VERIFIED" */ val VERIFIED: typings.squareDashConnect.squareDashConnectMod.RegisterDomainResponse.StatusEnum.VERIFIED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}


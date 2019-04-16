package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
class RegisterDomainResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * Status of the domain registration. See [RegisterDomainResponseStatus](#type-registerdomainresponsestatus) for
    * possible values.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.RegisterDomainResponseNs.StatusEnum] = js.native
}


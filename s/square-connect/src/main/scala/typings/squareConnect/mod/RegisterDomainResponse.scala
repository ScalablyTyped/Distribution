package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.PENDING
import typings.squareConnect.squareConnectStrings.VERIFIED
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
class RegisterDomainResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * Status of the domain registration. See `RegisterDomainResponseStatus` for possible values.
    */
  var status: js.UndefOr[PENDING | VERIFIED] = js.native
}

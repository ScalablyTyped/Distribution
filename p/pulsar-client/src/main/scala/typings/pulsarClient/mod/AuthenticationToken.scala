package typings.pulsarClient.mod

import typings.pulsarClient.anon.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "AuthenticationToken")
@js.native
class AuthenticationToken protected () extends js.Object {
  def this(authTokenOpts: Token) = this()
  
  var token: String = js.native
}

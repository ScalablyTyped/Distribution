package typings.pulsarClient.mod

import typings.pulsarClient.anon.CertificatePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pulsar-client", "AuthenticationTls")
@js.native
class AuthenticationTls protected () extends js.Object {
  def this(authTlsOpts: CertificatePath) = this()
  var certificatePath: String = js.native
  var privateKeyPath: String = js.native
}


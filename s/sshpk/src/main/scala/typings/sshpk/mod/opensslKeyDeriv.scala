package typings.sshpk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "opensslKeyDeriv")
@js.native
object opensslKeyDeriv extends js.Object {
  def apply(cipher: String, salt: String, passphrase: String, count: Double): OpenSllKeyDeriv = js.native
}


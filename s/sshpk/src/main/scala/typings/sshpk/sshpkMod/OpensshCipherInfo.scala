package typings.sshpk.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "OpensshCipherInfo")
@js.native
class OpensshCipherInfo () extends js.Object {
  var blockSize: Double = js.native
  var keySize: Double = js.native
  var opensslName: String = js.native
}

@JSImport("sshpk", "opensshCipherInfo")
@js.native
object opensshCipherInfo extends js.Object {
  def apply(cipber: String): OpensshCipherInfo = js.native
}


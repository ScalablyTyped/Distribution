package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclECDSAPublicKey")
@js.native
class SjclECDSAPublicKey () extends SjclECCPublicKey {
  def verify(hash: BitArray_, rs: BitArray_, fakeLegacyVersion: Boolean): Boolean = js.native
}


package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclEcdsaPublicKey")
@js.native
class SjclEcdsaPublicKey () extends SjclECCPublicKey {
  def verify(hash: BitArray_, rs: BitArray_, fakeLegacyVersion: Boolean): Boolean = js.native
}


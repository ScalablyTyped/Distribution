package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclEcdsaPublicKey")
@js.native
class SjclEcdsaPublicKey () extends SjclECCPublicKey {
  def verify(hash: BitArray, rs: BitArray, fakeLegacyVersion: Boolean): Boolean = js.native
}


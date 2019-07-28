package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclEcdsaSecretKey")
@js.native
class SjclEcdsaSecretKey () extends SjclECCSecretKey {
  def sign(hash: BitArray, paranoia: Double, fakeLegacyVersion: Boolean): BitArray = js.native
  def sign(hash: BitArray, paranoia: Double, fakeLegacyVersion: Boolean, fixedKForTesting: BigNumber): BitArray = js.native
}


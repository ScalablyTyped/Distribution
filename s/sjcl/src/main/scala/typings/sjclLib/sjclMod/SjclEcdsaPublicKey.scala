package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclEcdsaPublicKey")
@js.native
class SjclEcdsaPublicKey () extends SjclECCPublicKey {
  def verify(hash: BitArray, rs: BitArray, fakeLegacyVersion: scala.Boolean): scala.Boolean = js.native
}


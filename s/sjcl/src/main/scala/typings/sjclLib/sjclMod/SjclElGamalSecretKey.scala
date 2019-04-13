package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalSecretKey")
@js.native
class SjclElGamalSecretKey () extends SjclECCSecretKey {
  def dh(pk: SjclECCPublicKey): BitArray = js.native
  def unkem(tag: BitArray): BitArray = js.native
}


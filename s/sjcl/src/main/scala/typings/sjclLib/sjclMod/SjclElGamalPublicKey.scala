package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalPublicKey")
@js.native
class SjclElGamalPublicKey () extends SjclECCPublicKey {
  def kem(paranoia: scala.Double): sjclLib.Anon_KeyTag = js.native
}


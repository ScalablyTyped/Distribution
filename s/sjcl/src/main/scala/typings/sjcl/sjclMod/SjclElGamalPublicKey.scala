package typings.sjcl.sjclMod

import typings.sjcl.Anon_KeyTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalPublicKey")
@js.native
class SjclElGamalPublicKey () extends SjclECCPublicKey {
  def kem(paranoia: Double): Anon_KeyTag = js.native
}


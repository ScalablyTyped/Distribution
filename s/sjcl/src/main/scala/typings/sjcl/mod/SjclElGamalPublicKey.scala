package typings.sjcl.mod

import typings.sjcl.AnonKeyTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalPublicKey")
@js.native
class SjclElGamalPublicKey () extends SjclECCPublicKey {
  def kem(paranoia: Double): AnonKeyTag = js.native
}


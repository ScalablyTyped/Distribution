package typings.sjcl.mod

import typings.sjcl.AnonTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalPublicKey")
@js.native
class SjclElGamalPublicKey () extends SjclECCPublicKey {
  def kem(paranoia: Double): AnonTag = js.native
}


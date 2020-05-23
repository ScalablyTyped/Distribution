package typings.sjcl.mod

import typings.sjcl.anon.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalPublicKey")
@js.native
class SjclElGamalPublicKey () extends SjclECCPublicKey {
  def kem(paranoia: Double): Tag = js.native
}


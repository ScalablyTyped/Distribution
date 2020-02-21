package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalSecretKey")
@js.native
class SjclElGamalSecretKey () extends SjclECCSecretKey {
  def dh(pk: SjclECCPublicKey): BitArray_ = js.native
  def dhJavaEc(pk: SjclECCPublicKey): BitArray_ = js.native
  def unkem(tag: BitArray_): BitArray_ = js.native
}


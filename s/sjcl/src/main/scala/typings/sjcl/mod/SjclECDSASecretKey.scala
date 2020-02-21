package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclECDSASecretKey")
@js.native
class SjclECDSASecretKey () extends SjclECCSecretKey {
  def sign(hash: BitArray_, paranoia: Double, fakeLegacyVersion: Boolean): BitArray_ = js.native
  def sign(hash: BitArray_, paranoia: Double, fakeLegacyVersion: Boolean, fixedKForTesting: BigNumber): BitArray_ = js.native
}


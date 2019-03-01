package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEcdsaPublicKey extends SjclECCPublicKey {
  def verify(hash: BitArray, rs: BitArray, fakeLegacyVersion: scala.Boolean): scala.Boolean
}

object SjclEcdsaPublicKey {
  @scala.inline
  def apply(
    get: js.Function0[SjclECCPublicKeyData],
    verify: js.Function3[BitArray, BitArray, scala.Boolean, scala.Boolean]
  ): SjclEcdsaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SjclEcdsaPublicKey]
  }
}


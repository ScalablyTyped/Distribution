package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclElGamalSecretKey extends SjclECCSecretKey {
  def dh(pk: SjclECCPublicKey): BitArray
  def unkem(tag: BitArray): BitArray
}

object SjclElGamalSecretKey {
  @scala.inline
  def apply(
    dh: js.Function1[SjclECCPublicKey, BitArray],
    get: js.Function0[BitArray],
    unkem: js.Function1[BitArray, BitArray]
  ): SjclElGamalSecretKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dh")(dh)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("unkem")(unkem)
    __obj.asInstanceOf[SjclElGamalSecretKey]
  }
}


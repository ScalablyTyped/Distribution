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
  def apply(dh: SjclECCPublicKey => BitArray, get: () => BitArray, unkem: BitArray => BitArray): SjclElGamalSecretKey = {
    val __obj = js.Dynamic.literal(dh = js.Any.fromFunction1(dh), get = js.Any.fromFunction0(get), unkem = js.Any.fromFunction1(unkem))
  
    __obj.asInstanceOf[SjclElGamalSecretKey]
  }
}


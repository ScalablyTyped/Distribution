package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclElGamalPublicKey extends SjclECCPublicKey {
  def kem(paranoia: scala.Double): sjclLib.Anon_KeyTag
}

object SjclElGamalPublicKey {
  @scala.inline
  def apply(get: () => SjclECCPublicKeyData, kem: scala.Double => sjclLib.Anon_KeyTag): SjclElGamalPublicKey = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), kem = js.Any.fromFunction1(kem))
  
    __obj.asInstanceOf[SjclElGamalPublicKey]
  }
}


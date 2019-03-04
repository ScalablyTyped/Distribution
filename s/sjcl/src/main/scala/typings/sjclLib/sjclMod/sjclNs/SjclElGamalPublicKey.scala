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
  def apply(get: js.Function0[SjclECCPublicKeyData], kem: js.Function1[scala.Double, sjclLib.Anon_KeyTag]): SjclElGamalPublicKey = {
    val __obj = js.Dynamic.literal(get = get, kem = kem)
  
    __obj.asInstanceOf[SjclElGamalPublicKey]
  }
}


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
  def apply(get: () => SjclECCPublicKeyData, verify: (BitArray, BitArray, scala.Boolean) => scala.Boolean): SjclEcdsaPublicKey = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), verify = js.Any.fromFunction3(verify))
  
    __obj.asInstanceOf[SjclEcdsaPublicKey]
  }
}


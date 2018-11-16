package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclEcdsaPublicKey")
@js.native
class SjclEcdsaPublicKey ()
  extends sjclLib.sjclMod.sjclNs.SjclEcdsaPublicKey {
  /* CompleteClass */
  override def get(): sjclLib.sjclMod.sjclNs.SjclECCPublicKeyData = js.native
  /* CompleteClass */
  override def verify(
    hash: sjclLib.sjclMod.sjclNs.BitArray,
    rs: sjclLib.sjclMod.sjclNs.BitArray,
    fakeLegacyVersion: scala.Boolean
  ): scala.Boolean = js.native
}


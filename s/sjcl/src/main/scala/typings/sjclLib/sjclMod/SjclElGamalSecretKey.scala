package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "SjclElGamalSecretKey")
@js.native
class SjclElGamalSecretKey ()
  extends sjclLib.sjclMod.sjclNs.SjclElGamalSecretKey {
  /* CompleteClass */
  override def dh(pk: sjclLib.sjclMod.sjclNs.SjclECCPublicKey): sjclLib.sjclMod.sjclNs.BitArray = js.native
  /* CompleteClass */
  override def get(): sjclLib.sjclMod.sjclNs.BitArray = js.native
  /* CompleteClass */
  override def unkem(tag: sjclLib.sjclMod.sjclNs.BitArray): sjclLib.sjclMod.sjclNs.BitArray = js.native
}


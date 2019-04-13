package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclEcdsa extends js.Object {
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclEcdsaPublicKey, SjclEcdsaSecretKey] = js.native
  var publicKey: SjclECCPublicKeyFactory[SjclEcdsaPublicKey] = js.native
  var secretKey: SjclECCSecretKeyFactory[SjclEcdsaSecretKey] = js.native
  def generateKeys(curve: scala.Double, paranoia: scala.Double): SjclKeyPair[SjclEcdsaPublicKey, SjclEcdsaSecretKey] = js.native
  def generateKeys(curve: scala.Double, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[SjclEcdsaPublicKey, SjclEcdsaSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: scala.Double): SjclKeyPair[SjclEcdsaPublicKey, SjclEcdsaSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[SjclEcdsaPublicKey, SjclEcdsaSecretKey] = js.native
}


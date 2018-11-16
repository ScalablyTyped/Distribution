package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclElGamal extends js.Object {
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  var publicKey: SjclECCPublicKeyFactory[SjclElGamalPublicKey] = js.native
  var secretKey: SjclECCSecretKeyFactory[SjclElGamalSecretKey] = js.native
  def generateKeys(curve: scala.Double, paranoia: scala.Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: scala.Double, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: scala.Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
}


package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclECDSA extends js.Object {
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  var publicKey: SjclECCPublicKeyFactory[SjclECDSAPublicKey] = js.native
  var secretKey: SjclECCSecretKeyFactory[SjclECDSASecretKey] = js.native
  def generateKeys(curve: Double, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
}


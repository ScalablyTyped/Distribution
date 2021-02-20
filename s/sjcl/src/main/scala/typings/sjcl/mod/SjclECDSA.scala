package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECDSA extends StObject {
  
  def generateKeys(curve: Double, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclECDSAPublicKey, SjclECDSASecretKey] = js.native
  
  var publicKey: SjclECCPublicKeyFactory[SjclECDSAPublicKey] = js.native
  
  var secretKey: SjclECCSecretKeyFactory[SjclECDSASecretKey] = js.native
}

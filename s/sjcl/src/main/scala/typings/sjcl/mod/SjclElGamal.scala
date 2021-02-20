package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclElGamal extends StObject {
  
  def generateKeys(curve: Double, paranoia: Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclElGamalPublicKey, SjclElGamalSecretKey] = js.native
  
  var publicKey: SjclECCPublicKeyFactory[SjclElGamalPublicKey] = js.native
  
  var secretKey: SjclECCSecretKeyFactory[SjclElGamalSecretKey] = js.native
}

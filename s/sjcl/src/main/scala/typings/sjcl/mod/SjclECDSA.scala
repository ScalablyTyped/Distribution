package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclECDSA extends StObject {
  
  def generateKeys(curve: Double, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
  def generateKeys(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclECDSAPublicKey, SjclECDSASecretKey]
  
  var publicKey: SjclECCPublicKeyFactory[SjclECDSAPublicKey]
  
  var secretKey: SjclECCSecretKeyFactory[SjclECDSASecretKey]
}
object SjclECDSA {
  
  @scala.inline
  def apply(
    generateKeys: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECDSAPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECDSASecretKey]
  ): SjclECDSA = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction3(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECDSA]
  }
  
  @scala.inline
  implicit class SjclECDSAMutableBuilder[Self <: SjclECDSA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerateKeys(
      value: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
    ): Self = StObject.set(x, "generateKeys", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPublicKey(value: SjclECCPublicKeyFactory[SjclECDSAPublicKey]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: SjclECCSecretKeyFactory[SjclECDSASecretKey]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

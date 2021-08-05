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
  
  inline def apply(
    generateKeys: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECDSAPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECDSASecretKey]
  ): SjclECDSA = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction3(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECDSA]
  }
  
  extension [Self <: SjclECDSA](x: Self) {
    
    inline def setGenerateKeys(
      value: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclECDSAPublicKey, SjclECDSASecretKey]
    ): Self = StObject.set(x, "generateKeys", js.Any.fromFunction3(value))
    
    inline def setPublicKey(value: SjclECCPublicKeyFactory[SjclECDSAPublicKey]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: SjclECCSecretKeyFactory[SjclECDSASecretKey]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclElGamal extends StObject {
  
  def generateKeys(curve: Double, paranoia: Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey]
  def generateKeys(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey]
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey]
  def generateKeys(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey]
  @JSName("generateKeys")
  var generateKeys_Original: SjclKeysGenerator[SjclElGamalPublicKey, SjclElGamalSecretKey]
  
  var publicKey: SjclECCPublicKeyFactory[SjclElGamalPublicKey]
  
  var secretKey: SjclECCSecretKeyFactory[SjclElGamalSecretKey]
}
object SjclElGamal {
  
  inline def apply(
    generateKeys: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclElGamalPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclElGamalSecretKey]
  ): SjclElGamal = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction3(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclElGamal]
  }
  
  extension [Self <: SjclElGamal](x: Self) {
    
    inline def setGenerateKeys(
      value: (/* curve */ SjclEllipticalCurve | Double, /* paranoia */ Double, /* sec */ js.UndefOr[BigNumber]) => SjclKeyPair[SjclElGamalPublicKey, SjclElGamalSecretKey]
    ): Self = StObject.set(x, "generateKeys", js.Any.fromFunction3(value))
    
    inline def setPublicKey(value: SjclECCPublicKeyFactory[SjclElGamalPublicKey]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: SjclECCSecretKeyFactory[SjclElGamalSecretKey]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

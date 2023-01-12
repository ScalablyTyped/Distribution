package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclECCBasic extends StObject {
  
  def generateKeys(cn: String): SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]
  
  var publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey]
  
  var secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
}
object SjclECCBasic {
  
  inline def apply(
    generateKeys: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction1(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCBasic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclECCBasic] (val x: Self) extends AnyVal {
    
    inline def setGenerateKeys(value: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]): Self = StObject.set(x, "generateKeys", js.Any.fromFunction1(value))
    
    inline def setPublicKey(value: SjclECCPublicKeyFactory[SjclECCPublicKey]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: SjclECCSecretKeyFactory[SjclECCSecretKey]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

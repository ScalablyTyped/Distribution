package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECCBasic extends StObject {
  
  def generateKeys(cn: String): SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey] = js.native
  
  var publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey] = js.native
  
  var secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey] = js.native
}
object SjclECCBasic {
  
  @scala.inline
  def apply(
    generateKeys: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction1(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCBasic]
  }
  
  @scala.inline
  implicit class SjclECCBasicMutableBuilder[Self <: SjclECCBasic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerateKeys(value: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]): Self = StObject.set(x, "generateKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublicKey(value: SjclECCPublicKeyFactory[SjclECCPublicKey]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: SjclECCSecretKeyFactory[SjclECCSecretKey]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

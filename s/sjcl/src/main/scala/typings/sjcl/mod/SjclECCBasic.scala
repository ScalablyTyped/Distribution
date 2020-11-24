package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclECCBasic extends js.Object {
  
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
  implicit class SjclECCBasicOps[Self <: SjclECCBasic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerateKeys(value: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]): Self = this.set("generateKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublicKey(value: SjclECCPublicKeyFactory[SjclECCPublicKey]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: SjclECCSecretKeyFactory[SjclECCSecretKey]): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
}

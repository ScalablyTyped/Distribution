package typings.stellarBase.anon

import typings.stellarBase.mod.KeypairType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends StObject {
  
  var publicKey: js.UndefOr[String] = js.native
  
  var secretKey: String = js.native
  
  var `type`: KeypairType = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(secretKey: String, `type`: KeypairType): PublicKey = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: KeypairType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

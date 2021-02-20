package typings.stellarBase.anon

import typings.stellarBase.mod.KeypairType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var publicKey: String = js.native
  
  var `type`: KeypairType = js.native
}
object Type {
  
  @scala.inline
  def apply(publicKey: String, `type`: KeypairType): Type = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: KeypairType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

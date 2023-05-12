package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyId_ extends StObject {
  
  var keyId: String
}
object KeyId_ {
  
  inline def apply(keyId: String): KeyId_ = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyId_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyId_] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
  }
}

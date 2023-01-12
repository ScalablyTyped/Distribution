package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationParam extends StObject {
  
  var credential: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ConfigurationParam {
  
  inline def apply(): ConfigurationParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationParam] (val x: Self) extends AnyVal {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

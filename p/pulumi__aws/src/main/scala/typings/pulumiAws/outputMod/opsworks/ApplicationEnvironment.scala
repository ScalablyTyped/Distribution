package typings.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationEnvironment extends StObject {
  
  /**
    * Variable name.
    */
  var key: String
  
  /**
    * Set visibility of the variable value to `true` or `false`.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Variable value.
    */
  var value: String
}
object ApplicationEnvironment {
  
  inline def apply(key: String, value: String): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
  
  extension [Self <: ApplicationEnvironment](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var primary: String
  
  var secondary: String
  
  var success: String
  
  var warning: String
}
object Error {
  
  inline def apply(error: String, primary: String, secondary: String, success: String, warning: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}

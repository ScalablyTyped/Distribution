package typings.requirejs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequireError
  extends StObject
     with Error {
  
  /**
    * The original error, if there is one (might be null).
    **/
  var originalError: js.Error
  
  /**
    * Required modules.
    **/
  var requireModules: js.Array[String] | Null
  
  /**
    * The error ID that maps to an ID on a web page.
    **/
  var requireType: String
}
object RequireError {
  
  inline def apply(message: String, name: String, originalError: js.Error, requireType: String): RequireError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], requireType = requireType.asInstanceOf[js.Any], requireModules = null)
    __obj.asInstanceOf[RequireError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequireError] (val x: Self) extends AnyVal {
    
    inline def setOriginalError(value: js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
    
    inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
    
    inline def setRequireModulesNull: Self = StObject.set(x, "requireModules", null)
    
    inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
    
    inline def setRequireType(value: String): Self = StObject.set(x, "requireType", value.asInstanceOf[js.Any])
  }
}

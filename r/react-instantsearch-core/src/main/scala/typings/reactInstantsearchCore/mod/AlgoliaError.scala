package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgoliaError extends StObject {
  
  var debugData: js.Array[Any]
  
  var message: String
  
  var name: String
  
  var stack: String
  
  var statusCode: Double
}
object AlgoliaError {
  
  inline def apply(debugData: js.Array[Any], message: String, name: String, stack: String, statusCode: Double): AlgoliaError = {
    val __obj = js.Dynamic.literal(debugData = debugData.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgoliaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgoliaError] (val x: Self) extends AnyVal {
    
    inline def setDebugData(value: js.Array[Any]): Self = StObject.set(x, "debugData", value.asInstanceOf[js.Any])
    
    inline def setDebugDataVarargs(value: Any*): Self = StObject.set(x, "debugData", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}

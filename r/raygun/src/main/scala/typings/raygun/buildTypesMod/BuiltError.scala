package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltError extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var innerError: js.UndefOr[BuiltError] = js.undefined
  
  var message: String
  
  var stackTrace: js.UndefOr[js.Array[StackFrame]] = js.undefined
}
object BuiltError {
  
  inline def apply(message: String): BuiltError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltError]
  }
  
  extension [Self <: BuiltError](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setInnerError(value: BuiltError): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "stackTrace", js.Array(value*))
  }
}

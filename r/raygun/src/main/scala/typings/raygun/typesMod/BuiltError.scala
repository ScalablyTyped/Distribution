package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltError extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var innerError: js.UndefOr[BuiltError] = js.native
  
  var message: String = js.native
  
  var stackTrace: js.UndefOr[js.Array[StackFrame]] = js.native
}
object BuiltError {
  
  @scala.inline
  def apply(message: String): BuiltError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltError]
  }
  
  @scala.inline
  implicit class BuiltErrorMutableBuilder[Self <: BuiltError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setInnerError(value: BuiltError): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: js.Array[StackFrame]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setStackTraceVarargs(value: StackFrame*): Self = StObject.set(x, "stackTrace", js.Array(value :_*))
  }
}

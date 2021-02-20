package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgoliaError extends StObject {
  
  var debugData: js.Array[_] = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: String = js.native
  
  var statusCode: Double = js.native
}
object AlgoliaError {
  
  @scala.inline
  def apply(debugData: js.Array[_], message: String, name: String, stack: String, statusCode: Double): AlgoliaError = {
    val __obj = js.Dynamic.literal(debugData = debugData.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgoliaError]
  }
  
  @scala.inline
  implicit class AlgoliaErrorMutableBuilder[Self <: AlgoliaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugData(value: js.Array[_]): Self = StObject.set(x, "debugData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugDataVarargs(value: js.Any*): Self = StObject.set(x, "debugData", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}

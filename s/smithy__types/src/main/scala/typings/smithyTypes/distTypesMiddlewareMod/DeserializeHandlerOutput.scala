package typings.smithyTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializeHandlerOutput[Output /* <: js.Object */] extends StObject {
  
  var output: js.UndefOr[Output] = js.undefined
  
  /**
    * The raw response object from runtime is deserialized to structured output object.
    * The response object is unknown so you cannot modify it directly. When work with
    * response, you need to guard its type to e.g. HttpResponse with 'instanceof' operand.
    *
    * During the deserialize phase of the execution of a middleware stack, a deserialized
    * response may or may not be available
    */
  var response: Any
}
object DeserializeHandlerOutput {
  
  inline def apply[Output /* <: js.Object */](response: Any): DeserializeHandlerOutput[Output] = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeHandlerOutput[Output]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeserializeHandlerOutput[?], Output /* <: js.Object */] (val x: Self & DeserializeHandlerOutput[Output]) extends AnyVal {
    
    inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

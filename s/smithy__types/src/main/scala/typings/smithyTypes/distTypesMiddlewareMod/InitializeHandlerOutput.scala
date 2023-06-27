package typings.smithyTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeHandlerOutput[Output /* <: js.Object */]
  extends StObject
     with DeserializeHandlerOutput[Output] {
  
  @JSName("output")
  var output_InitializeHandlerOutput: Output
}
object InitializeHandlerOutput {
  
  inline def apply[Output /* <: js.Object */](output: Output, response: Any): InitializeHandlerOutput[Output] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeHandlerOutput[Output]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeHandlerOutput[?], Output /* <: js.Object */] (val x: Self & InitializeHandlerOutput[Output]) extends AnyVal {
    
    inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}

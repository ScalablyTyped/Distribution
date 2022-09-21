package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerEvent
  extends StObject
     with ComponentCompilerStaticEvent {
  
  var internal: Boolean
}
object ComponentCompilerEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    complexType: ComponentCompilerEventComplexType,
    composed: Boolean,
    docs: CompilerJsDoc,
    internal: Boolean,
    method: String,
    name: String
  ): ComponentCompilerEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], complexType = complexType.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerEvent]
  }
  
  extension [Self <: ComponentCompilerEvent](x: Self) {
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
  }
}

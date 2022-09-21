package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerStaticEvent extends StObject {
  
  var bubbles: Boolean
  
  var cancelable: Boolean
  
  var complexType: ComponentCompilerEventComplexType
  
  var composed: Boolean
  
  var docs: CompilerJsDoc
  
  var method: String
  
  var name: String
}
object ComponentCompilerStaticEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    complexType: ComponentCompilerEventComplexType,
    composed: Boolean,
    docs: CompilerJsDoc,
    method: String,
    name: String
  ): ComponentCompilerStaticEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], complexType = complexType.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerStaticEvent]
  }
  
  extension [Self <: ComponentCompilerStaticEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComplexType(value: ComponentCompilerEventComplexType): Self = StObject.set(x, "complexType", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: CompilerJsDoc): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

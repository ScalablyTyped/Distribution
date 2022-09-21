package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsDocTags extends StObject {
  
  var params: js.UndefOr[js.Array[JsDocParam]] = js.undefined
  
  var returns: js.UndefOr[JsDocReturns] = js.undefined
}
object JsDocTags {
  
  inline def apply(): JsDocTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsDocTags]
  }
  
  extension [Self <: JsDocTags](x: Self) {
    
    inline def setParams(value: js.Array[JsDocParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: JsDocParam*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturns(value: JsDocReturns): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
  }
}

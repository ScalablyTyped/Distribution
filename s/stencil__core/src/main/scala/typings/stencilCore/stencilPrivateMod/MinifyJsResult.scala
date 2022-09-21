package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Col
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinifyJsResult extends StObject {
  
  var code: String
  
  var error: Col
  
  var sourceMap: Any
}
object MinifyJsResult {
  
  inline def apply(code: String, error: Col, sourceMap: Any): MinifyJsResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyJsResult]
  }
  
  extension [Self <: MinifyJsResult](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: Col): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setSourceMap(value: Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
  }
}

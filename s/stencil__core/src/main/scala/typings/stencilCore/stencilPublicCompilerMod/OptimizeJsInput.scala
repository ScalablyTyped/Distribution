package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.es5
import typings.stencilCore.stencilCoreStrings.latest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeJsInput extends StObject {
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var input: String
  
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[es5 | latest] = js.undefined
}
object OptimizeJsInput {
  
  inline def apply(input: String): OptimizeJsInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeJsInput]
  }
  
  extension [Self <: OptimizeJsInput](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setTarget(value: es5 | latest): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}

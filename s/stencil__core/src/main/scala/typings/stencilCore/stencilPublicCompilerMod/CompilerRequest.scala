package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerRequest extends StObject {
  
  var path: js.UndefOr[String] = js.undefined
}
object CompilerRequest {
  
  inline def apply(): CompilerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerRequest]
  }
  
  extension [Self <: CompilerRequest](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}

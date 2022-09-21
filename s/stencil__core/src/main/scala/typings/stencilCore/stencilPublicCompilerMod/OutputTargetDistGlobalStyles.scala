package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-global-styles`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistGlobalStyles
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var file: String
  
  @JSName("type")
  var type_OutputTargetDistGlobalStyles: `dist-global-styles`
}
object OutputTargetDistGlobalStyles {
  
  inline def apply(file: String): OutputTargetDistGlobalStyles = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-global-styles")
    __obj.asInstanceOf[OutputTargetDistGlobalStyles]
  }
  
  extension [Self <: OutputTargetDistGlobalStyles](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setType(value: `dist-global-styles`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

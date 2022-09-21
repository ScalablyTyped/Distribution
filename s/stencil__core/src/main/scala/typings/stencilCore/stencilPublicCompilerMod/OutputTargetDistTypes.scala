package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-types`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDistTypes
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var dir: String
  
  @JSName("type")
  var type_OutputTargetDistTypes: `dist-types`
  
  var typesDir: String
}
object OutputTargetDistTypes {
  
  inline def apply(dir: String, typesDir: String): OutputTargetDistTypes = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], typesDir = typesDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-types")
    __obj.asInstanceOf[OutputTargetDistTypes]
  }
  
  extension [Self <: OutputTargetDistTypes](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setType(value: `dist-types`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypesDir(value: String): Self = StObject.set(x, "typesDir", value.asInstanceOf[js.Any])
  }
}

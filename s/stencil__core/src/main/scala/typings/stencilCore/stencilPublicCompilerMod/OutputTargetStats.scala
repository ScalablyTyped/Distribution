package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetStats
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var file: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_OutputTargetStats: stats
}
object OutputTargetStats {
  
  inline def apply(): OutputTargetStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stats")
    __obj.asInstanceOf[OutputTargetStats]
  }
  
  extension [Self <: OutputTargetStats](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setType(value: stats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

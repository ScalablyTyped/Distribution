package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.collection
import typings.stencilCore.stencilCoreStrings.copy
import typings.stencilCore.stencilCoreStrings.dist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetCopy
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var copy: js.UndefOr[js.Array[CopyTask]] = js.undefined
  
  var copyAssets: js.UndefOr[collection | dist] = js.undefined
  
  var dir: String
  
  @JSName("type")
  var type_OutputTargetCopy: copy
}
object OutputTargetCopy {
  
  inline def apply(dir: String): OutputTargetCopy = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("copy")
    __obj.asInstanceOf[OutputTargetCopy]
  }
  
  extension [Self <: OutputTargetCopy](x: Self) {
    
    inline def setCopy(value: js.Array[CopyTask]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyAssets(value: collection | dist): Self = StObject.set(x, "copyAssets", value.asInstanceOf[js.Any])
    
    inline def setCopyAssetsUndefined: Self = StObject.set(x, "copyAssets", js.undefined)
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCopyVarargs(value: CopyTask*): Self = StObject.set(x, "copy", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setType(value: copy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

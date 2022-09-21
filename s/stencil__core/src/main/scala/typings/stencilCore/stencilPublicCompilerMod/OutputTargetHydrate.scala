package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`dist-hydrate-script`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetHydrate
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  var dir: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Module IDs that should not be bundled into the script.
    * By default, all node builtin's, such as `fs` or `path`
    * will be considered "external" and not bundled.
    */
  var external: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_OutputTargetHydrate: `dist-hydrate-script`
}
object OutputTargetHydrate {
  
  inline def apply(): OutputTargetHydrate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-hydrate-script")
    __obj.asInstanceOf[OutputTargetHydrate]
  }
  
  extension [Self <: OutputTargetHydrate](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setType(value: `dist-hydrate-script`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

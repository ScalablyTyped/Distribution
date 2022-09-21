package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.`esm-browser`
import typings.stencilCore.stencilCoreStrings.cjs
import typings.stencilCore.stencilCoreStrings.esm
import typings.stencilCore.stencilCoreStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedLazyBuildCtx extends StObject {
  
  var buildCtx: BuildCtx
  
  var name: `esm-browser` | esm | cjs | system
}
object UpdatedLazyBuildCtx {
  
  inline def apply(buildCtx: BuildCtx, name: `esm-browser` | esm | cjs | system): UpdatedLazyBuildCtx = {
    val __obj = js.Dynamic.literal(buildCtx = buildCtx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedLazyBuildCtx]
  }
  
  extension [Self <: UpdatedLazyBuildCtx](x: Self) {
    
    inline def setBuildCtx(value: BuildCtx): Self = StObject.set(x, "buildCtx", value.asInstanceOf[js.Any])
    
    inline def setName(value: `esm-browser` | esm | cjs | system): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

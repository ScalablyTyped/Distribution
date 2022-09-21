package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection
  - typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy
*/
trait OutputTargetBuild extends StObject
object OutputTargetBuild {
  
  inline def OutputTargetDistCollection(collectionDir: String, dir: String): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection = {
    val __obj = js.Dynamic.literal(collectionDir = collectionDir.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dist-collection")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistCollection]
  }
  
  inline def OutputTargetDistLazy(): typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dist-lazy")
    __obj.asInstanceOf[typings.stencilCore.stencilPublicCompilerMod.OutputTargetDistLazy]
  }
}

package typings.rollupPluginVisualizer

import typings.rollup.mod.OutputChunk
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginSourcemapMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/sourcemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourcemapModules(id: String, outputChunk: OutputChunk, dir: String): js.Promise[Record[String, SourceMapModuleRenderInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourcemapModules")(id.asInstanceOf[js.Any], outputChunk.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, SourceMapModuleRenderInfo]]]
  
  trait SourceMapModuleRenderInfo extends StObject {
    
    var id: String
    
    var renderedLength: Double
  }
  object SourceMapModuleRenderInfo {
    
    inline def apply(id: String, renderedLength: Double): SourceMapModuleRenderInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapModuleRenderInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapModuleRenderInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRenderedLength(value: Double): Self = StObject.set(x, "renderedLength", value.asInstanceOf[js.Any])
    }
  }
}

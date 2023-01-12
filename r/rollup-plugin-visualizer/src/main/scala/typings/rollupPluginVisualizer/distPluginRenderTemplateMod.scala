package typings.rollupPluginVisualizer

import typings.rollupPluginVisualizer.distPluginTemplateTypesMod.TemplateType
import typings.rollupPluginVisualizer.distTypesTypesMod.VisualizerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginRenderTemplateMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/render-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderTemplate(templateType: TemplateType, options: RenderTemplateOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(templateType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait RenderTemplateOptions extends StObject {
    
    var data: VisualizerData
    
    var title: String
  }
  object RenderTemplateOptions {
    
    inline def apply(data: VisualizerData, title: String): RenderTemplateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: VisualizerData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}

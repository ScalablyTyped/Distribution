package typings.rollupPluginVisualizer

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: PluginVisualizerOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-visualizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PluginVisualizerOptions extends StObject {
    
    var bundlesRelative: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PluginVisualizerOptions {
    
    inline def apply(): PluginVisualizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginVisualizerOptions]
    }
    
    extension [Self <: PluginVisualizerOptions](x: Self) {
      
      inline def setBundlesRelative(value: Boolean): Self = StObject.set(x, "bundlesRelative", value.asInstanceOf[js.Any])
      
      inline def setBundlesRelativeUndefined: Self = StObject.set(x, "bundlesRelative", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

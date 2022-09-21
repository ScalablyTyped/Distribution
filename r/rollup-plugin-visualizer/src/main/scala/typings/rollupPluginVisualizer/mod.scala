package typings.rollupPluginVisualizer

import typings.rollup.mod.Plugin
import typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.network
import typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.sunburst
import typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.treemap
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
    
    /**
      * Collect brotli size from source code and display it at chart.
      * Only if current node version supports it
      * @default false
      */
    var brotliSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the file with diagram to generate
      * @default "stats.html"
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Collect gzip size from source code and display it at chart
      * @default false
      */
    var gzipSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Product portable json file that can be used with
      * plugin CLI util to generate graph from several json files.
      * Every UI property ignored in this case.
      * @default false
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Open generated file in default user agent
      * @default false
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use sourcemaps to calculate sizes (e.g. after UglifyJs or Terser)
      * @default false
      */
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which diagram type to use
      * @default "treemap"
      */
    var template: js.UndefOr[treemap | sunburst | network] = js.undefined
    
    /**
      * Title tag value
      * @default "Rollup Visualizer"
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object PluginVisualizerOptions {
    
    inline def apply(): PluginVisualizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginVisualizerOptions]
    }
    
    extension [Self <: PluginVisualizerOptions](x: Self) {
      
      inline def setBrotliSize(value: Boolean): Self = StObject.set(x, "brotliSize", value.asInstanceOf[js.Any])
      
      inline def setBrotliSizeUndefined: Self = StObject.set(x, "brotliSize", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setGzipSize(value: Boolean): Self = StObject.set(x, "gzipSize", value.asInstanceOf[js.Any])
      
      inline def setGzipSizeUndefined: Self = StObject.set(x, "gzipSize", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTemplate(value: treemap | sunburst | network): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

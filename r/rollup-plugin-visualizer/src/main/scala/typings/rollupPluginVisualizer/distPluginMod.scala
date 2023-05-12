package typings.rollupPluginVisualizer

import typings.rollup.mod.OutputOptions
import typings.rollup.mod.Plugin
import typings.rollupPluginVisualizer.distPluginTemplateTypesMod.TemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(opts: js.Function1[/* outputOptions */ OutputOptions, PluginVisualizerOptions]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  inline def default(opts: PluginVisualizerOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def visualizer(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("visualizer")().asInstanceOf[Plugin]
  inline def visualizer(opts: js.Function1[/* outputOptions */ OutputOptions, PluginVisualizerOptions]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("visualizer")(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  inline def visualizer(opts: PluginVisualizerOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("visualizer")(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait PluginVisualizerOptions extends StObject {
    
    /**
      * If plugin should also calculate sizes of brotlied files.
      *
      * @default false
      */
    var brotliSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use rollup .emitFile API to generate files. Could be usefull if you want to output to configured by rollup output dir.
      * When this set to true, filename options must be filename and not a path.
      *
      * @default false
      */
    var emitFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to the template file to use. Or just a name of a file.
      *
      * @default "stats.html"
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * If plugin should also calculate sizes of gzipped files.
      *
      * @default false
      */
    var gzipSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If plugin should emit json file with visualizer data. It can be used with plugin CLI
      *
      * @default false
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If plugin should open browser with generated file. Ignored when `json` is true.
      *
      * @default false
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    var openOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify opn.Options */ Any
      ] = js.undefined
    
    /**
      * Absolute path where project is located. It is used to cut prefix from file's paths.
      *
      * @default process.cwd()
      */
    var projectRoot: js.UndefOr[String | js.RegExp] = js.undefined
    
    /**
      * If plugin should use sourcemap to calculate sizes of modules. By idea it will present more accurate results.
      * `gzipSize` and `brotliSize` does not make much sense with this option.
      *
      * @default false
      */
    var sourcemap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which diagram to generate. 'sunburst' or 'treemap' can help find big dependencies or if they are repeated.
      * 'network' can answer you why something was included
      *
      * @default 'treemap'
      */
    var template: js.UndefOr[TemplateType] = js.undefined
    
    /**
      * HTML <title> value in generated file. Ignored when `json` is true.
      *
      * @default "Rollup Visualizer"
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object PluginVisualizerOptions {
    
    inline def apply(): PluginVisualizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginVisualizerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginVisualizerOptions] (val x: Self) extends AnyVal {
      
      inline def setBrotliSize(value: Boolean): Self = StObject.set(x, "brotliSize", value.asInstanceOf[js.Any])
      
      inline def setBrotliSizeUndefined: Self = StObject.set(x, "brotliSize", js.undefined)
      
      inline def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
      
      inline def setEmitFileUndefined: Self = StObject.set(x, "emitFile", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setGzipSize(value: Boolean): Self = StObject.set(x, "gzipSize", value.asInstanceOf[js.Any])
      
      inline def setGzipSizeUndefined: Self = StObject.set(x, "gzipSize", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify opn.Options */ Any
      ): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
      
      inline def setOpenOptionsUndefined: Self = StObject.set(x, "openOptions", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setProjectRoot(value: String | js.RegExp): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      inline def setTemplate(value: TemplateType): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

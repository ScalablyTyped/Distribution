package typings.rollupPluginNodeGlobals

import typings.rollup.mod.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-node-globals", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-node-globals", JSImport.Default)
  @js.native
  def default(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    var baseDir: js.UndefOr[String] = js.native
    
    var buffer: js.UndefOr[Boolean] = js.native
    
    var dirname: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
    
    var filename: js.UndefOr[Boolean] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
    
    // Every files will be parsed by default, but you can specify which files to include or exclude
    var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.native
    
    // Plugin's options
    var process: js.UndefOr[Boolean] = js.native
    
    // Enable sourcemaps support
    var sourceMap: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setDirname(value: Boolean): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setExclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: Boolean): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setInclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNull: Self = StObject.set(x, "include", null)
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setProcess(value: Boolean): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}

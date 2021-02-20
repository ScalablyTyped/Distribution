package typings.rollupPluginUrl

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-url", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-url", JSImport.Default)
  @js.native
  def default(options: PluginURLOptions): Plugin = js.native
  
  @js.native
  trait PluginURLOptions extends StObject {
    
    var destDist: js.UndefOr[String] = js.native
    
    var emitFile: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var include: js.UndefOr[js.Array[String]] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var publicPath: js.UndefOr[String] = js.native
    
    var sourceDir: js.UndefOr[String] = js.native
  }
  object PluginURLOptions {
    
    @scala.inline
    def apply(): PluginURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginURLOptions]
    }
    
    @scala.inline
    implicit class PluginURLOptionsMutableBuilder[Self <: PluginURLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestDist(value: String): Self = StObject.set(x, "destDist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestDistUndefined: Self = StObject.set(x, "destDist", js.undefined)
      
      @scala.inline
      def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitFileUndefined: Self = StObject.set(x, "emitFile", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDirUndefined: Self = StObject.set(x, "sourceDir", js.undefined)
    }
  }
}

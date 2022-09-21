package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeCssInput extends StObject {
  
  var autoprefixer: js.UndefOr[Boolean | Null | AutoprefixerOptions] = js.undefined
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var input: String
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var resolveUrl: js.UndefOr[js.Function1[/* url */ String, js.Promise[String] | String]] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}
object OptimizeCssInput {
  
  inline def apply(input: String): OptimizeCssInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeCssInput]
  }
  
  extension [Self <: OptimizeCssInput](x: Self) {
    
    inline def setAutoprefixer(value: Boolean | AutoprefixerOptions): Self = StObject.set(x, "autoprefixer", value.asInstanceOf[js.Any])
    
    inline def setAutoprefixerNull: Self = StObject.set(x, "autoprefixer", null)
    
    inline def setAutoprefixerUndefined: Self = StObject.set(x, "autoprefixer", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setResolveUrl(value: /* url */ String => js.Promise[String] | String): Self = StObject.set(x, "resolveUrl", js.Any.fromFunction1(value))
    
    inline def setResolveUrlUndefined: Self = StObject.set(x, "resolveUrl", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}

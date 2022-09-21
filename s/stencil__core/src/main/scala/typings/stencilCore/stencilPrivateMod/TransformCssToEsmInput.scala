package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.cjs
import typings.stencilCore.stencilCoreStrings.esm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformCssToEsmInput extends StObject {
  
  var autoprefixer: js.UndefOr[Any] = js.undefined
  
  var commentOriginalSelector: js.UndefOr[Boolean] = js.undefined
  
  var docs: js.UndefOr[Boolean] = js.undefined
  
  var encapsulation: js.UndefOr[String] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var input: String
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var module: js.UndefOr[cjs | esm | String] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var styleImportData: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object TransformCssToEsmInput {
  
  inline def apply(input: String): TransformCssToEsmInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCssToEsmInput]
  }
  
  extension [Self <: TransformCssToEsmInput](x: Self) {
    
    inline def setAutoprefixer(value: Any): Self = StObject.set(x, "autoprefixer", value.asInstanceOf[js.Any])
    
    inline def setAutoprefixerUndefined: Self = StObject.set(x, "autoprefixer", js.undefined)
    
    inline def setCommentOriginalSelector(value: Boolean): Self = StObject.set(x, "commentOriginalSelector", value.asInstanceOf[js.Any])
    
    inline def setCommentOriginalSelectorUndefined: Self = StObject.set(x, "commentOriginalSelector", js.undefined)
    
    inline def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEncapsulation(value: String): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModule(value: cjs | esm | String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStyleImportData(value: String): Self = StObject.set(x, "styleImportData", value.asInstanceOf[js.Any])
    
    inline def setStyleImportDataUndefined: Self = StObject.set(x, "styleImportData", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}

package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserBuilderBaseOptions extends StObject {
  
  var assets: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var fileReplacements: js.UndefOr[js.Array[FileReplacements]] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var main: String
  
  var outputPath: js.UndefOr[String] = js.undefined
  
  var polyfills: String
  
  var scripts: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var tsConfig: String
}
object BrowserBuilderBaseOptions {
  
  inline def apply(main: String, polyfills: String, tsConfig: String): BrowserBuilderBaseOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], polyfills = polyfills.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserBuilderBaseOptions]
  }
  
  extension [Self <: BrowserBuilderBaseOptions](x: Self) {
    
    inline def setAssets(value: js.Array[js.Object | String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setFileReplacements(value: js.Array[FileReplacements]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
    
    inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
    
    inline def setFileReplacementsVarargs(value: FileReplacements*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPolyfills(value: String): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: js.Array[js.Object | String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStyles(value: js.Array[js.Object | String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
  }
}

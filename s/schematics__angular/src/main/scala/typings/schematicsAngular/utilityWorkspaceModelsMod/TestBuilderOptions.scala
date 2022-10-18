package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@schematics/angular.@schematics/angular/utility/workspace-models.BrowserBuilderBaseOptions> */
trait TestBuilderOptions extends StObject {
  
  var assets: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var fileReplacements: js.UndefOr[js.Array[FileReplacements]] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var karmaConfig: String
  
  var main: js.UndefOr[String] = js.undefined
  
  var outputPath: js.UndefOr[String] = js.undefined
  
  var polyfills: js.UndefOr[String] = js.undefined
  
  var scripts: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  var tsConfig: js.UndefOr[String] = js.undefined
}
object TestBuilderOptions {
  
  inline def apply(karmaConfig: String): TestBuilderOptions = {
    val __obj = js.Dynamic.literal(karmaConfig = karmaConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestBuilderOptions]
  }
  
  extension [Self <: TestBuilderOptions](x: Self) {
    
    inline def setAssets(value: js.Array[js.Object | String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setFileReplacements(value: js.Array[FileReplacements]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
    
    inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
    
    inline def setFileReplacementsVarargs(value: FileReplacements*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKarmaConfig(value: String): Self = StObject.set(x, "karmaConfig", value.asInstanceOf[js.Any])
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPolyfills(value: String): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
    
    inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
    
    inline def setScripts(value: js.Array[js.Object | String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setStyles(value: js.Array[js.Object | String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
    
    inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
  }
}

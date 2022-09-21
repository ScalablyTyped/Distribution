package typings.schematicsAngular.workspaceModelsMod

import typings.schematicsAngular.anon.Hidden
import typings.schematicsAngular.anon.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerBuilderOptions extends StObject {
  
  var fileReplacements: js.UndefOr[js.Array[FileReplacements]] = js.undefined
  
  var main: String
  
  var optimization: js.UndefOr[Boolean | Scripts] = js.undefined
  
  var outputPath: String
  
  var sourceMap: js.UndefOr[Boolean | Hidden] = js.undefined
  
  var tsConfig: String
}
object ServerBuilderOptions {
  
  inline def apply(main: String, outputPath: String, tsConfig: String): ServerBuilderOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerBuilderOptions]
  }
  
  extension [Self <: ServerBuilderOptions](x: Self) {
    
    inline def setFileReplacements(value: js.Array[FileReplacements]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
    
    inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
    
    inline def setFileReplacementsVarargs(value: FileReplacements*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setOptimization(value: Boolean | Scripts): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setSourceMap(value: Boolean | Hidden): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
  }
}

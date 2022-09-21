package typings.schematicsAngular.workspaceModelsMod

import typings.schematicsAngular.anon.MaximumError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserBuilderOptions
  extends StObject
     with BrowserBuilderBaseOptions {
  
  var aot: js.UndefOr[Boolean] = js.undefined
  
  var budgets: js.UndefOr[js.Array[MaximumError]] = js.undefined
  
  var buildOptimizer: js.UndefOr[Boolean] = js.undefined
  
  var extractLicenses: js.UndefOr[Boolean] = js.undefined
  
  var namedChunks: js.UndefOr[Boolean] = js.undefined
  
  var ngswConfigPath: js.UndefOr[String] = js.undefined
  
  var optimization: js.UndefOr[Boolean] = js.undefined
  
  var outputHashing: js.UndefOr[OutputHashing] = js.undefined
  
  var resourcesOutputPath: js.UndefOr[String] = js.undefined
  
  var serviceWorker: js.UndefOr[Boolean] = js.undefined
  
  var vendorChunk: js.UndefOr[Boolean] = js.undefined
  
  var webWorkerTsConfig: js.UndefOr[String] = js.undefined
}
object BrowserBuilderOptions {
  
  inline def apply(main: String, polyfills: String, tsConfig: String): BrowserBuilderOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], polyfills = polyfills.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserBuilderOptions]
  }
  
  extension [Self <: BrowserBuilderOptions](x: Self) {
    
    inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
    
    inline def setAotUndefined: Self = StObject.set(x, "aot", js.undefined)
    
    inline def setBudgets(value: js.Array[MaximumError]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: MaximumError*): Self = StObject.set(x, "budgets", js.Array(value*))
    
    inline def setBuildOptimizer(value: Boolean): Self = StObject.set(x, "buildOptimizer", value.asInstanceOf[js.Any])
    
    inline def setBuildOptimizerUndefined: Self = StObject.set(x, "buildOptimizer", js.undefined)
    
    inline def setExtractLicenses(value: Boolean): Self = StObject.set(x, "extractLicenses", value.asInstanceOf[js.Any])
    
    inline def setExtractLicensesUndefined: Self = StObject.set(x, "extractLicenses", js.undefined)
    
    inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
    
    inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
    
    inline def setNgswConfigPath(value: String): Self = StObject.set(x, "ngswConfigPath", value.asInstanceOf[js.Any])
    
    inline def setNgswConfigPathUndefined: Self = StObject.set(x, "ngswConfigPath", js.undefined)
    
    inline def setOptimization(value: Boolean): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
    
    inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
    
    inline def setResourcesOutputPath(value: String): Self = StObject.set(x, "resourcesOutputPath", value.asInstanceOf[js.Any])
    
    inline def setResourcesOutputPathUndefined: Self = StObject.set(x, "resourcesOutputPath", js.undefined)
    
    inline def setServiceWorker(value: Boolean): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
    
    inline def setServiceWorkerUndefined: Self = StObject.set(x, "serviceWorker", js.undefined)
    
    inline def setVendorChunk(value: Boolean): Self = StObject.set(x, "vendorChunk", value.asInstanceOf[js.Any])
    
    inline def setVendorChunkUndefined: Self = StObject.set(x, "vendorChunk", js.undefined)
    
    inline def setWebWorkerTsConfig(value: String): Self = StObject.set(x, "webWorkerTsConfig", value.asInstanceOf[js.Any])
    
    inline def setWebWorkerTsConfigUndefined: Self = StObject.set(x, "webWorkerTsConfig", js.undefined)
  }
}

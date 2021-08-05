package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  Types based on https://github.com/serverless/serverless/blob/master/docs/providers/aws/guide/serverless.yml.md
  */
trait Serverless extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  
  var app: js.UndefOr[String] = js.undefined
  
  var configValidationMode: js.UndefOr[String] = js.undefined
  
  var custom: js.UndefOr[Custom] = js.undefined
  
  var frameworkVersion: String
  
  var functions: js.UndefOr[Functions] = js.undefined
  
  var layers: js.UndefOr[Layers] = js.undefined
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  
  var provider: Provider
  
  var resources: js.UndefOr[Resources] = js.undefined
  
  var service: Service | String
  
  var tenant: js.UndefOr[String] = js.undefined
}
object Serverless {
  
  inline def apply(frameworkVersion: String, provider: Provider, service: Service | String): Serverless = {
    val __obj = js.Dynamic.literal(frameworkVersion = frameworkVersion.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  
  extension [Self <: Serverless](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setConfigValidationMode(value: String): Self = StObject.set(x, "configValidationMode", value.asInstanceOf[js.Any])
    
    inline def setConfigValidationModeUndefined: Self = StObject.set(x, "configValidationMode", js.undefined)
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setService(value: Service | String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

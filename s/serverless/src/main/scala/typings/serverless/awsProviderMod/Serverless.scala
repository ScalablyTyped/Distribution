package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  Types based on https://github.com/serverless/serverless/blob/master/docs/providers/aws/guide/serverless.yml.md
  */
@js.native
trait Serverless extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  
  var app: js.UndefOr[String] = js.native
  
  var configValidationMode: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[Custom] = js.native
  
  var frameworkVersion: String = js.native
  
  var functions: js.UndefOr[Functions] = js.native
  
  var layers: js.UndefOr[Layers] = js.native
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.native
  
  var plugins: js.UndefOr[js.Array[String]] = js.native
  
  var provider: Provider = js.native
  
  var resources: js.UndefOr[Resources] = js.native
  
  var service: Service | String = js.native
  
  var tenant: js.UndefOr[String] = js.native
}
object Serverless {
  
  @scala.inline
  def apply(frameworkVersion: String, provider: Provider, service: Service | String): Serverless = {
    val __obj = js.Dynamic.literal(frameworkVersion = frameworkVersion.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  
  @scala.inline
  implicit class ServerlessMutableBuilder[Self <: Serverless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setConfigValidationMode(value: String): Self = StObject.set(x, "configValidationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigValidationModeUndefined: Self = StObject.set(x, "configValidationMode", js.undefined)
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setService(value: Service | String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    @scala.inline
    def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

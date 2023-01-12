package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.`20210219`
import typings.serverless.serverlessStrings.`20210326`
import typings.serverless.serverlessStrings.error_
import typings.serverless.serverlessStrings.off
import typings.serverless.serverlessStrings.warn
import typings.serverless.serverlessStrings.warnColonsummary
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
  
  var configValidationMode: js.UndefOr[warn | error_ | off] = js.undefined
  
  var custom: js.UndefOr[Custom] = js.undefined
  
  var deprecationNotificationMode: js.UndefOr[warn | warnColonsummary | error_] = js.undefined
  
  var disabledDeprecations: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableLocalInstallationFallback: js.UndefOr[Boolean] = js.undefined
  
  var frameworkVersion: js.UndefOr[String] = js.undefined
  
  var functions: js.UndefOr[Functions] = js.undefined
  
  var layers: js.UndefOr[Layers] = js.undefined
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  
  var provider: Provider
  
  var resources: js.UndefOr[Resources] = js.undefined
  
  var service: Service | String
  
  var tenant: js.UndefOr[String] = js.undefined
  
  var unresolvedVariablesNotificationMode: js.UndefOr[warn | error_] = js.undefined
  
  var useDotenv: js.UndefOr[Boolean] = js.undefined
  
  var variablesResolutionMode: js.UndefOr[`20210219` | `20210326`] = js.undefined
}
object Serverless {
  
  inline def apply(provider: Provider, service: Service | String): Serverless = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serverless]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serverless] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setConfigValidationMode(value: warn | error_ | off): Self = StObject.set(x, "configValidationMode", value.asInstanceOf[js.Any])
    
    inline def setConfigValidationModeUndefined: Self = StObject.set(x, "configValidationMode", js.undefined)
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDeprecationNotificationMode(value: warn | warnColonsummary | error_): Self = StObject.set(x, "deprecationNotificationMode", value.asInstanceOf[js.Any])
    
    inline def setDeprecationNotificationModeUndefined: Self = StObject.set(x, "deprecationNotificationMode", js.undefined)
    
    inline def setDisabledDeprecations(value: js.Array[String]): Self = StObject.set(x, "disabledDeprecations", value.asInstanceOf[js.Any])
    
    inline def setDisabledDeprecationsUndefined: Self = StObject.set(x, "disabledDeprecations", js.undefined)
    
    inline def setDisabledDeprecationsVarargs(value: String*): Self = StObject.set(x, "disabledDeprecations", js.Array(value*))
    
    inline def setEnableLocalInstallationFallback(value: Boolean): Self = StObject.set(x, "enableLocalInstallationFallback", value.asInstanceOf[js.Any])
    
    inline def setEnableLocalInstallationFallbackUndefined: Self = StObject.set(x, "enableLocalInstallationFallback", js.undefined)
    
    inline def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
    
    inline def setFunctions(value: Functions): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setService(value: Service | String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    inline def setUnresolvedVariablesNotificationMode(value: warn | error_): Self = StObject.set(x, "unresolvedVariablesNotificationMode", value.asInstanceOf[js.Any])
    
    inline def setUnresolvedVariablesNotificationModeUndefined: Self = StObject.set(x, "unresolvedVariablesNotificationMode", js.undefined)
    
    inline def setUseDotenv(value: Boolean): Self = StObject.set(x, "useDotenv", value.asInstanceOf[js.Any])
    
    inline def setUseDotenvUndefined: Self = StObject.set(x, "useDotenv", js.undefined)
    
    inline def setVariablesResolutionMode(value: `20210219` | `20210326`): Self = StObject.set(x, "variablesResolutionMode", value.asInstanceOf[js.Any])
    
    inline def setVariablesResolutionModeUndefined: Self = StObject.set(x, "variablesResolutionMode", js.undefined)
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}

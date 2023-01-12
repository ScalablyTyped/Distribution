package typings.snyk

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConfigMod extends Shortcut {
  
  @JSImport("snyk/dist/lib/config", JSImport.Default)
  @js.native
  val default: Config = js.native
  
  trait Config extends StObject {
    
    var API: String
    
    var API_REST_URL: String
    
    var API_V3_URL: js.UndefOr[String] = js.undefined
    
    var CACHE_PATH: js.UndefOr[String] = js.undefined
    
    var CODE_CLIENT_PROXY_URL: String
    
    var DISABLE_ANALYTICS: Any
    
    var DRIFTCTL_PATH: js.UndefOr[String] = js.undefined
    
    var DRIFTCTL_URL: js.UndefOr[String] = js.undefined
    
    var IAC_BUNDLE_PATH: js.UndefOr[String] = js.undefined
    
    var IAC_POLICY_ENGINE_PATH: js.UndefOr[String] = js.undefined
    
    var MAX_PATH_COUNT: Double
    
    var PROJECT_NAME: String
    
    var PRUNE_DEPS_THRESHOLD: Double
    
    var PUBLIC_VULN_DB_URL: String
    
    var ROOT: String
    
    var TOKEN: String
    
    var api: String
    
    var disableSuggestions: String
    
    @JSName("org")
    var org_ : String
    
    var timeout: Double
  }
  object Config {
    
    inline def apply(
      API: String,
      API_REST_URL: String,
      CODE_CLIENT_PROXY_URL: String,
      DISABLE_ANALYTICS: Any,
      MAX_PATH_COUNT: Double,
      PROJECT_NAME: String,
      PRUNE_DEPS_THRESHOLD: Double,
      PUBLIC_VULN_DB_URL: String,
      ROOT: String,
      TOKEN: String,
      api: String,
      disableSuggestions: String,
      org_ : String,
      timeout: Double
    ): Config = {
      val __obj = js.Dynamic.literal(API = API.asInstanceOf[js.Any], API_REST_URL = API_REST_URL.asInstanceOf[js.Any], CODE_CLIENT_PROXY_URL = CODE_CLIENT_PROXY_URL.asInstanceOf[js.Any], DISABLE_ANALYTICS = DISABLE_ANALYTICS.asInstanceOf[js.Any], MAX_PATH_COUNT = MAX_PATH_COUNT.asInstanceOf[js.Any], PROJECT_NAME = PROJECT_NAME.asInstanceOf[js.Any], PRUNE_DEPS_THRESHOLD = PRUNE_DEPS_THRESHOLD.asInstanceOf[js.Any], PUBLIC_VULN_DB_URL = PUBLIC_VULN_DB_URL.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], TOKEN = TOKEN.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], disableSuggestions = disableSuggestions.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAPI(value: String): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
      
      inline def setAPI_REST_URL(value: String): Self = StObject.set(x, "API_REST_URL", value.asInstanceOf[js.Any])
      
      inline def setAPI_V3_URL(value: String): Self = StObject.set(x, "API_V3_URL", value.asInstanceOf[js.Any])
      
      inline def setAPI_V3_URLUndefined: Self = StObject.set(x, "API_V3_URL", js.undefined)
      
      inline def setCACHE_PATH(value: String): Self = StObject.set(x, "CACHE_PATH", value.asInstanceOf[js.Any])
      
      inline def setCACHE_PATHUndefined: Self = StObject.set(x, "CACHE_PATH", js.undefined)
      
      inline def setCODE_CLIENT_PROXY_URL(value: String): Self = StObject.set(x, "CODE_CLIENT_PROXY_URL", value.asInstanceOf[js.Any])
      
      inline def setDISABLE_ANALYTICS(value: Any): Self = StObject.set(x, "DISABLE_ANALYTICS", value.asInstanceOf[js.Any])
      
      inline def setDRIFTCTL_PATH(value: String): Self = StObject.set(x, "DRIFTCTL_PATH", value.asInstanceOf[js.Any])
      
      inline def setDRIFTCTL_PATHUndefined: Self = StObject.set(x, "DRIFTCTL_PATH", js.undefined)
      
      inline def setDRIFTCTL_URL(value: String): Self = StObject.set(x, "DRIFTCTL_URL", value.asInstanceOf[js.Any])
      
      inline def setDRIFTCTL_URLUndefined: Self = StObject.set(x, "DRIFTCTL_URL", js.undefined)
      
      inline def setDisableSuggestions(value: String): Self = StObject.set(x, "disableSuggestions", value.asInstanceOf[js.Any])
      
      inline def setIAC_BUNDLE_PATH(value: String): Self = StObject.set(x, "IAC_BUNDLE_PATH", value.asInstanceOf[js.Any])
      
      inline def setIAC_BUNDLE_PATHUndefined: Self = StObject.set(x, "IAC_BUNDLE_PATH", js.undefined)
      
      inline def setIAC_POLICY_ENGINE_PATH(value: String): Self = StObject.set(x, "IAC_POLICY_ENGINE_PATH", value.asInstanceOf[js.Any])
      
      inline def setIAC_POLICY_ENGINE_PATHUndefined: Self = StObject.set(x, "IAC_POLICY_ENGINE_PATH", js.undefined)
      
      inline def setMAX_PATH_COUNT(value: Double): Self = StObject.set(x, "MAX_PATH_COUNT", value.asInstanceOf[js.Any])
      
      inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setPROJECT_NAME(value: String): Self = StObject.set(x, "PROJECT_NAME", value.asInstanceOf[js.Any])
      
      inline def setPRUNE_DEPS_THRESHOLD(value: Double): Self = StObject.set(x, "PRUNE_DEPS_THRESHOLD", value.asInstanceOf[js.Any])
      
      inline def setPUBLIC_VULN_DB_URL(value: String): Self = StObject.set(x, "PUBLIC_VULN_DB_URL", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
      
      inline def setTOKEN(value: String): Self = StObject.set(x, "TOKEN", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Config
  
  /* This means you don't have to write `default`, but can instead just say `distLibConfigMod.foo` */
  override def _to: Config = default
}

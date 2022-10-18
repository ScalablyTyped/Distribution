package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastTypesMod {
  
  trait LocalCodeEngine extends StObject {
    
    var allowCloudUpload: Boolean
    
    var enabled: Boolean
    
    var url: String
  }
  object LocalCodeEngine {
    
    inline def apply(allowCloudUpload: Boolean, enabled: Boolean, url: String): LocalCodeEngine = {
      val __obj = js.Dynamic.literal(allowCloudUpload = allowCloudUpload.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalCodeEngine]
    }
    
    extension [Self <: LocalCodeEngine](x: Self) {
      
      inline def setAllowCloudUpload(value: Boolean): Self = StObject.set(x, "allowCloudUpload", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SastSettings extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var localCodeEngine: LocalCodeEngine
    
    @JSName("org")
    var org_ : js.UndefOr[String] = js.undefined
    
    var sastEnabled: Boolean
    
    var supportedLanguages: js.UndefOr[js.Array[String]] = js.undefined
    
    var userMessage: js.UndefOr[String] = js.undefined
  }
  object SastSettings {
    
    inline def apply(localCodeEngine: LocalCodeEngine, sastEnabled: Boolean): SastSettings = {
      val __obj = js.Dynamic.literal(localCodeEngine = localCodeEngine.asInstanceOf[js.Any], sastEnabled = sastEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[SastSettings]
    }
    
    extension [Self <: SastSettings](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLocalCodeEngine(value: LocalCodeEngine): Self = StObject.set(x, "localCodeEngine", value.asInstanceOf[js.Any])
      
      inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
      
      inline def setSastEnabled(value: Boolean): Self = StObject.set(x, "sastEnabled", value.asInstanceOf[js.Any])
      
      inline def setSupportedLanguages(value: js.Array[String]): Self = StObject.set(x, "supportedLanguages", value.asInstanceOf[js.Any])
      
      inline def setSupportedLanguagesUndefined: Self = StObject.set(x, "supportedLanguages", js.undefined)
      
      inline def setSupportedLanguagesVarargs(value: String*): Self = StObject.set(x, "supportedLanguages", js.Array(value*))
      
      inline def setUserMessage(value: String): Self = StObject.set(x, "userMessage", value.asInstanceOf[js.Any])
      
      inline def setUserMessageUndefined: Self = StObject.set(x, "userMessage", js.undefined)
    }
  }
  
  trait TrackUsageResponse extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var userMessage: js.UndefOr[String] = js.undefined
  }
  object TrackUsageResponse {
    
    inline def apply(): TrackUsageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackUsageResponse]
    }
    
    extension [Self <: TrackUsageResponse](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setUserMessage(value: String): Self = StObject.set(x, "userMessage", value.asInstanceOf[js.Any])
      
      inline def setUserMessageUndefined: Self = StObject.set(x, "userMessage", js.undefined)
    }
  }
}

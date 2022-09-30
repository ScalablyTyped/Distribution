package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var api_name: js.UndefOr[String] = js.undefined
  
  var automation_backend: js.UndefOr[String] = js.undefined
  
  var deprecated_backend_versions: js.UndefOr[js.Array[String]] = js.undefined
  
  var device: js.UndefOr[String] = js.undefined
  
  var latest_stable_version: js.UndefOr[String] = js.undefined
  
  var long_name: js.UndefOr[String] = js.undefined
  
  var long_version: js.UndefOr[String] = js.undefined
  
  var os: js.UndefOr[String] = js.undefined
  
  var recommended_backend_version: js.UndefOr[String] = js.undefined
  
  var short_version: js.UndefOr[String] = js.undefined
  
  var supported_backend_versions: js.UndefOr[js.Array[String]] = js.undefined
}
object Platform {
  
  inline def apply(): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Platform]
  }
  
  extension [Self <: Platform](x: Self) {
    
    inline def setApi_name(value: String): Self = StObject.set(x, "api_name", value.asInstanceOf[js.Any])
    
    inline def setApi_nameUndefined: Self = StObject.set(x, "api_name", js.undefined)
    
    inline def setAutomation_backend(value: String): Self = StObject.set(x, "automation_backend", value.asInstanceOf[js.Any])
    
    inline def setAutomation_backendUndefined: Self = StObject.set(x, "automation_backend", js.undefined)
    
    inline def setDeprecated_backend_versions(value: js.Array[String]): Self = StObject.set(x, "deprecated_backend_versions", value.asInstanceOf[js.Any])
    
    inline def setDeprecated_backend_versionsUndefined: Self = StObject.set(x, "deprecated_backend_versions", js.undefined)
    
    inline def setDeprecated_backend_versionsVarargs(value: String*): Self = StObject.set(x, "deprecated_backend_versions", js.Array(value*))
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setLatest_stable_version(value: String): Self = StObject.set(x, "latest_stable_version", value.asInstanceOf[js.Any])
    
    inline def setLatest_stable_versionUndefined: Self = StObject.set(x, "latest_stable_version", js.undefined)
    
    inline def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    inline def setLong_nameUndefined: Self = StObject.set(x, "long_name", js.undefined)
    
    inline def setLong_version(value: String): Self = StObject.set(x, "long_version", value.asInstanceOf[js.Any])
    
    inline def setLong_versionUndefined: Self = StObject.set(x, "long_version", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setRecommended_backend_version(value: String): Self = StObject.set(x, "recommended_backend_version", value.asInstanceOf[js.Any])
    
    inline def setRecommended_backend_versionUndefined: Self = StObject.set(x, "recommended_backend_version", js.undefined)
    
    inline def setShort_version(value: String): Self = StObject.set(x, "short_version", value.asInstanceOf[js.Any])
    
    inline def setShort_versionUndefined: Self = StObject.set(x, "short_version", js.undefined)
    
    inline def setSupported_backend_versions(value: js.Array[String]): Self = StObject.set(x, "supported_backend_versions", value.asInstanceOf[js.Any])
    
    inline def setSupported_backend_versionsUndefined: Self = StObject.set(x, "supported_backend_versions", js.undefined)
    
    inline def setSupported_backend_versionsVarargs(value: String*): Self = StObject.set(x, "supported_backend_versions", js.Array(value*))
  }
}

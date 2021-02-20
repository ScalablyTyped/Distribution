package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Platform
  extends /* key */ StringDictionary[js.Any] {
  
  var api_name: js.UndefOr[String] = js.native
  
  var automation_backend: js.UndefOr[String] = js.native
  
  var deprecated_backend_versions: js.UndefOr[js.Array[String]] = js.native
  
  var device: js.UndefOr[String] = js.native
  
  var latest_stable_version: js.UndefOr[String] = js.native
  
  var long_name: js.UndefOr[String] = js.native
  
  var long_version: js.UndefOr[String] = js.native
  
  var os: js.UndefOr[String] = js.native
  
  var recommended_backend_version: js.UndefOr[String] = js.native
  
  var short_version: js.UndefOr[String] = js.native
  
  var supported_backend_versions: js.UndefOr[js.Array[String]] = js.native
}
object Platform {
  
  @scala.inline
  def apply(): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Platform]
  }
  
  @scala.inline
  implicit class PlatformMutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_name(value: String): Self = StObject.set(x, "api_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_nameUndefined: Self = StObject.set(x, "api_name", js.undefined)
    
    @scala.inline
    def setAutomation_backend(value: String): Self = StObject.set(x, "automation_backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomation_backendUndefined: Self = StObject.set(x, "automation_backend", js.undefined)
    
    @scala.inline
    def setDeprecated_backend_versions(value: js.Array[String]): Self = StObject.set(x, "deprecated_backend_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated_backend_versionsUndefined: Self = StObject.set(x, "deprecated_backend_versions", js.undefined)
    
    @scala.inline
    def setDeprecated_backend_versionsVarargs(value: String*): Self = StObject.set(x, "deprecated_backend_versions", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setLatest_stable_version(value: String): Self = StObject.set(x, "latest_stable_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_stable_versionUndefined: Self = StObject.set(x, "latest_stable_version", js.undefined)
    
    @scala.inline
    def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong_nameUndefined: Self = StObject.set(x, "long_name", js.undefined)
    
    @scala.inline
    def setLong_version(value: String): Self = StObject.set(x, "long_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong_versionUndefined: Self = StObject.set(x, "long_version", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    @scala.inline
    def setRecommended_backend_version(value: String): Self = StObject.set(x, "recommended_backend_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommended_backend_versionUndefined: Self = StObject.set(x, "recommended_backend_version", js.undefined)
    
    @scala.inline
    def setShort_version(value: String): Self = StObject.set(x, "short_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_versionUndefined: Self = StObject.set(x, "short_version", js.undefined)
    
    @scala.inline
    def setSupported_backend_versions(value: js.Array[String]): Self = StObject.set(x, "supported_backend_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported_backend_versionsUndefined: Self = StObject.set(x, "supported_backend_versions", js.undefined)
    
    @scala.inline
    def setSupported_backend_versionsVarargs(value: String*): Self = StObject.set(x, "supported_backend_versions", js.Array(value :_*))
  }
}

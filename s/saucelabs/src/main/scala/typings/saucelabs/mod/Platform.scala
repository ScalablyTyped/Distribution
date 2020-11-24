package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class PlatformOps[Self <: Platform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi_name(value: String): Self = this.set("api_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi_name: Self = this.set("api_name", js.undefined)
    
    @scala.inline
    def setAutomation_backend(value: String): Self = this.set("automation_backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomation_backend: Self = this.set("automation_backend", js.undefined)
    
    @scala.inline
    def setDeprecated_backend_versionsVarargs(value: String*): Self = this.set("deprecated_backend_versions", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated_backend_versions(value: js.Array[String]): Self = this.set("deprecated_backend_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated_backend_versions: Self = this.set("deprecated_backend_versions", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setLatest_stable_version(value: String): Self = this.set("latest_stable_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatest_stable_version: Self = this.set("latest_stable_version", js.undefined)
    
    @scala.inline
    def setLong_name(value: String): Self = this.set("long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong_name: Self = this.set("long_name", js.undefined)
    
    @scala.inline
    def setLong_version(value: String): Self = this.set("long_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong_version: Self = this.set("long_version", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setRecommended_backend_version(value: String): Self = this.set("recommended_backend_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommended_backend_version: Self = this.set("recommended_backend_version", js.undefined)
    
    @scala.inline
    def setShort_version(value: String): Self = this.set("short_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_version: Self = this.set("short_version", js.undefined)
    
    @scala.inline
    def setSupported_backend_versionsVarargs(value: String*): Self = this.set("supported_backend_versions", js.Array(value :_*))
    
    @scala.inline
    def setSupported_backend_versions(value: js.Array[String]): Self = this.set("supported_backend_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupported_backend_versions: Self = this.set("supported_backend_versions", js.undefined)
  }
}

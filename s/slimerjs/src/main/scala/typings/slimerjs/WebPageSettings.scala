package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPageSettings extends StObject {
  
  var XSSAuditingEnabled: Boolean = js.native
  
  var javascriptEnabled: Boolean = js.native
  
  var loadImages: Boolean = js.native
  
  var localToRemoteUrlAccessEnabled: Boolean = js.native
  
  var password: String = js.native
  
  var resourceTimeout: Double = js.native
  
  var userAgent: String = js.native
  
  var userName: String = js.native
  
  var webSecurityEnabled: Boolean = js.native
}
object WebPageSettings {
  
  @scala.inline
  def apply(
    XSSAuditingEnabled: Boolean,
    javascriptEnabled: Boolean,
    loadImages: Boolean,
    localToRemoteUrlAccessEnabled: Boolean,
    password: String,
    resourceTimeout: Double,
    userAgent: String,
    userName: String,
    webSecurityEnabled: Boolean
  ): WebPageSettings = {
    val __obj = js.Dynamic.literal(XSSAuditingEnabled = XSSAuditingEnabled.asInstanceOf[js.Any], javascriptEnabled = javascriptEnabled.asInstanceOf[js.Any], loadImages = loadImages.asInstanceOf[js.Any], localToRemoteUrlAccessEnabled = localToRemoteUrlAccessEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], webSecurityEnabled = webSecurityEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageSettings]
  }
  
  @scala.inline
  implicit class WebPageSettingsMutableBuilder[Self <: WebPageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadImages(value: Boolean): Self = StObject.set(x, "loadImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalToRemoteUrlAccessEnabled(value: Boolean): Self = StObject.set(x, "localToRemoteUrlAccessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTimeout(value: Double): Self = StObject.set(x, "resourceTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSecurityEnabled(value: Boolean): Self = StObject.set(x, "webSecurityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXSSAuditingEnabled(value: Boolean): Self = StObject.set(x, "XSSAuditingEnabled", value.asInstanceOf[js.Any])
  }
}

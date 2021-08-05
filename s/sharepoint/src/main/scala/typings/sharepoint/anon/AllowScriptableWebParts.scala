package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowScriptableWebParts extends StObject {
  
  var AllowScriptableWebParts: Boolean
  
  var CurrentUserId: Double
  
  var EffectivePresenceEnabled: Boolean
  
  var LCID: String
  
  var PermissionCustomizePages: Boolean
  
  var WebUrl: String
}
object AllowScriptableWebParts {
  
  inline def apply(
    AllowScriptableWebParts: Boolean,
    CurrentUserId: Double,
    EffectivePresenceEnabled: Boolean,
    LCID: String,
    PermissionCustomizePages: Boolean,
    WebUrl: String
  ): AllowScriptableWebParts = {
    val __obj = js.Dynamic.literal(AllowScriptableWebParts = AllowScriptableWebParts.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], EffectivePresenceEnabled = EffectivePresenceEnabled.asInstanceOf[js.Any], LCID = LCID.asInstanceOf[js.Any], PermissionCustomizePages = PermissionCustomizePages.asInstanceOf[js.Any], WebUrl = WebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowScriptableWebParts]
  }
  
  extension [Self <: AllowScriptableWebParts](x: Self) {
    
    inline def setAllowScriptableWebParts(value: Boolean): Self = StObject.set(x, "AllowScriptableWebParts", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserId(value: Double): Self = StObject.set(x, "CurrentUserId", value.asInstanceOf[js.Any])
    
    inline def setEffectivePresenceEnabled(value: Boolean): Self = StObject.set(x, "EffectivePresenceEnabled", value.asInstanceOf[js.Any])
    
    inline def setLCID(value: String): Self = StObject.set(x, "LCID", value.asInstanceOf[js.Any])
    
    inline def setPermissionCustomizePages(value: Boolean): Self = StObject.set(x, "PermissionCustomizePages", value.asInstanceOf[js.Any])
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
  }
}

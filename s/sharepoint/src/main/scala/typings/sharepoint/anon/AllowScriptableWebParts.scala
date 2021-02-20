package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowScriptableWebParts extends StObject {
  
  var AllowScriptableWebParts: Boolean = js.native
  
  var CurrentUserId: Double = js.native
  
  var EffectivePresenceEnabled: Boolean = js.native
  
  var LCID: String = js.native
  
  var PermissionCustomizePages: Boolean = js.native
  
  var WebUrl: String = js.native
}
object AllowScriptableWebParts {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AllowScriptableWebPartsMutableBuilder[Self <: AllowScriptableWebParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowScriptableWebParts(value: Boolean): Self = StObject.set(x, "AllowScriptableWebParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserId(value: Double): Self = StObject.set(x, "CurrentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePresenceEnabled(value: Boolean): Self = StObject.set(x, "EffectivePresenceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLCID(value: String): Self = StObject.set(x, "LCID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionCustomizePages(value: Boolean): Self = StObject.set(x, "PermissionCustomizePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
  }
}

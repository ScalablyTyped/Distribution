package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowScriptableWebParts extends js.Object {
  
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
  implicit class AllowScriptableWebPartsOps[Self <: AllowScriptableWebParts] (val x: Self) extends AnyVal {
    
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
    def setAllowScriptableWebParts(value: Boolean): Self = this.set("AllowScriptableWebParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserId(value: Double): Self = this.set("CurrentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePresenceEnabled(value: Boolean): Self = this.set("EffectivePresenceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLCID(value: String): Self = this.set("LCID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionCustomizePages(value: Boolean): Self = this.set("PermissionCustomizePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrl(value: String): Self = this.set("WebUrl", value.asInstanceOf[js.Any])
  }
}

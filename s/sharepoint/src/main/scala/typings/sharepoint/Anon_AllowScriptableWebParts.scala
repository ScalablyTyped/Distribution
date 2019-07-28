package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowScriptableWebParts extends js.Object {
  var AllowScriptableWebParts: Boolean
  var CurrentUserId: Double
  var EffectivePresenceEnabled: Boolean
  var LCID: String
  var PermissionCustomizePages: Boolean
  var WebUrl: String
}

object Anon_AllowScriptableWebParts {
  @scala.inline
  def apply(
    AllowScriptableWebParts: Boolean,
    CurrentUserId: Double,
    EffectivePresenceEnabled: Boolean,
    LCID: String,
    PermissionCustomizePages: Boolean,
    WebUrl: String
  ): Anon_AllowScriptableWebParts = {
    val __obj = js.Dynamic.literal(AllowScriptableWebParts = AllowScriptableWebParts, CurrentUserId = CurrentUserId, EffectivePresenceEnabled = EffectivePresenceEnabled, LCID = LCID, PermissionCustomizePages = PermissionCustomizePages, WebUrl = WebUrl)
  
    __obj.asInstanceOf[Anon_AllowScriptableWebParts]
  }
}


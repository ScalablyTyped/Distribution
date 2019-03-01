package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowScriptableWebParts extends js.Object {
  var AllowScriptableWebParts: scala.Boolean
  var CurrentUserId: scala.Double
  var EffectivePresenceEnabled: scala.Boolean
  var LCID: java.lang.String
  var PermissionCustomizePages: scala.Boolean
  var WebUrl: java.lang.String
}

object Anon_AllowScriptableWebParts {
  @scala.inline
  def apply(
    AllowScriptableWebParts: scala.Boolean,
    CurrentUserId: scala.Double,
    EffectivePresenceEnabled: scala.Boolean,
    LCID: java.lang.String,
    PermissionCustomizePages: scala.Boolean,
    WebUrl: java.lang.String
  ): Anon_AllowScriptableWebParts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowScriptableWebParts")(AllowScriptableWebParts)
    __obj.updateDynamic("CurrentUserId")(CurrentUserId)
    __obj.updateDynamic("EffectivePresenceEnabled")(EffectivePresenceEnabled)
    __obj.updateDynamic("LCID")(LCID)
    __obj.updateDynamic("PermissionCustomizePages")(PermissionCustomizePages)
    __obj.updateDynamic("WebUrl")(WebUrl)
    __obj.asInstanceOf[Anon_AllowScriptableWebParts]
  }
}


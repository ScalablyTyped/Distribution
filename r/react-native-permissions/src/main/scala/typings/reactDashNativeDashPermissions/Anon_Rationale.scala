package typings.reactDashNativeDashPermissions

import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsMod.Rationale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rationale extends js.Object {
  var rationale: js.UndefOr[Rationale] = js.undefined
  var `type`: String
}

object Anon_Rationale {
  @scala.inline
  def apply(`type`: String, rationale: Rationale = null): Anon_Rationale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (rationale != null) __obj.updateDynamic("rationale")(rationale)
    __obj.asInstanceOf[Anon_Rationale]
  }
}


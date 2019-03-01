package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERT extends js.Object {
  var ALERT: reactDashFoundationLib.enumsMod.BadgeColors
  var INFO: reactDashFoundationLib.enumsMod.BadgeColors
  var SECONDARY: reactDashFoundationLib.enumsMod.BadgeColors
  var SUCCESS: reactDashFoundationLib.enumsMod.BadgeColors
  var WARNING: reactDashFoundationLib.enumsMod.BadgeColors
}

object Anon_ALERT {
  @scala.inline
  def apply(
    ALERT: reactDashFoundationLib.enumsMod.BadgeColors,
    INFO: reactDashFoundationLib.enumsMod.BadgeColors,
    SECONDARY: reactDashFoundationLib.enumsMod.BadgeColors,
    SUCCESS: reactDashFoundationLib.enumsMod.BadgeColors,
    WARNING: reactDashFoundationLib.enumsMod.BadgeColors
  ): Anon_ALERT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALERT")(ALERT)
    __obj.updateDynamic("INFO")(INFO)
    __obj.updateDynamic("SECONDARY")(SECONDARY)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_ALERT]
  }
}


package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERTSECONDARY extends js.Object {
  var ALERT: reactDashFoundationLib.enumsMod.ProgressColors
  var SECONDARY: reactDashFoundationLib.enumsMod.ProgressColors
  var SUCCESS: reactDashFoundationLib.enumsMod.ProgressColors
  var WARNING: reactDashFoundationLib.enumsMod.ProgressColors
}

object Anon_ALERTSECONDARY {
  @scala.inline
  def apply(
    ALERT: reactDashFoundationLib.enumsMod.ProgressColors,
    SECONDARY: reactDashFoundationLib.enumsMod.ProgressColors,
    SUCCESS: reactDashFoundationLib.enumsMod.ProgressColors,
    WARNING: reactDashFoundationLib.enumsMod.ProgressColors
  ): Anon_ALERTSECONDARY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALERT")(ALERT)
    __obj.updateDynamic("SECONDARY")(SECONDARY)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_ALERTSECONDARY]
  }
}


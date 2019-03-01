package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERTPRIMARY extends js.Object {
  var ALERT: reactDashFoundationLib.enumsMod.ButtonColors
  var PRIMARY: reactDashFoundationLib.enumsMod.ButtonColors
  var SECONDARY: reactDashFoundationLib.enumsMod.ButtonColors
  var SUCCESS: reactDashFoundationLib.enumsMod.ButtonColors
  var WARNING: reactDashFoundationLib.enumsMod.ButtonColors
}

object Anon_ALERTPRIMARY {
  @scala.inline
  def apply(
    ALERT: reactDashFoundationLib.enumsMod.ButtonColors,
    PRIMARY: reactDashFoundationLib.enumsMod.ButtonColors,
    SECONDARY: reactDashFoundationLib.enumsMod.ButtonColors,
    SUCCESS: reactDashFoundationLib.enumsMod.ButtonColors,
    WARNING: reactDashFoundationLib.enumsMod.ButtonColors
  ): Anon_ALERTPRIMARY = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALERT")(ALERT)
    __obj.updateDynamic("PRIMARY")(PRIMARY)
    __obj.updateDynamic("SECONDARY")(SECONDARY)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_ALERTPRIMARY]
  }
}


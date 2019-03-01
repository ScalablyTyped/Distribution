package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LARGE extends js.Object {
  var LARGE: reactDashFoundationLib.enumsMod.Breakpoints
  var MEDIUM: reactDashFoundationLib.enumsMod.Breakpoints
  var SMALL: reactDashFoundationLib.enumsMod.Breakpoints
  var XLARGE: reactDashFoundationLib.enumsMod.Breakpoints
  var XXLARGE: reactDashFoundationLib.enumsMod.Breakpoints
}

object Anon_LARGE {
  @scala.inline
  def apply(
    LARGE: reactDashFoundationLib.enumsMod.Breakpoints,
    MEDIUM: reactDashFoundationLib.enumsMod.Breakpoints,
    SMALL: reactDashFoundationLib.enumsMod.Breakpoints,
    XLARGE: reactDashFoundationLib.enumsMod.Breakpoints,
    XXLARGE: reactDashFoundationLib.enumsMod.Breakpoints
  ): Anon_LARGE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LARGE")(LARGE)
    __obj.updateDynamic("MEDIUM")(MEDIUM)
    __obj.updateDynamic("SMALL")(SMALL)
    __obj.updateDynamic("XLARGE")(XLARGE)
    __obj.updateDynamic("XXLARGE")(XXLARGE)
    __obj.asInstanceOf[Anon_LARGE]
  }
}


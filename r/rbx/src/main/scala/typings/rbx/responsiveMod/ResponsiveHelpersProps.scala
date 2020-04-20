package typings.rbx.responsiveMod

import typings.rbx.BinVariablesbreakpointsLi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveHelpersProps extends js.Object {
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
}

object ResponsiveHelpersProps {
  @scala.inline
  def apply(responsive: BinVariablesbreakpointsLi = null): ResponsiveHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveHelpersProps]
  }
}


package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var tipProps: js.UndefOr[stdLib.Partial[rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs.Props]] = js.undefined
}

object WithTooltipProps {
  @scala.inline
  def apply(
    tipFormatter: js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNs.ReactNode] = null,
    tipProps: stdLib.Partial[rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs.Props] = null
  ): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(tipFormatter)
    if (tipProps != null) __obj.updateDynamic("tipProps")(tipProps)
    __obj.asInstanceOf[WithTooltipProps]
  }
}


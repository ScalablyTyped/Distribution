package typings.rcSlider.mod

import typings.rcTooltip.mod.RCTooltip.Props
import typings.react.mod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.undefined
  var tipProps: js.UndefOr[Partial[Props]] = js.undefined
}

object WithTooltipProps {
  @scala.inline
  def apply(tipFormatter: /* value */ Double => ReactNode = null, tipProps: Partial[Props] = null): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tipProps != null) __obj.updateDynamic("tipProps")(tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipProps]
  }
}


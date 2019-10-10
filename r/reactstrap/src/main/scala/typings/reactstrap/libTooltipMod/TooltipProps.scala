package typings.reactstrap.libTooltipMod

import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends UncontrolledTooltipProps {
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    UncontrolledTooltipProps: UncontrolledTooltipProps = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    toggle: MouseEventHandler[_] | js.Function0[Unit] = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, UncontrolledTooltipProps)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}


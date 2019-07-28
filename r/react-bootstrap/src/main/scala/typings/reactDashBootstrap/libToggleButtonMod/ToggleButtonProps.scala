package typings.reactDashBootstrap.libToggleButtonMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps extends HTMLProps[ToggleButton] {
  @JSName("value")
  var value_ToggleButtonProps: Double | String
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    value: Double | String,
    HTMLProps: HTMLProps[ToggleButton] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): ToggleButtonProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ToggleButtonProps]
  }
}


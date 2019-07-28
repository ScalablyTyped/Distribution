package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps
  extends HTMLProps[js.Any]
     with RippleComponent {
  @JSName("onChange")
  var onChange_SwitchProps: js.UndefOr[FormEventHandler[Switch]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: FormEventHandler[Switch] = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[SwitchProps]
  }
}


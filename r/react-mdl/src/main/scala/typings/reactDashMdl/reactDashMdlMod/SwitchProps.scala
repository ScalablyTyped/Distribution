package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with RippleComponent {
  @JSName("onChange")
  var onChange_SwitchProps: js.UndefOr[FormEventHandler[Switch]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    RippleComponent: RippleComponent = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: FormEvent[Switch] => Unit = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SwitchProps]
  }
}


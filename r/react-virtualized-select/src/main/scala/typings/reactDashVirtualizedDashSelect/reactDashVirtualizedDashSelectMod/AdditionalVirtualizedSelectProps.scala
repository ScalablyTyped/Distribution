package typings.reactDashVirtualizedDashSelect.reactDashVirtualizedDashSelectMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var optionHeight: js.UndefOr[Double] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.undefined
  var selectComponent: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
}

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](
    maxHeight: Int | Double = null,
    optionHeight: Int | Double = null,
    optionRenderer: /* options */ VirtualizedOptionRenderOptions[TValue] => Element = null,
    selectComponent: (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null
  ): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (optionHeight != null) __obj.updateDynamic("optionHeight")(optionHeight.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(selectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
}


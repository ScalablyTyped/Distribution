package typings.reactVirtualizedSelect.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
import typings.reactVirtualizedSelect.anon.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.undefined
  var selectComponent: js.UndefOr[(ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
}

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](
    maxHeight: js.UndefOr[Double] = js.undefined,
    optionHeight: Double | (js.Function1[/* options */ Option[TValue], Double]) = null,
    optionRenderer: /* options */ VirtualizedOptionRenderOptions[TValue] => Element = null,
    selectComponent: (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null
  ): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (optionHeight != null) __obj.updateDynamic("optionHeight")(optionHeight.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(selectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
}


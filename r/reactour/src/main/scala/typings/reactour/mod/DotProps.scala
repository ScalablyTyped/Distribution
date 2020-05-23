package typings.reactour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'button' extends react.react.ComponentClass<infer P, react.react.ComponentState> ? react.react.PropsWithoutRef<any> & react.react.RefAttributes<std.InstanceType<'button'>> : react.react.PropsWithRef<react.react.ComponentProps<'button'>> */ trait DotProps extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var showNumber: js.UndefOr[Boolean] = js.undefined
}

object DotProps {
  @scala.inline
  def apply(
    accentColor: String = null,
    current: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    showNumber: js.UndefOr[Boolean] = js.undefined
  ): DotProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotProps]
  }
}


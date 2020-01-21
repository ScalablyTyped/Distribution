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
    current: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    showNumber: js.UndefOr[Boolean] = js.undefined
  ): DotProps = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotProps]
  }
}


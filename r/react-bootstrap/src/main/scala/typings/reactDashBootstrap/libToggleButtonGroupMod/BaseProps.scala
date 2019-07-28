package typings.reactDashBootstrap.libToggleButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /**
    * You'll usually want to use string|number|string[]|number[] here,
    * but you can technically use any|any[].
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * You'll usually want to use string|number|string[]|number[] here,
    * but you can technically use any|any[].
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(defaultValue: js.Any = null, value: js.Any = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BaseProps]
  }
}


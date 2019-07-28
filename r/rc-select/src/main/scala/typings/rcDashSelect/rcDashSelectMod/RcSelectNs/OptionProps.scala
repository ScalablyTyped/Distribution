package typings.rcDashSelect.rcDashSelectMod.RcSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OptionProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    title: String = null,
    value: String = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionProps]
  }
}


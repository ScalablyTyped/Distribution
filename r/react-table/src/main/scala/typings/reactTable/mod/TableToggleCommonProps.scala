package typings.reactTable.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableToggleCommonProps extends TableCommonProps {
  var checked: js.UndefOr[Boolean] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TableToggleCommonProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    role: String = null,
    style: CSSProperties = null,
    title: String = null
  ): TableToggleCommonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToggleCommonProps]
  }
}


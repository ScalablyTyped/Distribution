package typings.rmcDashPicker.libPickerMixinMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object IItemProps {
  @scala.inline
  def apply(value: js.Any, children: ReactNode = null, className: String = null): IItemProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IItemProps]
  }
}


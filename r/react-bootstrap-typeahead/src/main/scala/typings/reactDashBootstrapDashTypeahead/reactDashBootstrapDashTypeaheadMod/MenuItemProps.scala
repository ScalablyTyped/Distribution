package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps[T /* <: TypeaheadModel */] extends BaseMenuItemProps {
  var option: T
  var position: Double
}

object MenuItemProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](option: T, position: Double, BaseMenuItemProps: BaseMenuItemProps = null, label: String = null): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position)
    js.Dynamic.global.Object.assign(__obj, BaseMenuItemProps)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[MenuItemProps[T]]
  }
}


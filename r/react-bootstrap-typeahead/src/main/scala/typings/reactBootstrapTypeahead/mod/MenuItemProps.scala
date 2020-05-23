package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps[T /* <: TypeaheadModel */] extends BaseMenuItemProps {
  var option: T
  var position: Double
}

object MenuItemProps {
  @scala.inline
  def apply[T](option: T, position: Double, BaseMenuItemProps: BaseMenuItemProps = null): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (BaseMenuItemProps != null) js.Dynamic.global.Object.assign(__obj, BaseMenuItemProps)
    __obj.asInstanceOf[MenuItemProps[T]]
  }
}


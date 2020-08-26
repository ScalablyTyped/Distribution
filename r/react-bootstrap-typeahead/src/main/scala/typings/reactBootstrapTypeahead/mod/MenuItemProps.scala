package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps[T /* <: TypeaheadModel */] extends BaseMenuItemProps {
  var option: T = js.native
  var position: Double = js.native
}

object MenuItemProps {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](option: T, position: Double): MenuItemProps[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps[T]]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps[_], /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T] (val x: Self with MenuItemProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOption(value: T): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}


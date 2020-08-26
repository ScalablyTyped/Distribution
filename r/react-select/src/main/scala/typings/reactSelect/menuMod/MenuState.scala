package typings.reactSelect.menuMod

import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuState extends js.Object {
  var maxHeight: Double = js.native
  var placement: bottom | top | Null = js.native
}

object MenuState {
  @scala.inline
  def apply(maxHeight: Double): MenuState = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
  @scala.inline
  implicit class MenuStateOps[Self <: MenuState] (val x: Self) extends AnyVal {
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: bottom | top): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacementNull: Self = this.set("placement", null)
  }
  
}


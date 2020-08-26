package typings.reactSelect.menuMod

import typings.reactSelect.typesMod.MenuPosition
import typings.reactSelect.utilsMod.RectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalStyleArgs extends js.Object {
  var offset: Double = js.native
  var position: MenuPosition = js.native
  var rect: RectType = js.native
}

object PortalStyleArgs {
  @scala.inline
  def apply(offset: Double, position: MenuPosition, rect: RectType): PortalStyleArgs = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalStyleArgs]
  }
  @scala.inline
  implicit class PortalStyleArgsOps[Self <: PortalStyleArgs] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: MenuPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRect(value: RectType): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PressColor extends js.Object {
  var pressColor: String = js.native
}

object PressColor {
  @scala.inline
  def apply(pressColor: String): PressColor = {
    val __obj = js.Dynamic.literal(pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressColor]
  }
  @scala.inline
  implicit class PressColorOps[Self <: PressColor] (val x: Self) extends AnyVal {
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
    def setPressColor(value: String): Self = this.set("pressColor", value.asInstanceOf[js.Any])
  }
  
}


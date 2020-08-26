package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borderless extends js.Object {
  var borderless: Boolean = js.native
  var pressColor: String = js.native
}

object Borderless {
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): Borderless = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  @scala.inline
  implicit class BorderlessOps[Self <: Borderless] (val x: Self) extends AnyVal {
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
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def setPressColor(value: String): Self = this.set("pressColor", value.asInstanceOf[js.Any])
  }
  
}


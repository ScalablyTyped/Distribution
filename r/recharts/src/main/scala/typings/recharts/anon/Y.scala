package typings.recharts.anon

import typings.recharts.mod.AllowEscapeViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y extends AllowEscapeViewBox {
  var y: Boolean = js.native
}

object Y {
  @scala.inline
  def apply(y: Boolean): Y = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  @scala.inline
  implicit class YOps[Self <: Y] (val x: Self) extends AnyVal {
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
    def setY(value: Boolean): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


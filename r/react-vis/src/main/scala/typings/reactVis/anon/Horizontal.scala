package typings.reactVis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Horizontal extends js.Object {
  var horizontal: String = js.native
  var vertical: String = js.native
}

object Horizontal {
  @scala.inline
  def apply(horizontal: String, vertical: String): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
  @scala.inline
  implicit class HorizontalOps[Self <: Horizontal] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactLatexNext.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
  var display: Boolean = js.native
  var left: String = js.native
  var right: String = js.native
}

object Delimiter {
  @scala.inline
  def apply(display: Boolean, left: String, right: String): Delimiter = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}


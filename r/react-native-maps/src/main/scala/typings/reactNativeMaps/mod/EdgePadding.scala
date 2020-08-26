package typings.reactNativeMaps.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgePadding extends js.Object {
  var bottom: Number = js.native
  var left: Number = js.native
  var right: Number = js.native
  var top: Number = js.native
}

object EdgePadding {
  @scala.inline
  def apply(bottom: Number, left: Number, right: Number, top: Number): EdgePadding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgePadding]
  }
  @scala.inline
  implicit class EdgePaddingOps[Self <: EdgePadding] (val x: Self) extends AnyVal {
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
    def setBottom(value: Number): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Number): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Number): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Number): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}


package typings.reResizable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  var bottom: Boolean = js.native
  var bottomLeft: Boolean = js.native
  var bottomRight: Boolean = js.native
  var left: Boolean = js.native
  var right: Boolean = js.native
  var top: Boolean = js.native
  var topLeft: Boolean = js.native
  var topRight: Boolean = js.native
}

object Bottom {
  @scala.inline
  def apply(
    bottom: Boolean,
    bottomLeft: Boolean,
    bottomRight: Boolean,
    left: Boolean,
    right: Boolean,
    top: Boolean,
    topLeft: Boolean,
    topRight: Boolean
  ): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
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
    def setBottom(value: Boolean): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomLeft(value: Boolean): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomRight(value: Boolean): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: Boolean): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRight(value: Boolean): Self = this.set("topRight", value.asInstanceOf[js.Any])
  }
  
}


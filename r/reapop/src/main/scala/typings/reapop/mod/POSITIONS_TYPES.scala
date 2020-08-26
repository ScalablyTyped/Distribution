package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait POSITIONS_TYPES extends js.Object {
  var bottom: BOTTOM = js.native
  var bottomCenter: BOTTOM_CENTER = js.native
  var bottomLeft: BOTTOM_LEFT_POSITION = js.native
  var bottomRight: BOTTOM_RIGHT_POSITION = js.native
  var top: TOP = js.native
  var topCenter: TOP_CENTER = js.native
  var topLeft: TOP_LEFT_POSITION = js.native
  var topRight: TOP_RIGHT_POSITION = js.native
}

object POSITIONS_TYPES {
  @scala.inline
  def apply(
    bottom: BOTTOM,
    bottomCenter: BOTTOM_CENTER,
    bottomLeft: BOTTOM_LEFT_POSITION,
    bottomRight: BOTTOM_RIGHT_POSITION,
    top: TOP,
    topCenter: TOP_CENTER,
    topLeft: TOP_LEFT_POSITION,
    topRight: TOP_RIGHT_POSITION
  ): POSITIONS_TYPES = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomCenter = bottomCenter.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSITIONS_TYPES]
  }
  @scala.inline
  implicit class POSITIONS_TYPESOps[Self <: POSITIONS_TYPES] (val x: Self) extends AnyVal {
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
    def setBottom(value: BOTTOM): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomCenter(value: BOTTOM_CENTER): Self = this.set("bottomCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomLeft(value: BOTTOM_LEFT_POSITION): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomRight(value: BOTTOM_RIGHT_POSITION): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: TOP): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopCenter(value: TOP_CENTER): Self = this.set("topCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: TOP_LEFT_POSITION): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopRight(value: TOP_RIGHT_POSITION): Self = this.set("topRight", value.asInstanceOf[js.Any])
  }
  
}


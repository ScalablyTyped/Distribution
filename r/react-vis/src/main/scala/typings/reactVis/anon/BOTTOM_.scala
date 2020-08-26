package typings.reactVis.anon

import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import typings.reactVis.reactVisStrings.top
import typings.reactVis.reactVisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BOTTOM_ extends js.Object {
  var BOTTOM: bottom = js.native
  var HORIZONTAL: horizontal = js.native
  var LEFT: left = js.native
  var RIGHT: right = js.native
  var TOP: top = js.native
  var VERTICAL: vertical = js.native
}

object BOTTOM_ {
  @scala.inline
  def apply(BOTTOM: bottom, HORIZONTAL: horizontal, LEFT: left, RIGHT: right, TOP: top, VERTICAL: vertical): BOTTOM_ = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM_]
  }
  @scala.inline
  implicit class BOTTOM_Ops[Self <: BOTTOM_] (val x: Self) extends AnyVal {
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
    def setBOTTOM(value: bottom): Self = this.set("BOTTOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setHORIZONTAL(value: horizontal): Self = this.set("HORIZONTAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEFT(value: left): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIGHT(value: right): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP(value: top): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERTICAL(value: vertical): Self = this.set("VERTICAL", value.asInstanceOf[js.Any])
  }
  
}


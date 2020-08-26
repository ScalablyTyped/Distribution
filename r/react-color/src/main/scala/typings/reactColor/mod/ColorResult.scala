package typings.reactColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorResult extends js.Object {
  var hex: String = js.native
  var hsl: HSLColor = js.native
  var rgb: RGBColor = js.native
}

object ColorResult {
  @scala.inline
  def apply(hex: String, hsl: HSLColor, rgb: RGBColor): ColorResult = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorResult]
  }
  @scala.inline
  implicit class ColorResultOps[Self <: ColorResult] (val x: Self) extends AnyVal {
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
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsl(value: HSLColor): Self = this.set("hsl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgb(value: RGBColor): Self = this.set("rgb", value.asInstanceOf[js.Any])
  }
  
}


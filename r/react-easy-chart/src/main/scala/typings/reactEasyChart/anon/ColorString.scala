package typings.reactEasyChart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorString extends js.Object {
  var color: String = js.native
}

object ColorString {
  @scala.inline
  def apply(color: String): ColorString = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorString]
  }
  @scala.inline
  implicit class ColorStringOps[Self <: ColorString] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}


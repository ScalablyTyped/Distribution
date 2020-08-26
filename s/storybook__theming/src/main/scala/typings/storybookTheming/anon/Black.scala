package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Black extends js.Object {
  var black: Double = js.native
  var bold: Double = js.native
  var regular: Double = js.native
}

object Black {
  @scala.inline
  def apply(black: Double, bold: Double, regular: Double): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
  @scala.inline
  implicit class BlackOps[Self <: Black] (val x: Self) extends AnyVal {
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
    def setBlack(value: Double): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: Double): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegular(value: Double): Self = this.set("regular", value.asInstanceOf[js.Any])
  }
  
}


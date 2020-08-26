package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateOptions extends js.Object {
  /** parsed by the color module to extract values for red, green, blue and alpha. (optional, default "#000000") */
  var background: js.UndefOr[Color] = js.native
}

object RotateOptions {
  @scala.inline
  def apply(): RotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateOptions]
  }
  @scala.inline
  implicit class RotateOptionsOps[Self <: RotateOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
  }
  
}


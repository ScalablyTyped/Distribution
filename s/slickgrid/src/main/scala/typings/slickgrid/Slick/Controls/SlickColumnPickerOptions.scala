package typings.slickgrid.Slick.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlickColumnPickerOptions extends js.Object {
  var fadeSpeed: js.UndefOr[Double] = js.native
}

object SlickColumnPickerOptions {
  @scala.inline
  def apply(): SlickColumnPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickColumnPickerOptions]
  }
  @scala.inline
  implicit class SlickColumnPickerOptionsOps[Self <: SlickColumnPickerOptions] (val x: Self) extends AnyVal {
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
    def setFadeSpeed(value: Double): Self = this.set("fadeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeSpeed: Self = this.set("fadeSpeed", js.undefined)
  }
  
}


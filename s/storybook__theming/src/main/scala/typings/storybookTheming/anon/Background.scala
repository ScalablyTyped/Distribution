package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: App = js.native
  var color: Ancillary = js.native
  var typography: Fonts = js.native
}

object Background {
  @scala.inline
  def apply(background: App, color: Ancillary, typography: Fonts): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setBackground(value: App): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Ancillary): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypography(value: Fonts): Self = this.set("typography", value.asInstanceOf[js.Any])
  }
  
}


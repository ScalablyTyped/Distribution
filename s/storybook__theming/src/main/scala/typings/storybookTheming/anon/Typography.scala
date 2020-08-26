package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typography extends js.Object {
  var typography: Fonts = js.native
}

object Typography {
  @scala.inline
  def apply(typography: Fonts): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
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
    def setTypography(value: Fonts): Self = this.set("typography", value.asInstanceOf[js.Any])
  }
  
}


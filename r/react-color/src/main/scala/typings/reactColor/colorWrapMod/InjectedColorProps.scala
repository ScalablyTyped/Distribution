package typings.reactColor.colorWrapMod

import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.HSLColor
import typings.reactColor.mod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedColorProps extends js.Object {
  var hex: js.UndefOr[String] = js.native
  var hsl: js.UndefOr[HSLColor] = js.native
  var onChange: js.UndefOr[ColorWrapChangeHandler] = js.native
  var rgb: js.UndefOr[RGBColor] = js.native
}

object InjectedColorProps {
  @scala.inline
  def apply(): InjectedColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedColorProps]
  }
  @scala.inline
  implicit class InjectedColorPropsOps[Self <: InjectedColorProps] (val x: Self) extends AnyVal {
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
    def deleteHex: Self = this.set("hex", js.undefined)
    @scala.inline
    def setHsl(value: HSLColor): Self = this.set("hsl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsl: Self = this.set("hsl", js.undefined)
    @scala.inline
    def setOnChange(value: /* color */ Color | ColorResult => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRgb(value: RGBColor): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRgb: Self = this.set("rgb", js.undefined)
  }
  
}


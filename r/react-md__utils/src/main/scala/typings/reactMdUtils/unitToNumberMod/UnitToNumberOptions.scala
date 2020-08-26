package typings.reactMdUtils.unitToNumberMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitToNumberOptions extends js.Object {
  var element: js.UndefOr[Element] = js.native
  var fontSizeFallback: js.UndefOr[Double] = js.native
}

object UnitToNumberOptions {
  @scala.inline
  def apply(): UnitToNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitToNumberOptions]
  }
  @scala.inline
  implicit class UnitToNumberOptionsOps[Self <: UnitToNumberOptions] (val x: Self) extends AnyVal {
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
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setFontSizeFallback(value: Double): Self = this.set("fontSizeFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeFallback: Self = this.set("fontSizeFallback", js.undefined)
  }
  
}


package typings.reactFoundation.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderFillProps extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object SliderFillProps {
  @scala.inline
  def apply(): SliderFillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderFillProps]
  }
  @scala.inline
  implicit class SliderFillPropsOps[Self <: SliderFillProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}


package typings.reactFoundation.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderCommonProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isVertical: js.UndefOr[Boolean] = js.native
}

object SliderCommonProps {
  @scala.inline
  def apply(): SliderCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderCommonProps]
  }
  @scala.inline
  implicit class SliderCommonPropsOps[Self <: SliderCommonProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsVertical(value: Boolean): Self = this.set("isVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
  }
  
}


package typings.reactBootstrap.carouselCaptionMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselCaptionProps
  extends AllHTMLAttributes[CarouselCaption]
     with ClassAttributes[CarouselCaption] {
  var componentClass: js.UndefOr[ReactType[_]] = js.native
}

object CarouselCaptionProps {
  @scala.inline
  def apply(): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselCaptionProps]
  }
  @scala.inline
  implicit class CarouselCaptionPropsOps[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
  }
  
}


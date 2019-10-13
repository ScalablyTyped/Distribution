package typings.reactDashBootstrap.libCarouselCaptionMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends AllHTMLAttributes[CarouselCaption]
     with ClassAttributes[CarouselCaption] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[CarouselCaption] = null,
    ClassAttributes: ClassAttributes[CarouselCaption] = null,
    componentClass: ReactType[_] = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


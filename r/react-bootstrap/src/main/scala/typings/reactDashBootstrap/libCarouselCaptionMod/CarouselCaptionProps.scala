package typings.reactDashBootstrap.libCarouselCaptionMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps extends HTMLProps[CarouselCaption] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[CarouselCaption] = null, componentClass: ReactType[_] = null): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


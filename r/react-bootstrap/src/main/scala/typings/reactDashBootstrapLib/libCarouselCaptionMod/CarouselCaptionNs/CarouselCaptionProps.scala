package typings
package reactDashBootstrapLib.libCarouselCaptionMod.CarouselCaptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libCarouselCaptionMod.CarouselCaption] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libCarouselCaptionMod.CarouselCaption] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


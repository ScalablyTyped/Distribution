package typings
package reactDashBootstrapLib.libCarouselCaptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends reactLib.reactMod.HTMLProps[CarouselCaption] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[CarouselCaption] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


package typings.reactstrap.libCarouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends HTMLProps[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[String] = js.undefined
  var captionText: String
  var cssModule: js.UndefOr[CSSModule] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    captionText: String,
    HTMLProps: HTMLProps[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    captionHeader: String = null,
    cssModule: CSSModule = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (captionHeader != null) __obj.updateDynamic("captionHeader")(captionHeader)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


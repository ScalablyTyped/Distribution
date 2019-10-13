package typings.reactstrap.libCarouselCaptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[String] = js.undefined
  var captionText: String
  var cssModule: js.UndefOr[CSSModule] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    captionText: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    captionHeader: String = null,
    cssModule: CSSModule = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (captionHeader != null) __obj.updateDynamic("captionHeader")(captionHeader)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


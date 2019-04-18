package typings
package reactstrapLib.libCarouselCaptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselCaptionProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var captionHeader: js.UndefOr[java.lang.String] = js.undefined
  var captionText: java.lang.String
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
}

object CarouselCaptionProps {
  @scala.inline
  def apply(
    captionText: java.lang.String,
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    captionHeader: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): CarouselCaptionProps = {
    val __obj = js.Dynamic.literal(captionText = captionText)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (captionHeader != null) __obj.updateDynamic("captionHeader")(captionHeader)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselCaptionProps]
  }
}


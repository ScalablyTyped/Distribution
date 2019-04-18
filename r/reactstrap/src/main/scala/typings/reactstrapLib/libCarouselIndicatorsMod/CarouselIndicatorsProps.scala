package typings
package reactstrapLib.libCarouselIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselIndicatorsProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeIndex: scala.Double
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var items: js.Array[js.Object]
  def onClickHandler(idx: scala.Double): scala.Unit
}

object CarouselIndicatorsProps {
  @scala.inline
  def apply(
    activeIndex: scala.Double,
    items: js.Array[js.Object],
    onClickHandler: scala.Double => scala.Unit,
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): CarouselIndicatorsProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, items = items, onClickHandler = js.Any.fromFunction1(onClickHandler))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselIndicatorsProps]
  }
}


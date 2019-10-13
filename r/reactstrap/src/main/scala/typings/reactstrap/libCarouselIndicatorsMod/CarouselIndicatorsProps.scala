package typings.reactstrap.libCarouselIndicatorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselIndicatorsProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: Double
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var items: js.Array[js.Object]
  def onClickHandler(idx: Double): Unit
}

object CarouselIndicatorsProps {
  @scala.inline
  def apply(
    activeIndex: Double,
    items: js.Array[js.Object],
    onClickHandler: Double => Unit,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null
  ): CarouselIndicatorsProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, items = items, onClickHandler = js.Any.fromFunction1(onClickHandler))
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[CarouselIndicatorsProps]
  }
}


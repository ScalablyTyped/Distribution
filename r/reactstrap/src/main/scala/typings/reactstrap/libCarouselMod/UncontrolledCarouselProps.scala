package typings.reactstrap.libCarouselMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapNumbers.`false`
import typings.reactstrap.reactstrapStrings.carousel
import typings.reactstrap.reactstrapStrings.hover
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledCarouselProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var indicators: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | String | Boolean] = js.undefined
  var items: js.Array[_]
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mouseExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var next: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pause: js.UndefOr[hover | `false`] = js.undefined
  var previous: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ride: js.UndefOr[carousel] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
}

object UncontrolledCarouselProps {
  @scala.inline
  def apply(
    items: js.Array[_],
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Int | Double = null,
    cssModule: CSSModule = null,
    indicators: js.UndefOr[Boolean] = js.undefined,
    interval: Double | String | Boolean = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseEnter: () => Unit = null,
    mouseExit: () => Unit = null,
    next: () => Unit = null,
    pause: hover | `false` = null,
    previous: () => Unit = null,
    ride: carousel = null,
    slide: js.UndefOr[Boolean] = js.undefined
  ): UncontrolledCarouselProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction0(mouseEnter))
    if (mouseExit != null) __obj.updateDynamic("mouseExit")(js.Any.fromFunction0(mouseExit))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction0(next))
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(js.Any.fromFunction0(previous))
    if (ride != null) __obj.updateDynamic("ride")(ride.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledCarouselProps]
  }
}


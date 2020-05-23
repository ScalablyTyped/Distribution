package typings.reactstrap.carouselMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapBooleans.`false`
import typings.reactstrap.reactstrapStrings.carousel
import typings.reactstrap.reactstrapStrings.hover
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var enableTouch: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | String | Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mouseExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pause: js.UndefOr[hover | `false`] = js.undefined
  var ride: js.UndefOr[carousel] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
  def next(): Unit
  def previous(): Unit
}

object CarouselProps {
  @scala.inline
  def apply(
    next: () => Unit,
    previous: () => Unit,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: js.UndefOr[Double] = js.undefined,
    cssModule: CSSModule = null,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    interval: Double | String | Boolean = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseEnter: () => Unit = null,
    mouseExit: () => Unit = null,
    pause: hover | `false` = null,
    ride: carousel = null,
    slide: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction0(mouseEnter))
    if (mouseExit != null) __obj.updateDynamic("mouseExit")(js.Any.fromFunction0(mouseExit))
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (ride != null) __obj.updateDynamic("ride")(ride.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}


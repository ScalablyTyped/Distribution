package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndexAutoPlay extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var indicators: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
  var items: js.Array[_]
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mouseEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mouseExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pause: js.UndefOr[
    reactstrapLib.reactstrapLibStrings.hover | reactstrapLib.reactstrapLibNumbers.`false`
  ] = js.undefined
  var previous: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ride: js.UndefOr[reactstrapLib.reactstrapLibStrings.carousel] = js.undefined
  var slide: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ActiveIndexAutoPlay {
  @scala.inline
  def apply(
    items: js.Array[_],
    activeIndex: scala.Int | scala.Double = null,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    indicators: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Double | java.lang.String | scala.Boolean = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mouseEnter: js.Function0[scala.Unit] = null,
    mouseExit: js.Function0[scala.Unit] = null,
    next: js.Function0[scala.Unit] = null,
    pause: reactstrapLib.reactstrapLibStrings.hover | reactstrapLib.reactstrapLibNumbers.`false` = null,
    previous: js.Function0[scala.Unit] = null,
    ride: reactstrapLib.reactstrapLibStrings.carousel = null,
    slide: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ActiveIndexAutoPlay = {
    val __obj = js.Dynamic.literal(items = items)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(mouseEnter)
    if (mouseExit != null) __obj.updateDynamic("mouseExit")(mouseExit)
    if (next != null) __obj.updateDynamic("next")(next)
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (ride != null) __obj.updateDynamic("ride")(ride)
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide)
    __obj.asInstanceOf[Anon_ActiveIndexAutoPlay]
  }
}


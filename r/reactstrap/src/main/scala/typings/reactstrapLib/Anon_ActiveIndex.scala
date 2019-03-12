package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var interval: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mouseEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mouseExit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pause: js.UndefOr[
    reactstrapLib.reactstrapLibStrings.hover | reactstrapLib.reactstrapLibNumbers.`false`
  ] = js.undefined
  var ride: js.UndefOr[reactstrapLib.reactstrapLibStrings.carousel] = js.undefined
  var slide: js.UndefOr[scala.Boolean] = js.undefined
  def next(): scala.Unit
  def previous(): scala.Unit
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(
    next: () => scala.Unit,
    previous: () => scala.Unit,
    activeIndex: scala.Int | scala.Double = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    interval: scala.Double | java.lang.String | scala.Boolean = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mouseEnter: () => scala.Unit = null,
    mouseExit: () => scala.Unit = null,
    pause: reactstrapLib.reactstrapLibStrings.hover | reactstrapLib.reactstrapLibNumbers.`false` = null,
    ride: reactstrapLib.reactstrapLibStrings.carousel = null,
    slide: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ActiveIndex = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction0(mouseEnter))
    if (mouseExit != null) __obj.updateDynamic("mouseExit")(js.Any.fromFunction0(mouseExit))
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (ride != null) __obj.updateDynamic("ride")(ride)
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide)
    __obj.asInstanceOf[Anon_ActiveIndex]
  }
}


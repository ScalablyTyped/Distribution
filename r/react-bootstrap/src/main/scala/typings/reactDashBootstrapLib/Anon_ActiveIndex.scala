package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var defaultActiveIndex: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var indicators: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var nextIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onSelect: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  // TODO: Add more specific type
  var onSlideEnd: js.UndefOr[js.Function] = js.undefined
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var prevIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var slide: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: scala.Int | scala.Double = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    defaultActiveIndex: scala.Int | scala.Double = null,
    direction: java.lang.String = null,
    indicators: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null,
    nextIcon: reactLib.reactMod.ReactNode = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onSlideEnd: js.Function = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    prevIcon: reactLib.reactMod.ReactNode = null,
    slide: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ActiveIndex = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(onSlideEnd)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Anon_ActiveIndex]
  }
}


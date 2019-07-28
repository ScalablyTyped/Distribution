package typings.reactDashBootstrap

import typings.react.reactMod.ReactNode
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var defaultActiveIndex: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var indicators: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double | Null] = js.undefined
  var nextIcon: js.UndefOr[ReactNode] = js.undefined
  var onSelect: js.UndefOr[SelectCallback] = js.undefined
  // TODO: Add more specific type
  var onSlideEnd: js.UndefOr[js.Function] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var prevIcon: js.UndefOr[ReactNode] = js.undefined
  var slide: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: Int | Double = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    defaultActiveIndex: Int | Double = null,
    direction: String = null,
    indicators: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    nextIcon: ReactNode = null,
    onSelect: SelectCallback = null,
    onSlideEnd: js.Function = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevIcon: ReactNode = null,
    slide: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
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


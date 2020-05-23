package typings.reactBootstrap.anon

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveIndex extends js.Object {
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

object ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: js.UndefOr[Double] = js.undefined,
    bsSize: Sizes = null,
    bsStyle: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    defaultActiveIndex: js.UndefOr[Double] = js.undefined,
    direction: String = null,
    indicators: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Null | Double] = js.undefined,
    nextIcon: ReactNode = null,
    onSelect: SelectCallback = null,
    onSlideEnd: js.Function = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevIcon: ReactNode = null,
    slide: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveIndex)) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(onSlideEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
}


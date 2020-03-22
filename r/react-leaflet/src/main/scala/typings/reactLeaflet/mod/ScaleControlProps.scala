package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.ScaleOptions & react-leaflet.react-leaflet.MapControlProps */
trait ScaleControlProps extends js.Object {
  var imperial: js.UndefOr[Boolean] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var metric: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
}

object ScaleControlProps {
  @scala.inline
  def apply(
    imperial: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    maxWidth: Int | Double = null,
    metric: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  ): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imperial)) __obj.updateDynamic("imperial")(imperial.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleControlProps]
  }
}


package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var intensity: js.UndefOr[Double] = js.undefined
  var normal: js.UndefOr[Point] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
}

object LightOptions {
  @scala.inline
  def apply(
    color: Color = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    intensity: js.UndefOr[Double] = js.undefined,
    normal: Point = null,
    point: Point = null
  ): LightOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intensity)) __obj.updateDynamic("intensity")(intensity.get.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightOptions]
  }
}


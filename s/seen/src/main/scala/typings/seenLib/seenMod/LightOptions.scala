package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var intensity: js.UndefOr[scala.Double] = js.undefined
  var normal: js.UndefOr[Point] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
}

object LightOptions {
  @scala.inline
  def apply(
    color: Color = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    intensity: scala.Int | scala.Double = null,
    normal: Point = null,
    point: Point = null
  ): LightOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (intensity != null) __obj.updateDynamic("intensity")(intensity.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal)
    if (point != null) __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[LightOptions]
  }
}


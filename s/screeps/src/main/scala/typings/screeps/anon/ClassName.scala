package typings.screeps.anon

import typings.screeps.PowerClassConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: PowerClassConstant
  var cooldown: Double
  var duration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var effect: js.UndefOr[js.Array[Double]] = js.undefined
  var level: js.Array[Double]
  var ops: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var range: js.UndefOr[Double] = js.undefined
}

object ClassName {
  @scala.inline
  def apply(
    className: PowerClassConstant,
    cooldown: Double,
    level: js.Array[Double],
    duration: Double | js.Array[Double] = null,
    effect: js.Array[Double] = null,
    ops: Double | js.Array[Double] = null,
    range: js.UndefOr[Double] = js.undefined
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}


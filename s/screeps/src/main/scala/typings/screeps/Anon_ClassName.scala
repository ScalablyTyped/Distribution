package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: PowerClassConstant
  var cooldown: Double
  var duration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var effect: js.UndefOr[js.Array[Double]] = js.undefined
  var level: js.Array[Double]
  var ops: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var range: js.UndefOr[Double] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: PowerClassConstant,
    cooldown: Double,
    level: js.Array[Double],
    duration: Double | js.Array[Double] = null,
    effect: js.Array[Double] = null,
    ops: Double | js.Array[Double] = null,
    range: Int | Double = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}


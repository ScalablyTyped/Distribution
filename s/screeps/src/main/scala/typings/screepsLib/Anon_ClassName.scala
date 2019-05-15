package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: PowerClassConstant
  var cooldown: scala.Double
  var duration: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var effect: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var level: js.Array[scala.Double]
  var ops: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var range: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: PowerClassConstant,
    cooldown: scala.Double,
    level: js.Array[scala.Double],
    duration: scala.Double | js.Array[scala.Double] = null,
    effect: js.Array[scala.Double] = null,
    ops: scala.Double | js.Array[scala.Double] = null,
    range: scala.Int | scala.Double = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, level = level)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}


package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrecision extends js.Object {
  var precision: Double
  var scale: js.UndefOr[Double] = js.undefined
}

object AnonPrecision {
  @scala.inline
  def apply(precision: Double, scale: Int | Double = null): AnonPrecision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrecision]
  }
}


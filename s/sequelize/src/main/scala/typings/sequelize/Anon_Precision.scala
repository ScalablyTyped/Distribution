package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Precision extends js.Object {
  var precision: Double
  var scale: js.UndefOr[Double] = js.undefined
}

object Anon_Precision {
  @scala.inline
  def apply(precision: Double, scale: Int | Double = null): Anon_Precision = {
    val __obj = js.Dynamic.literal(precision = precision)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Precision]
  }
}


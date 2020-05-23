package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precision extends js.Object {
  var precision: Double
  var scale: js.UndefOr[Double] = js.undefined
}

object Precision {
  @scala.inline
  def apply(precision: Double, scale: js.UndefOr[Double] = js.undefined): Precision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
}


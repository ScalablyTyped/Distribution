package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecimals extends js.Object {
  var decimals: js.UndefOr[Double] = js.undefined
  var length: Double
}

object AnonDecimals {
  @scala.inline
  def apply(length: Double, decimals: Int | Double = null): AnonDecimals = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDecimals]
  }
}


package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decimals extends js.Object {
  var decimals: js.UndefOr[Double] = js.undefined
  var length: Double
}

object Decimals {
  @scala.inline
  def apply(length: Double, decimals: js.UndefOr[Double] = js.undefined): Decimals = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimals]
  }
}


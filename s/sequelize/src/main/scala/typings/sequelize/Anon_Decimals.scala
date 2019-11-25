package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  var decimals: js.UndefOr[Double] = js.undefined
  var length: Double
}

object Anon_Decimals {
  @scala.inline
  def apply(length: Double, decimals: Int | Double = null): Anon_Decimals = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Decimals]
  }
}


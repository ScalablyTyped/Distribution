package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimals extends js.Object {
  var decimals: js.UndefOr[scala.Double] = js.undefined
  var length: scala.Double
}

object Anon_Decimals {
  @scala.inline
  def apply(length: scala.Double, decimals: scala.Int | scala.Double = null): Anon_Decimals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Decimals]
  }
}


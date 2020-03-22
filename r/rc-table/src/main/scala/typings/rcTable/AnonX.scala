package typings.rcTable

import typings.rcTable.rcTableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: js.UndefOr[Double | `true` | String] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonX {
  @scala.inline
  def apply(x: Double | `true` | String = null, y: Int | Double = null): AnonX = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}


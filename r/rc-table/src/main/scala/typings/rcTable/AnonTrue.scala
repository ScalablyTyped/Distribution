package typings.rcTable

import typings.rcTable.rcTableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrue extends js.Object {
  var x: js.UndefOr[Double | `true` | String] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonTrue {
  @scala.inline
  def apply(x: Double | `true` | String = null, y: Int | Double = null): AnonTrue = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTrue]
  }
}


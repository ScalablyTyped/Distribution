package typings.rcDashTable

import typings.rcDashTable.rcDashTableNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_True extends js.Object {
  var x: js.UndefOr[Double | `true` | String] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_True {
  @scala.inline
  def apply(x: Double | `true` | String = null, y: Int | Double = null): Anon_True = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_True]
  }
}


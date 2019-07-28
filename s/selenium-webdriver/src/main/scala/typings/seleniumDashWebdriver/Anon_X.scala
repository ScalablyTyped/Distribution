package typings.seleniumDashWebdriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[Double | String] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: Double | String = null, y: Double | String = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}


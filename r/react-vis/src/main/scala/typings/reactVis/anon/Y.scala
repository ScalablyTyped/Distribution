package typings.reactVis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y extends js.Object {
  var x: js.UndefOr[Double | String] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
}

object Y {
  @scala.inline
  def apply(x: Double | String = null, y: Double | String = null): Y = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
}


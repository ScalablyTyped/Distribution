package typings.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceCoordinates extends js.Object {
  var m: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: Double
  var z: js.UndefOr[Double] = js.undefined
}

object InterfaceCoordinates {
  @scala.inline
  def apply(x: Double, y: Double, m: js.UndefOr[Double] = js.undefined, z: js.UndefOr[Double] = js.undefined): InterfaceCoordinates = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceCoordinates]
  }
}


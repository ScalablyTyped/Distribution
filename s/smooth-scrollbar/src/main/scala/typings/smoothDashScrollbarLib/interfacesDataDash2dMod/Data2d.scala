package typings
package smoothDashScrollbarLib.interfacesDataDash2dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data2d extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Data2d {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Data2d = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Data2d]
  }
}


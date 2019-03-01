package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object PolygonPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): PolygonPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[PolygonPoint]
  }
}


package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
}

object BoundingBox {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y2: scala.Double
  ): BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[BoundingBox]
  }
}


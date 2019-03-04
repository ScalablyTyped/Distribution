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
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, x2 = x2, y = y, y2 = y2)
  
    __obj.asInstanceOf[BoundingBox]
  }
}


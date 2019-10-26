package typings.rbush.rbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBox extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
}

object BBox {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): BBox = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[BBox]
  }
}


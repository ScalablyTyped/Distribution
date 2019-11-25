package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object BoundingBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, x2: Double, y: Double, y2: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundingBox]
  }
}


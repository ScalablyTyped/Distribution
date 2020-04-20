package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAxisAlignedBoundingBox extends js.Object {
  /**
    * Height of the bounding box.
    */
  var height: Double
  /**
    * Width of the bounding box.
    */
  var width: Double
  /**
    * Horizontal coordinate of the top left corner.
    */
  var x: Double
  /**
    * Vertical coordinate of the top left corner.
    */
  var y: Double
}

object RaphaelAxisAlignedBoundingBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RaphaelAxisAlignedBoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAxisAlignedBoundingBox]
  }
}


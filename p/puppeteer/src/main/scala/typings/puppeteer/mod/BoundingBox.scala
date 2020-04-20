package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  /** The height. */
  var height: Double
  /** The width. */
  var width: Double
  /** The x-coordinate of top-left corner. */
  var x: Double
  /** The y-coordinate of top-left corner. */
  var y: Double
}

object BoundingBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}


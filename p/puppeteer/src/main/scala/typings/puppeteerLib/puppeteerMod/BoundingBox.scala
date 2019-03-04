package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  /** The height. */
  var height: scala.Double
  /** The width. */
  var width: scala.Double
  /** The x-coordinate of top-left corner. */
  var x: scala.Double
  /** The y-coordinate of top-left corner. */
  var y: scala.Double
}

object BoundingBox {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[BoundingBox]
  }
}


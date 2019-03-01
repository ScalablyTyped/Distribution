package typings
package rbushLib.rbushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBox extends js.Object {
  var maxX: scala.Double
  var maxY: scala.Double
  var minX: scala.Double
  var minY: scala.Double
}

object BBox {
  @scala.inline
  def apply(maxX: scala.Double, maxY: scala.Double, minX: scala.Double, minY: scala.Double): BBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxX")(maxX)
    __obj.updateDynamic("maxY")(maxY)
    __obj.updateDynamic("minX")(minX)
    __obj.updateDynamic("minY")(minY)
    __obj.asInstanceOf[BBox]
  }
}


package typings
package reactDashSelectLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectType extends js.Object {
  var bottom: scala.Double
  var height: scala.Double
  var left: scala.Double
  var right: scala.Double
  var width: scala.Double
}

object RectType {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    width: scala.Double
  ): RectType = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, width = width)
  
    __obj.asInstanceOf[RectType]
  }
}


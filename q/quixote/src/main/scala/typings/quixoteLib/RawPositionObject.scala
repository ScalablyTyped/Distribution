package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawPositionObject extends js.Object {
  // bottom edge
  var bottom: scala.Double
  // height (bottom edge minus top edge)
  var height: scala.Double
  // left edge
  var left: scala.Double
  // right edge
  var right: scala.Double
  // top edge
  var top: scala.Double
  // width (right edge minus left edge)
  var width: scala.Double
}

object RawPositionObject {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): RawPositionObject = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[RawPositionObject]
  }
}


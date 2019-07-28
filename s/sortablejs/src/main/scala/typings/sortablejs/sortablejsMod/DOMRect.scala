package typings.sortablejs.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRect extends js.Object {
  var bottom: Double
  var height: Double
  var left: Double
  var right: Double
  var top: Double
  var width: Double
  var x: Double
  var y: Double
}

object DOMRect {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRect = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[DOMRect]
  }
}


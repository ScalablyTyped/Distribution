package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawPositionObject extends js.Object {
  // bottom edge
  var bottom: Double
  // height (bottom edge minus top edge)
  var height: Double
  // left edge
  var left: Double
  // right edge
  var right: Double
  // top edge
  var top: Double
  // width (right edge minus left edge)
  var width: Double
}

object RawPositionObject {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): RawPositionObject = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[RawPositionObject]
  }
}


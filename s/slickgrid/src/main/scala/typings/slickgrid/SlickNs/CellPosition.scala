package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends Position {
  var bottom: Double
  var height: Double
  var right: Double
  var visible: Boolean
  var width: Double
}

object CellPosition {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    visible: Boolean,
    width: Double
  ): CellPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, visible = visible, width = width)
  
    __obj.asInstanceOf[CellPosition]
  }
}


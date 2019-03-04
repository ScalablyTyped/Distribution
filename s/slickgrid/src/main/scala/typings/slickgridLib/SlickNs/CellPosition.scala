package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends Position {
  var bottom: scala.Double
  var height: scala.Double
  var right: scala.Double
  var visible: scala.Boolean
  var width: scala.Double
}

object CellPosition {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    visible: scala.Boolean,
    width: scala.Double
  ): CellPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, visible = visible, width = width)
  
    __obj.asInstanceOf[CellPosition]
  }
}


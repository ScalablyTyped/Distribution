package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var cell: scala.Double
  var row: scala.Double
}

object Cell {
  @scala.inline
  def apply(cell: scala.Double, row: scala.Double): Cell = {
    val __obj = js.Dynamic.literal(cell = cell, row = row)
  
    __obj.asInstanceOf[Cell]
  }
}


package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnActiveCellChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var row: scala.Double
}

object OnActiveCellChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: scala.Double, grid: Grid[T], row: scala.Double): OnActiveCellChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, grid = grid, row = row)
  
    __obj.asInstanceOf[OnActiveCellChangedEventArgs[T]]
  }
}


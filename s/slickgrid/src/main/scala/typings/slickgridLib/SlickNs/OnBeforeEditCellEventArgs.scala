package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeEditCellEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var column: Column[T]
  var item: T
  var row: scala.Double
}

object OnBeforeEditCellEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: scala.Double, column: Column[T], grid: Grid[T], item: T, row: scala.Double): OnBeforeEditCellEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, column = column, grid = grid, item = item.asInstanceOf[js.Any], row = row)
  
    __obj.asInstanceOf[OnBeforeEditCellEventArgs[T]]
  }
}


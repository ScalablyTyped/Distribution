package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var row: scala.Double
}

object OnClickEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](cell: scala.Double, grid: Grid[T], row: scala.Double): OnClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, grid = grid, row = row)
  
    __obj.asInstanceOf[OnClickEventArgs[T]]
  }
}


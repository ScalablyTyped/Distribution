package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCellCssStylesChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var hash: CellCssStylesHash
  var key: String
}

object OnCellCssStylesChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], hash: CellCssStylesHash, key: String): OnCellCssStylesChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid, hash = hash, key = key)
  
    __obj.asInstanceOf[OnCellCssStylesChangedEventArgs[T]]
  }
}


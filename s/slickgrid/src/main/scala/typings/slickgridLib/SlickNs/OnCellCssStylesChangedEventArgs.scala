package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCellCssStylesChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var hash: CellCssStylesHash
  var key: java.lang.String
}

object OnCellCssStylesChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], hash: CellCssStylesHash, key: java.lang.String): OnCellCssStylesChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid, hash = hash, key = key)
  
    __obj.asInstanceOf[OnCellCssStylesChangedEventArgs[T]]
  }
}


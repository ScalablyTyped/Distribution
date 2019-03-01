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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[OnCellCssStylesChangedEventArgs[T]]
  }
}


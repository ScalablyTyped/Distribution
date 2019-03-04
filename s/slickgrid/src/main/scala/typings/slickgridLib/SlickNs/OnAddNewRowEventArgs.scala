package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAddNewRowEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T]
  var item: T
}

object OnAddNewRowEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], item: T): OnAddNewRowEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column, grid = grid, item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnAddNewRowEventArgs[T]]
  }
}


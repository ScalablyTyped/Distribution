package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectedRowsChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var rows: js.Array[scala.Double]
}

object OnSelectedRowsChangedEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], rows: js.Array[scala.Double]): OnSelectedRowsChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[OnSelectedRowsChangedEventArgs[T]]
  }
}


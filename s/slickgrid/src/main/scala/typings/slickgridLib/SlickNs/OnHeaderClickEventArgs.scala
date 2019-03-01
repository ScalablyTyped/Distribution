package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeaderClickEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T]
}

object OnHeaderClickEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderClickEventArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("grid")(grid)
    __obj.asInstanceOf[OnHeaderClickEventArgs[T]]
  }
}


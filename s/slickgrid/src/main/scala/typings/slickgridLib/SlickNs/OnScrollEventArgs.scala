package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object OnScrollEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], scrollLeft: scala.Double, scrollTop: scala.Double): OnScrollEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[OnScrollEventArgs[T]]
  }
}


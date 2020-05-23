package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var scrollLeft: Double
  var scrollTop: Double
}

object OnScrollEventArgs {
  @scala.inline
  def apply[T](grid: Grid[T], scrollLeft: Double, scrollTop: Double): OnScrollEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnScrollEventArgs[T]]
  }
}


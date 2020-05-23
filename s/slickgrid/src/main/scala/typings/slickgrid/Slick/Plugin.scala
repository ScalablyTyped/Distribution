package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[T /* <: SlickData */] extends js.Object {
  def destroy(): Unit
  def init(grid: Grid[T]): Unit
}

object Plugin {
  @scala.inline
  def apply[T](destroy: () => Unit, init: Grid[T] => Unit): Plugin[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin[T]]
  }
}


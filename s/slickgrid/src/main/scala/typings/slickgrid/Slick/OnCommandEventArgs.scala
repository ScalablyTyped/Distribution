package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCommandEventArgs[T /* <: SlickData */] extends js.Object {
  var button: HeaderButton
  var column: Column[T]
  var command: String
  var grid: Grid[T]
}

object OnCommandEventArgs {
  @scala.inline
  def apply[T](button: HeaderButton, column: Column[T], command: String, grid: Grid[T]): OnCommandEventArgs[T] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCommandEventArgs[T]]
  }
}


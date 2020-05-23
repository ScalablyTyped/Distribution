package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxSelectColumn[T /* <: SlickData */] extends Plugin[T] {
  def getColumnDefinition(): ColumnMetadata[T]
}

object CheckboxSelectColumn {
  @scala.inline
  def apply[T](destroy: () => Unit, getColumnDefinition: () => ColumnMetadata[T], init: Grid[T] => Unit): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getColumnDefinition = js.Any.fromFunction0(getColumnDefinition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
}


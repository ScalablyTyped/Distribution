package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxSelectColumn[T /* <: SlickData */] extends Plugin[T] {
  def getColumnDefinition(): ColumnMetadata[T] = js.native
}

object CheckboxSelectColumn {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](destroy: () => Unit, getColumnDefinition: () => ColumnMetadata[T], init: Grid[T] => Unit): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getColumnDefinition = js.Any.fromFunction0(getColumnDefinition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
  @scala.inline
  implicit class CheckboxSelectColumnOps[Self <: CheckboxSelectColumn[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with CheckboxSelectColumn[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetColumnDefinition(value: () => ColumnMetadata[T]): Self = this.set("getColumnDefinition", js.Any.fromFunction0(value))
  }
  
}


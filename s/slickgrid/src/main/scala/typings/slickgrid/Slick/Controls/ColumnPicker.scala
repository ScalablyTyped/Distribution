package typings.slickgrid.Slick.Controls

import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnPicker[T /* <: SlickData */] extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getAllColumns(): js.Array[Column[T]] = js.native
}
object ColumnPicker {
  
  @scala.inline
  def apply[T /* <: SlickData */](destroy: () => Unit, getAllColumns: () => js.Array[Column[T]]): ColumnPicker[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAllColumns = js.Any.fromFunction0(getAllColumns))
    __obj.asInstanceOf[ColumnPicker[T]]
  }
  
  @scala.inline
  implicit class ColumnPickerOps[Self <: ColumnPicker[_], T /* <: SlickData */] (val x: Self with ColumnPicker[T]) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllColumns(value: () => js.Array[Column[T]]): Self = this.set("getAllColumns", js.Any.fromFunction0(value))
  }
}

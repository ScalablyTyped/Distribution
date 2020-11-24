package typings.reactabularTable.anon

import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends js.Object {
  
  var cell: js.UndefOr[
    String | (js.Function2[/* props */ js.Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ js.Any, ReactInstance])
  ] = js.native
  
  var row: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.native
  
  var wrapper: js.UndefOr[String | (js.Function1[/* props */ js.Any, Element | ReactInstance])] = js.native
}
object Cell {
  
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    
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
    def setCellFunction2(value: (/* props */ js.Any, /* column */ typings.reactabularTable.mod.Column) => Element): Self = this.set("cell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCellFunction1(value: /* props */ js.Any => ReactInstance): Self = this.set("cell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCell(
      value: String | (js.Function2[/* props */ js.Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ js.Any, ReactInstance])
    ): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setRowFunction1(value: /* props */ js.Any => Element | ReactInstance): Self = this.set("row", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRow(value: String | (js.Function1[/* props */ js.Any, Element | ReactInstance])): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setWrapperFunction1(value: /* props */ js.Any => Element | ReactInstance): Self = this.set("wrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrapper(value: String | (js.Function1[/* props */ js.Any, Element | ReactInstance])): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}

package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[D /* <: js.Object */] extends js.Object {
  
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D] | IdType[D]] = js.native
}
object `1` {
  
  @scala.inline
  def apply[D /* <: js.Object */](): `1`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[D]]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], D /* <: js.Object */] (val x: Self with `1`[D]) extends AnyVal {
    
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
    def setAccessorFunction3(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any]): Self = this.set("accessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAccessor(value: typings.reactTable.mod.Accessor[D] | IdType[D]): Self = this.set("accessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessor: Self = this.set("accessor", js.undefined)
  }
}

package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessor[D /* <: js.Object */] extends js.Object {
  
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D]] = js.native
}
object Accessor {
  
  @scala.inline
  def apply[D /* <: js.Object */](): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessor[D]]
  }
  
  @scala.inline
  implicit class AccessorOps[Self <: Accessor[_], D /* <: js.Object */] (val x: Self with Accessor[D]) extends AnyVal {
    
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
    def setAccessor(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any]): Self = this.set("accessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAccessor: Self = this.set("accessor", js.undefined)
  }
}

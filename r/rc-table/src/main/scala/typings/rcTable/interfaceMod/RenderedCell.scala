package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedCell[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var props: js.UndefOr[CellType[RecordType]] = js.native
}

object RenderedCell {
  @scala.inline
  def apply[RecordType](): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
  @scala.inline
  implicit class RenderedCellOps[Self <: RenderedCell[_], RecordType] (val x: Self with RenderedCell[RecordType]) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setProps(value: CellType[RecordType]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}


package typings.rcTable.interfaceMod

import typings.rcTable.anon.Cell
import typings.rcTable.anon.OnScroll
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponents[RecordType] extends js.Object {
  var body: js.UndefOr[CustomizeScrollBody[RecordType] | Cell] = js.native
  var header: js.UndefOr[Cell] = js.native
  var table: js.UndefOr[CustomizeComponent] = js.native
}

object TableComponents {
  @scala.inline
  def apply[RecordType](): TableComponents[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableComponents[RecordType]]
  }
  @scala.inline
  implicit class TableComponentsOps[Self <: TableComponents[_], RecordType] (val x: Self with TableComponents[RecordType]) extends AnyVal {
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
    def setBodyFunction2(value: (/* data */ js.Array[RecordType], /* info */ OnScroll) => ReactNode): Self = this.set("body", js.Any.fromFunction2(value))
    @scala.inline
    def setBody(value: CustomizeScrollBody[RecordType] | Cell): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeader(value: Cell): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setTable(value: CustomizeComponent): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}


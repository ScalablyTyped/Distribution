package typings.rcTable.interfaceMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellType[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var colEnd: js.UndefOr[Double] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var colStart: js.UndefOr[Double] = js.native
  var column: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
  ] = js.native
  /** Only used for table header */
  var hasSubColumns: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CellType {
  @scala.inline
  def apply[RecordType](): CellType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellType[RecordType]]
  }
  @scala.inline
  implicit class CellTypeOps[Self <: CellType[_], RecordType] (val x: Self with CellType[RecordType]) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColEnd(value: Double): Self = this.set("colEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColEnd: Self = this.set("colEnd", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColStart(value: Double): Self = this.set("colStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColStart: Self = this.set("colStart", js.undefined)
    @scala.inline
    def setColumn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setHasSubColumns(value: Boolean): Self = this.set("hasSubColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSubColumns: Self = this.set("hasSubColumns", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


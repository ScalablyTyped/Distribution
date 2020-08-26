package typings.rcTable.interfaceMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSharedType[RecordType] extends js.Object {
  var align: js.UndefOr[AlignType] = js.native
  var className: js.UndefOr[String] = js.native
  var ellipsis: js.UndefOr[CellEllipsisType] = js.native
  var fixed: js.UndefOr[FixedType] = js.native
  var key: js.UndefOr[Key] = js.native
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object ColumnSharedType {
  @scala.inline
  def apply[RecordType](): ColumnSharedType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSharedType[RecordType]]
  }
  @scala.inline
  implicit class ColumnSharedTypeOps[Self <: ColumnSharedType[_], RecordType] (val x: Self with ColumnSharedType[RecordType]) extends AnyVal {
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
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEllipsis(value: CellEllipsisType): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setFixed(value: FixedType): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOnHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderCell", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHeaderCell: Self = this.set("onHeaderCell", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


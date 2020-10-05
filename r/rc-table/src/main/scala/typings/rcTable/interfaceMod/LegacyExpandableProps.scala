package typings.rcTable.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyExpandableProps[RecordType] extends js.Object {
  /** @deprecated Use `expandable.childrenColumnName` instead */
  var childrenColumnName: js.UndefOr[String] = js.native
  /** @deprecated Use `expandable.defaultExpandAllRows` instead */
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
  /** @deprecated Use `expandable.defaultExpandedRowKeys` instead */
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  /** @deprecated Use `expandable.expandIcon` instead */
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  /** @deprecated Use `expandable.expandIconColumnIndex` instead */
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  /** @deprecated Use `expandable.expandRowByClick` instead */
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  /** @deprecated Use `expandable.expandedRowClassName` instead */
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
  /** @deprecated Use `expandable.expandedRowKeys` instead */
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  /** @deprecated Use `expandable.expandedRowRender` instead */
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
  /** @deprecated Use `expandable.indentSize` instead */
  var indentSize: js.UndefOr[Double] = js.native
  /** @deprecated Use `expandable.onExpand` instead */
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
  /** @deprecated Use `expandable.onExpandedRowsChange` instead */
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
}

object LegacyExpandableProps {
  @scala.inline
  def apply[RecordType](): LegacyExpandableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyExpandableProps[RecordType]]
  }
  @scala.inline
  implicit class LegacyExpandablePropsOps[Self <: LegacyExpandableProps[_], RecordType] (val x: Self with LegacyExpandableProps[RecordType]) extends AnyVal {
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
    def setChildrenColumnName(value: String): Self = this.set("childrenColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenColumnName: Self = this.set("childrenColumnName", js.undefined)
    @scala.inline
    def setDefaultExpandAllRows(value: Boolean): Self = this.set("defaultExpandAllRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpandAllRows: Self = this.set("defaultExpandAllRows", js.undefined)
    @scala.inline
    def setDefaultExpandedRowKeysVarargs(value: Key*): Self = this.set("defaultExpandedRowKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = this.set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpandedRowKeys: Self = this.set("defaultExpandedRowKeys", js.undefined)
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = this.set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIconColumnIndex: Self = this.set("expandIconColumnIndex", js.undefined)
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = this.set("expandRowByClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandRowByClick: Self = this.set("expandRowByClick", js.undefined)
    @scala.inline
    def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("expandedRowClassName", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExpandedRowClassName: Self = this.set("expandedRowClassName", js.undefined)
    @scala.inline
    def setExpandedRowKeysVarargs(value: Key*): Self = this.set("expandedRowKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedRowKeys(value: js.Array[Key]): Self = this.set("expandedRowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedRowKeys: Self = this.set("expandedRowKeys", js.undefined)
    @scala.inline
    def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = this.set("expandedRowRender", js.Any.fromFunction4(value))
    @scala.inline
    def deleteExpandedRowRender: Self = this.set("expandedRowRender", js.undefined)
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    @scala.inline
    def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    @scala.inline
    def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = this.set("onExpandedRowsChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpandedRowsChange: Self = this.set("onExpandedRowsChange", js.undefined)
  }
  
}


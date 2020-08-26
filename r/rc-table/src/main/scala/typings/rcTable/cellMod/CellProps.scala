package typings.rcTable.cellMod

import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CellEllipsisType
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.interfaceMod.RenderedCell
import typings.rcTable.rcTableBooleans.`false`
import typings.rcTable.rcTableStrings.body
import typings.rcTable.rcTableStrings.footer
import typings.rcTable.rcTableStrings.header
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps[RecordType /* <: DefaultRecordType */] extends js.Object {
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  var align: js.UndefOr[AlignType] = js.native
  /** @private Used for `expandable` with nest tree */
  var appendNode: js.UndefOr[ReactNode] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var component: js.UndefOr[CustomizeComponent] = js.native
  var dataIndex: js.UndefOr[DataIndex] = js.native
  var ellipsis: js.UndefOr[CellEllipsisType] = js.native
  var firstFixLeft: js.UndefOr[Boolean] = js.native
  var firstFixRight: js.UndefOr[Boolean] = js.native
  var fixLeft: js.UndefOr[Double | `false`] = js.native
  var fixRight: js.UndefOr[Double | `false`] = js.native
  /** `record` index. Not `column` index. */
  var index: js.UndefOr[Double] = js.native
  var lastFixLeft: js.UndefOr[Boolean] = js.native
  var lastFixRight: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var record: js.UndefOr[RecordType] = js.native
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactNode | RenderedCell[RecordType]
    ]
  ] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rowType: js.UndefOr[header | body | footer] = js.native
  var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
}

object CellProps {
  @scala.inline
  def apply[/* <: typings.rcTable.interfaceMod.DefaultRecordType */ RecordType](): CellProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps[RecordType]]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps[_], /* <: typings.rcTable.interfaceMod.DefaultRecordType */ RecordType] (val x: Self with CellProps[RecordType]) extends AnyVal {
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
    def setAdditionalProps(value: HTMLAttributes[HTMLElement]): Self = this.set("additionalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProps: Self = this.set("additionalProps", js.undefined)
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAppendNode(value: ReactNode): Self = this.set("appendNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendNode: Self = this.set("appendNode", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setComponent(value: CustomizeComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDataIndexVarargs(value: (String | Double)*): Self = this.set("dataIndex", js.Array(value :_*))
    @scala.inline
    def setDataIndex(value: DataIndex): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setEllipsis(value: CellEllipsisType): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setFirstFixLeft(value: Boolean): Self = this.set("firstFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstFixLeft: Self = this.set("firstFixLeft", js.undefined)
    @scala.inline
    def setFirstFixRight(value: Boolean): Self = this.set("firstFixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstFixRight: Self = this.set("firstFixRight", js.undefined)
    @scala.inline
    def setFixLeft(value: Double | `false`): Self = this.set("fixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixLeft: Self = this.set("fixLeft", js.undefined)
    @scala.inline
    def setFixRight(value: Double | `false`): Self = this.set("fixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixRight: Self = this.set("fixRight", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLastFixLeft(value: Boolean): Self = this.set("lastFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFixLeft: Self = this.set("lastFixLeft", js.undefined)
    @scala.inline
    def setLastFixRight(value: Boolean): Self = this.set("lastFixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFixRight: Self = this.set("lastFixRight", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRecord(value: RecordType): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setRender(
      value: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType]
    ): Self = this.set("render", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setRowType(value: header | body | footer): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = this.set("shouldCellUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldCellUpdate: Self = this.set("shouldCellUpdate", js.undefined)
  }
  
}


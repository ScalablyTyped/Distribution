package typings.rcTable.cellMod

import typings.rcTable.interfaceMod.AlignType
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.interfaceMod.RenderedCell
import typings.rcTable.rcTableBooleans.`false`
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps[RecordType /* <: DefaultRecordType */] extends js.Object {
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var align: js.UndefOr[AlignType] = js.undefined
  /** @private Used for `expandable` with nest tree */
  var appendNode: js.UndefOr[ReactNode] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var dataIndex: js.UndefOr[DataIndex] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var firstFixRight: js.UndefOr[Boolean] = js.undefined
  var fixLeft: js.UndefOr[Double | `false`] = js.undefined
  var fixRight: js.UndefOr[Double | `false`] = js.undefined
  /** `record` index. Not `column` index. */
  var index: js.UndefOr[Double] = js.undefined
  var lastFixLeft: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[RecordType] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      ReactNode | RenderedCell[RecordType]
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply[RecordType /* <: DefaultRecordType */](
    additionalProps: HTMLAttributes[HTMLElement] = null,
    align: AlignType = null,
    appendNode: ReactNode = null,
    children: ReactNode = null,
    className: String = null,
    colSpan: Int | Double = null,
    component: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    dataIndex: DataIndex = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    firstFixRight: js.UndefOr[Boolean] = js.undefined,
    fixLeft: Double | `false` = null,
    fixRight: Double | `false` = null,
    index: Int | Double = null,
    lastFixLeft: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    record: RecordType = null,
    render: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType] = null,
    rowSpan: Int | Double = null
  ): CellProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (appendNode != null) __obj.updateDynamic("appendNode")(appendNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(firstFixRight)) __obj.updateDynamic("firstFixRight")(firstFixRight.asInstanceOf[js.Any])
    if (fixLeft != null) __obj.updateDynamic("fixLeft")(fixLeft.asInstanceOf[js.Any])
    if (fixRight != null) __obj.updateDynamic("fixRight")(fixRight.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFixLeft)) __obj.updateDynamic("lastFixLeft")(lastFixLeft.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps[RecordType]]
  }
}


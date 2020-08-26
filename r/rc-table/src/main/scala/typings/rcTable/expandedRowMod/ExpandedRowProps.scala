package typings.rcTable.expandedRowMod

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent = js.native
  var children: ReactNode = js.native
  var className: String = js.native
  var colSpan: Double = js.native
  var component: CustomizeComponent = js.native
  var componentWidth: Double = js.native
  var expanded: Boolean = js.native
  var fixColumn: Boolean = js.native
  var fixHeader: Boolean = js.native
  var horizonScroll: Boolean = js.native
  var prefixCls: String = js.native
}

object ExpandedRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    className: String,
    colSpan: Double,
    component: CustomizeComponent,
    componentWidth: Double,
    expanded: Boolean,
    fixColumn: Boolean,
    fixHeader: Boolean,
    horizonScroll: Boolean,
    prefixCls: String
  ): ExpandedRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedRowProps[RecordType]]
  }
  @scala.inline
  implicit class ExpandedRowPropsOps[Self <: ExpandedRowProps[_], RecordType] (val x: Self with ExpandedRowProps[RecordType]) extends AnyVal {
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
    def setCellComponent(value: CustomizeComponent): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: CustomizeComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentWidth(value: Double): Self = this.set("componentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixColumn(value: Boolean): Self = this.set("fixColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixHeader(value: Boolean): Self = this.set("fixHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizonScroll(value: Boolean): Self = this.set("horizonScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}


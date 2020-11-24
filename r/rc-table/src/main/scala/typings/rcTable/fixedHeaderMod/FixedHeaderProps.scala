package typings.rcTable.fixedHeaderMod

import typings.rcTable.anon.CurrentTarget
import typings.rcTable.headerMod.HeaderProps
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedHeaderProps[RecordType] extends HeaderProps[RecordType] {
  
  var colWidths: js.Array[Double] = js.native
  
  var columCount: Double = js.native
  
  var direction: ltr | rtl = js.native
  
  var fixHeader: Boolean = js.native
  
  var noData: Boolean = js.native
  
  var offsetHeader: Double = js.native
  
  def onScroll(info: CurrentTarget): Unit = js.native
  
  var stickyClassName: js.UndefOr[String] = js.native
}
object FixedHeaderProps {
  
  @scala.inline
  def apply[RecordType](
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[RecordType],
    direction: ltr | rtl,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[RecordType]],
    noData: Boolean,
    offsetHeader: Double,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    onScroll: CurrentTarget => Unit,
    stickyOffsets: StickyOffsets
  ): FixedHeaderProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], offsetHeader = offsetHeader.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1(onScroll), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedHeaderProps[RecordType]]
  }
  
  @scala.inline
  implicit class FixedHeaderPropsOps[Self <: FixedHeaderProps[_], RecordType] (val x: Self with FixedHeaderProps[RecordType]) extends AnyVal {
    
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
    def setColWidthsVarargs(value: Double*): Self = this.set("colWidths", js.Array(value :_*))
    
    @scala.inline
    def setColWidths(value: js.Array[Double]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumCount(value: Double): Self = this.set("columCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixHeader(value: Boolean): Self = this.set("fixHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoData(value: Boolean): Self = this.set("noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeader(value: Double): Self = this.set("offsetHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(value: CurrentTarget => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStickyClassName(value: String): Self = this.set("stickyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyClassName: Self = this.set("stickyClassName", js.undefined)
  }
}

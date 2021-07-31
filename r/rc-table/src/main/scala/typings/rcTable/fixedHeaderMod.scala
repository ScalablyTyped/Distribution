package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.CurrentTarget
import typings.rcTable.headerMod.HeaderProps
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedHeaderMod extends Shortcut {
  
  @JSImport("rc-table/lib/Header/FixedHeader", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FixedHeaderProps[js.Any] & RefAttributes[HTMLDivElement]] = js.native
  
  trait FixedHeaderProps[RecordType]
    extends StObject
       with HeaderProps[RecordType] {
    
    var colWidths: js.Array[Double]
    
    var columCount: Double
    
    var direction: ltr | rtl
    
    var fixHeader: Boolean
    
    var noData: Boolean
    
    var offsetHeader: Double
    
    def onScroll(info: CurrentTarget): Unit
    
    var stickyClassName: js.UndefOr[String] = js.undefined
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
    implicit class FixedHeaderPropsMutableBuilder[Self <: FixedHeaderProps[?], RecordType] (val x: Self & FixedHeaderProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoData(value: Boolean): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: CurrentTarget => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FixedHeaderProps[js.Any] & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `fixedHeaderMod.foo` */
  override def _to: ForwardRefExoticComponent[FixedHeaderProps[js.Any] & RefAttributes[HTMLDivElement]] = default
}

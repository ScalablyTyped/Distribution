package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.CurrentTarget
import typings.rcTable.libHeaderHeaderMod.HeaderProps
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.rcTable.libInterfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFixedHolderMod extends Shortcut {
  
  @JSImport("rc-table/lib/FixedHolder", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]] = js.native
  
  trait FixedHeaderProps[RecordType]
    extends StObject
       with HeaderProps[RecordType] {
    
    def children(info: HeaderProps[RecordType]): ReactNode
    
    var className: String
    
    var colWidths: js.Array[Double]
    
    var columCount: Double
    
    var direction: ltr | rtl
    
    var fixHeader: Boolean
    
    var maxContentScroll: Boolean
    
    var noData: Boolean
    
    def onScroll(info: CurrentTarget): Unit
    
    var stickyBottomOffset: js.UndefOr[Double] = js.undefined
    
    var stickyClassName: js.UndefOr[String] = js.undefined
    
    var stickyTopOffset: js.UndefOr[Double] = js.undefined
  }
  object FixedHeaderProps {
    
    inline def apply[RecordType](
      children: HeaderProps[RecordType] => ReactNode,
      className: String,
      colWidths: js.Array[Double],
      columCount: Double,
      columns: ColumnsType[RecordType],
      direction: ltr | rtl,
      fixHeader: Boolean,
      flattenColumns: js.Array[ColumnType[RecordType]],
      maxContentScroll: Boolean,
      noData: Boolean,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      onScroll: CurrentTarget => Unit,
      stickyOffsets: StickyOffsets
    ): FixedHeaderProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), className = className.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], maxContentScroll = maxContentScroll.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1(onScroll), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedHeaderProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedHeaderProps[?], RecordType] (val x: Self & FixedHeaderProps[RecordType]) extends AnyVal {
      
      inline def setChildren(value: HeaderProps[RecordType] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setMaxContentScroll(value: Boolean): Self = StObject.set(x, "maxContentScroll", value.asInstanceOf[js.Any])
      
      inline def setNoData(value: Boolean): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: CurrentTarget => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setStickyBottomOffset(value: Double): Self = StObject.set(x, "stickyBottomOffset", value.asInstanceOf[js.Any])
      
      inline def setStickyBottomOffsetUndefined: Self = StObject.set(x, "stickyBottomOffset", js.undefined)
      
      inline def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      inline def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      inline def setStickyTopOffset(value: Double): Self = StObject.set(x, "stickyTopOffset", value.asInstanceOf[js.Any])
      
      inline def setStickyTopOffsetUndefined: Self = StObject.set(x, "stickyTopOffset", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libFixedHolderMod.foo` */
  override def _to: ForwardRefExoticComponent[FixedHeaderProps[Any] & RefAttributes[HTMLDivElement]] = default
}

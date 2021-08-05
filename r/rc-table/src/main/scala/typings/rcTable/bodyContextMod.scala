package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.ExpandableType
import typings.rcTable.interfaceMod.ExpandedRowRender
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.rcTable.interfaceMod.RowClassName
import typings.rcTable.interfaceMod.TableLayout
import typings.rcTable.interfaceMod.TriggerEventHandler
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/BodyContext", JSImport.Default)
  @js.native
  val default: Context[BodyContextProps[Record[String, js.Any]]] = js.native
  
  trait BodyContextProps[RecordType] extends StObject {
    
    var columns: ColumnsType[RecordType]
    
    var componentWidth: Double
    
    var expandIcon: RenderExpandIcon[RecordType]
    
    var expandIconColumnIndex: Double
    
    var expandRowByClick: Boolean
    
    var expandableType: ExpandableType
    
    var expandedRowClassName: RowClassName[RecordType]
    
    var expandedRowRender: ExpandedRowRender[RecordType]
    
    var fixColumn: Boolean
    
    var fixHeader: Boolean
    
    var flattenColumns: js.Array[ColumnType[RecordType]]
    
    var horizonScroll: Boolean
    
    var indentSize: Double
    
    var onTriggerExpand: TriggerEventHandler[RecordType]
    
    var rowClassName: String | RowClassName[RecordType]
    
    var tableLayout: TableLayout
  }
  object BodyContextProps {
    
    inline def apply[RecordType](
      columns: ColumnsType[RecordType],
      componentWidth: Double,
      expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode,
      expandIconColumnIndex: Double,
      expandRowByClick: Boolean,
      expandableType: ExpandableType,
      expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
      expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode,
      fixColumn: Boolean,
      fixHeader: Boolean,
      flattenColumns: js.Array[ColumnType[RecordType]],
      horizonScroll: Boolean,
      indentSize: Double,
      onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
      rowClassName: String | RowClassName[RecordType],
      tableLayout: TableLayout
    ): BodyContextProps[RecordType] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], horizonScroll = horizonScroll.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyContextProps[RecordType]]
    }
    
    extension [Self <: BodyContextProps[?], RecordType](x: Self & BodyContextProps[RecordType]) {
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandableType(value: ExpandableType): Self = StObject.set(x, "expandableType", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      inline def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setOnTriggerExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
      
      inline def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      inline def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      inline def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[BodyContextProps[Record[String, js.Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `bodyContextMod.foo` */
  override def _to: Context[BodyContextProps[Record[String, js.Any]]] = default
}

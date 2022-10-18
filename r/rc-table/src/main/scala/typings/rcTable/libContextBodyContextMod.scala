package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.libContextSelectorMod.ReturnCreateContext
import typings.rcTable.libInterfaceMod.ColumnGroupType
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.rcTable.libInterfaceMod.DefaultRecordType
import typings.rcTable.libInterfaceMod.ExpandableType
import typings.rcTable.libInterfaceMod.ExpandedRowRender
import typings.rcTable.libInterfaceMod.RenderExpandIcon
import typings.rcTable.libInterfaceMod.RenderExpandIconProps
import typings.rcTable.libInterfaceMod.RowClassName
import typings.rcTable.libInterfaceMod.TableLayout
import typings.rcTable.libInterfaceMod.TriggerEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextBodyContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/BodyContext", JSImport.Default)
  @js.native
  val default: ReturnCreateContext[BodyContextProps[DefaultRecordType]] = js.native
  
  trait BodyContextProps[RecordType] extends StObject {
    
    var allColumnsFixedLeft: Boolean
    
    var columns: ColumnsType[RecordType]
    
    var expandIcon: RenderExpandIcon[RecordType]
    
    var expandIconColumnIndex: Double
    
    var expandRowByClick: Boolean
    
    var expandableType: ExpandableType
    
    var expandedRowClassName: RowClassName[RecordType]
    
    var expandedRowRender: ExpandedRowRender[RecordType]
    
    var flattenColumns: js.Array[ColumnType[RecordType]]
    
    var indentSize: Double
    
    var onTriggerExpand: TriggerEventHandler[RecordType]
    
    var rowClassName: String | RowClassName[RecordType]
    
    var tableLayout: TableLayout
  }
  object BodyContextProps {
    
    inline def apply[RecordType](
      allColumnsFixedLeft: Boolean,
      columns: ColumnsType[RecordType],
      expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode,
      expandIconColumnIndex: Double,
      expandRowByClick: Boolean,
      expandableType: ExpandableType,
      expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
      expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode,
      flattenColumns: js.Array[ColumnType[RecordType]],
      indentSize: Double,
      onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
      rowClassName: String | RowClassName[RecordType],
      tableLayout: TableLayout
    ): BodyContextProps[RecordType] = {
      val __obj = js.Dynamic.literal(allColumnsFixedLeft = allColumnsFixedLeft.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), flattenColumns = flattenColumns.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyContextProps[RecordType]]
    }
    
    extension [Self <: BodyContextProps[?], RecordType](x: Self & BodyContextProps[RecordType]) {
      
      inline def setAllColumnsFixedLeft(value: Boolean): Self = StObject.set(x, "allColumnsFixedLeft", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandableType(value: ExpandableType): Self = StObject.set(x, "expandableType", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setOnTriggerExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
      
      inline def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      inline def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      inline def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReturnCreateContext[BodyContextProps[DefaultRecordType]]
  
  /* This means you don't have to write `default`, but can instead just say `libContextBodyContextMod.foo` */
  override def _to: ReturnCreateContext[BodyContextProps[DefaultRecordType]] = default
}

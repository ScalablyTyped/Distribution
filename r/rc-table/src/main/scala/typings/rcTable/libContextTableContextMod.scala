package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentContext.esContextMod.SelectorContext
import typings.rcTable.libInterfaceMod.ColumnGroupType
import typings.rcTable.libInterfaceMod.ColumnType
import typings.rcTable.libInterfaceMod.ColumnsType
import typings.rcTable.libInterfaceMod.CustomizeComponent
import typings.rcTable.libInterfaceMod.Direction
import typings.rcTable.libInterfaceMod.ExpandableType
import typings.rcTable.libInterfaceMod.ExpandedRowRender
import typings.rcTable.libInterfaceMod.GetComponent
import typings.rcTable.libInterfaceMod.RenderExpandIcon
import typings.rcTable.libInterfaceMod.RenderExpandIconProps
import typings.rcTable.libInterfaceMod.RowClassName
import typings.rcTable.libInterfaceMod.TableLayout
import typings.rcTable.libInterfaceMod.TriggerEventHandler
import typings.rcTable.libUtilsFixUtilMod.FixedInfo
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextTableContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/TableContext", JSImport.Default)
  @js.native
  val default: SelectorContext[TableContextProps[Any]] = js.native
  
  trait TableContextProps[RecordType] extends StObject {
    
    var allColumnsFixedLeft: Boolean
    
    var columns: ColumnsType[RecordType]
    
    var componentWidth: Double
    
    var direction: Direction
    
    var expandIcon: RenderExpandIcon[RecordType]
    
    var expandIconColumnIndex: Double
    
    var expandRowByClick: Boolean
    
    var expandableType: ExpandableType
    
    var expandedRowClassName: RowClassName[RecordType]
    
    var expandedRowRender: ExpandedRowRender[RecordType]
    
    var fixColumn: Boolean
    
    var fixHeader: Boolean
    
    var fixedInfoList: js.Array[FixedInfo]
    
    var flattenColumns: js.Array[ColumnType[RecordType]]
    
    var getComponent: GetComponent
    
    var horizonScroll: Boolean
    
    var hoverEndRow: Double
    
    var hoverStartRow: Double
    
    var indentSize: Double
    
    var isSticky: Boolean
    
    def onColumnResize(columnKey: Key, width: Double): Unit
    
    def onHover(start: Double, end: Double): Unit
    
    var onTriggerExpand: TriggerEventHandler[RecordType]
    
    var prefixCls: String
    
    var rowClassName: String | RowClassName[RecordType]
    
    var scrollbarSize: Double
    
    var supportSticky: Boolean
    
    var tableLayout: TableLayout
  }
  object TableContextProps {
    
    inline def apply[RecordType](
      allColumnsFixedLeft: Boolean,
      columns: ColumnsType[RecordType],
      componentWidth: Double,
      direction: Direction,
      expandIcon: /* props */ RenderExpandIconProps[RecordType] => ReactNode,
      expandIconColumnIndex: Double,
      expandRowByClick: Boolean,
      expandableType: ExpandableType,
      expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => String,
      expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode,
      fixColumn: Boolean,
      fixHeader: Boolean,
      fixedInfoList: js.Array[FixedInfo],
      flattenColumns: js.Array[ColumnType[RecordType]],
      getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
      horizonScroll: Boolean,
      hoverEndRow: Double,
      hoverStartRow: Double,
      indentSize: Double,
      isSticky: Boolean,
      onColumnResize: (Key, Double) => Unit,
      onHover: (Double, Double) => Unit,
      onTriggerExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
      prefixCls: String,
      rowClassName: String | RowClassName[RecordType],
      scrollbarSize: Double,
      supportSticky: Boolean,
      tableLayout: TableLayout
    ): TableContextProps[RecordType] = {
      val __obj = js.Dynamic.literal(allColumnsFixedLeft = allColumnsFixedLeft.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], expandIcon = js.Any.fromFunction1(expandIcon), expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], expandedRowClassName = js.Any.fromFunction3(expandedRowClassName), expandedRowRender = js.Any.fromFunction4(expandedRowRender), fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], fixedInfoList = fixedInfoList.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), horizonScroll = horizonScroll.asInstanceOf[js.Any], hoverEndRow = hoverEndRow.asInstanceOf[js.Any], hoverStartRow = hoverStartRow.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], onColumnResize = js.Any.fromFunction2(onColumnResize), onHover = js.Any.fromFunction2(onHover), onTriggerExpand = js.Any.fromFunction2(onTriggerExpand), prefixCls = prefixCls.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any], supportSticky = supportSticky.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableContextProps[?], RecordType] (val x: Self & TableContextProps[RecordType]) extends AnyVal {
      
      inline def setAllColumnsFixedLeft(value: Boolean): Self = StObject.set(x, "allColumnsFixedLeft", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponentWidth(value: Double): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandableType(value: ExpandableType): Self = StObject.set(x, "expandableType", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setFixColumn(value: Boolean): Self = StObject.set(x, "fixColumn", value.asInstanceOf[js.Any])
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedInfoList(value: js.Array[FixedInfo]): Self = StObject.set(x, "fixedInfoList", value.asInstanceOf[js.Any])
      
      inline def setFixedInfoListVarargs(value: FixedInfo*): Self = StObject.set(x, "fixedInfoList", js.Array(value*))
      
      inline def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      inline def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
      
      inline def setGetComponent(
        value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
      ): Self = StObject.set(x, "getComponent", js.Any.fromFunction2(value))
      
      inline def setHorizonScroll(value: Boolean): Self = StObject.set(x, "horizonScroll", value.asInstanceOf[js.Any])
      
      inline def setHoverEndRow(value: Double): Self = StObject.set(x, "hoverEndRow", value.asInstanceOf[js.Any])
      
      inline def setHoverStartRow(value: Double): Self = StObject.set(x, "hoverStartRow", value.asInstanceOf[js.Any])
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setOnColumnResize(value: (Key, Double) => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2(value))
      
      inline def setOnHover(value: (Double, Double) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction2(value))
      
      inline def setOnTriggerExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onTriggerExpand", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      inline def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      inline def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
      
      inline def setSupportSticky(value: Boolean): Self = StObject.set(x, "supportSticky", value.asInstanceOf[js.Any])
      
      inline def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SelectorContext[TableContextProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libContextTableContextMod.foo` */
  override def _to: SelectorContext[TableContextProps[Any]] = default
}

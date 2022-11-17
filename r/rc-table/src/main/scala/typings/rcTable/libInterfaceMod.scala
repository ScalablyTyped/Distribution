package typings.rcTable

import typings.rcTable.anon.Cell
import typings.rcTable.anon.OnScroll
import typings.rcTable.anon.ShowTitle
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  object AlignType {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
  }
  type AlignType = "left" | "center" | "right"
  
  type CellEllipsisType = ShowTitle | Boolean
  
  trait CellType[RecordType] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colEnd: js.UndefOr[Double] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var colStart: js.UndefOr[Double] = js.undefined
    
    var column: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
      ] = js.undefined
    
    /** Only used for table header */
    var hasSubColumns: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CellType {
    
    inline def apply[RecordType](): CellType[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellType[RecordType]]
    }
    
    extension [Self <: CellType[?], RecordType](x: Self & CellType[RecordType]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColEnd(value: Double): Self = StObject.set(x, "colEnd", value.asInstanceOf[js.Any])
      
      inline def setColEndUndefined: Self = StObject.set(x, "colEnd", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColStart(value: Double): Self = StObject.set(x, "colStart", value.asInstanceOf[js.Any])
      
      inline def setColStartUndefined: Self = StObject.set(x, "colStart", js.undefined)
      
      inline def setColumn(
        value: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
      ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHasSubColumns(value: Boolean): Self = StObject.set(x, "hasSubColumns", value.asInstanceOf[js.Any])
      
      inline def setHasSubColumnsUndefined: Self = StObject.set(x, "hasSubColumns", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  object ColScopeType {
    
    inline def col: "col" = "col".asInstanceOf["col"]
    
    inline def colgroup: "colgroup" = "colgroup".asInstanceOf["colgroup"]
  }
  type ColScopeType = "col" | "colgroup"
  
  trait ColumnGroupType[RecordType]
    extends StObject
       with ColumnSharedType[RecordType] {
    
    var children: ColumnsType[RecordType]
  }
  object ColumnGroupType {
    
    inline def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupType[RecordType]]
    }
    
    extension [Self <: ColumnGroupType[?], RecordType](x: Self & ColumnGroupType[RecordType]) {
      
      inline def setChildren(value: ColumnsType[RecordType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ColumnSharedType[RecordType] extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.undefined
    
    var fixed: js.UndefOr[FixedType] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var onHeaderCell: js.UndefOr[
        GetComponentProps[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
        ]
      ] = js.undefined
    
    var rowScope: js.UndefOr[RowScopeType] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ColumnSharedType {
    
    inline def apply[RecordType](): ColumnSharedType[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSharedType[RecordType]]
    }
    
    extension [Self <: ColumnSharedType[?], RecordType](x: Self & ColumnSharedType[RecordType]) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnHeaderCell(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderCell", js.Any.fromFunction2(value))
      
      inline def setOnHeaderCellUndefined: Self = StObject.set(x, "onHeaderCell", js.undefined)
      
      inline def setRowScope(value: RowScopeType): Self = StObject.set(x, "rowScope", value.asInstanceOf[js.Any])
      
      inline def setRowScopeUndefined: Self = StObject.set(x, "rowScope", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ColumnType[RecordType]
    extends StObject
       with ColumnSharedType[RecordType] {
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var dataIndex: js.UndefOr[DataIndex] = js.undefined
    
    var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
    
    /** @deprecated Please use `onCell` instead */
    var onCellClick: js.UndefOr[
        js.Function2[/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          ReactNode | RenderedCell[RecordType]
        ]
      ] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ColumnType {
    
    inline def apply[RecordType](): ColumnType[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnType[RecordType]]
    }
    
    extension [Self <: ColumnType[?], RecordType](x: Self & ColumnType[RecordType]) {
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value*))
      
      inline def setOnCell(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
      
      inline def setOnCellClick(value: (/* record */ RecordType, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
      
      inline def setRender(
        value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => ReactNode | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      inline def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]
  
  type Component[P] = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119, starting with typings.react.mod.ComponentType[P], typings.react.mod.ForwardRefExoticComponent[P], typings.react.mod.FC[P] */ Any
  
  type CustomizeComponent = Component[Any]
  
  type CustomizeScrollBody[RecordType] = js.Function2[/* data */ js.Array[RecordType], /* info */ OnScroll, ReactNode]
  
  type DataIndex = String | Double | (js.Array[String | Double])
  
  type DefaultRecordType = Record[String, Any]
  
  trait ExpandableConfig[RecordType] extends StObject {
    
    var childrenColumnName: js.UndefOr[String] = js.undefined
    
    var columnTitle: js.UndefOr[ReactNode] = js.undefined
    
    var columnWidth: js.UndefOr[Double | String] = js.undefined
    
    var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
    
    /** @deprecated Please use `EXPAND_COLUMN` in `columns` directly */
    var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
    
    var expandRowByClick: js.UndefOr[Boolean] = js.undefined
    
    var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
    
    var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
    
    var fixed: js.UndefOr[FixedType] = js.undefined
    
    var indentSize: js.UndefOr[Double] = js.undefined
    
    var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
    
    var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
    
    var showExpandColumn: js.UndefOr[Boolean] = js.undefined
  }
  object ExpandableConfig {
    
    inline def apply[RecordType](): ExpandableConfig[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandableConfig[RecordType]]
    }
    
    extension [Self <: ExpandableConfig[?], RecordType](x: Self & ExpandableConfig[RecordType]) {
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
      
      inline def setColumnTitle(value: ReactNode): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
      
      inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
      
      inline def setColumnWidth(value: Double | String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
      
      inline def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
      
      inline def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value*))
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
      
      inline def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      inline def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
      
      inline def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      inline def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
      
      inline def setRowExpandable(value: /* record */ RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
      
      inline def setRowExpandableUndefined: Self = StObject.set(x, "rowExpandable", js.undefined)
      
      inline def setShowExpandColumn(value: Boolean): Self = StObject.set(x, "showExpandColumn", value.asInstanceOf[js.Any])
      
      inline def setShowExpandColumnUndefined: Self = StObject.set(x, "showExpandColumn", js.undefined)
    }
  }
  
  object ExpandableType {
    
    inline def `false`: false = false.asInstanceOf[false]
    
    inline def nest: "nest" = "nest".asInstanceOf["nest"]
    
    inline def row: "row" = "row".asInstanceOf["row"]
  }
  type ExpandableType = false | "row" | "nest"
  
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ Double, 
    /* indent */ Double, 
    /* expanded */ Boolean, 
    ReactNode
  ]
  
  type FixedType = "left" | "right" | Boolean
  
  type GetComponent = js.Function2[
    /* path */ js.Array[String], 
    /* defaultComponent */ js.UndefOr[CustomizeComponent], 
    CustomizeComponent
  ]
  
  type GetComponentProps[DataType] = js.Function2[
    /* data */ DataType, 
    /* index */ js.UndefOr[Double], 
    HTMLAttributes[Any] | TdHTMLAttributes[Any]
  ]
  
  type GetRowKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]
  
  type Key = typings.react.mod.Key
  
  trait LegacyExpandableProps[RecordType] extends StObject {
    
    /** @deprecated Use `expandable.childrenColumnName` instead */
    var childrenColumnName: js.UndefOr[String] = js.undefined
    
    /** @deprecated Use `expandable.defaultExpandAllRows` instead */
    var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Use `expandable.defaultExpandedRowKeys` instead */
    var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** @deprecated Use `expandable.expandIcon` instead */
    var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
    
    /** @deprecated Use `expandable.expandIconColumnIndex` instead */
    var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
    
    /** @deprecated Use `expandable.expandRowByClick` instead */
    var expandRowByClick: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Use `expandable.expandedRowClassName` instead */
    var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
    
    /** @deprecated Use `expandable.expandedRowKeys` instead */
    var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** @deprecated Use `expandable.expandedRowRender` instead */
    var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
    
    /** @deprecated Use `expandable.indentSize` instead */
    var indentSize: js.UndefOr[Double] = js.undefined
    
    /** @deprecated Use `expandable.onExpand` instead */
    var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
    
    /** @deprecated Use `expandable.onExpandedRowsChange` instead */
    var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    /** @deprecated Use `caption` instead */
    var title: js.UndefOr[PanelRender[RecordType]] = js.undefined
  }
  object LegacyExpandableProps {
    
    inline def apply[RecordType](): LegacyExpandableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyExpandableProps[RecordType]]
    }
    
    extension [Self <: LegacyExpandableProps[?], RecordType](x: Self & LegacyExpandableProps[RecordType]) {
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
      
      inline def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
      
      inline def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
      
      inline def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value*))
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
      
      inline def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      inline def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      inline def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
      
      inline def setTitle(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], ReactNode]
  
  type RenderExpandIcon[RecordType] = js.Function1[/* props */ RenderExpandIconProps[RecordType], ReactNode]
  
  trait RenderExpandIconProps[RecordType] extends StObject {
    
    var expandable: Boolean
    
    var expanded: Boolean
    
    var onExpand: TriggerEventHandler[RecordType]
    
    var prefixCls: String
    
    var record: RecordType
  }
  object RenderExpandIconProps {
    
    inline def apply[RecordType](
      expandable: Boolean,
      expanded: Boolean,
      onExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
      prefixCls: String,
      record: RecordType
    ): RenderExpandIconProps[RecordType] = {
      val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderExpandIconProps[RecordType]]
    }
    
    extension [Self <: RenderExpandIconProps[?], RecordType](x: Self & RenderExpandIconProps[RecordType]) {
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setOnExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderedCell[RecordType] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var props: js.UndefOr[CellType[RecordType]] = js.undefined
  }
  object RenderedCell {
    
    inline def apply[RecordType](): RenderedCell[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderedCell[RecordType]]
    }
    
    extension [Self <: RenderedCell[?], RecordType](x: Self & RenderedCell[RecordType]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setProps(value: CellType[RecordType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type RowClassName[RecordType] = js.Function3[/* record */ RecordType, /* index */ Double, /* indent */ Double, String]
  
  object RowScopeType {
    
    inline def row: "row" = "row".asInstanceOf["row"]
    
    inline def rowgroup: "rowgroup" = "rowgroup".asInstanceOf["rowgroup"]
  }
  type RowScopeType = "row" | "rowgroup"
  
  object ScopeType {
    
    inline def col: "col" = "col".asInstanceOf["col"]
    
    inline def colgroup: "colgroup" = "colgroup".asInstanceOf["colgroup"]
    
    inline def row: "row" = "row".asInstanceOf["row"]
    
    inline def rowgroup: "rowgroup" = "rowgroup".asInstanceOf["rowgroup"]
  }
  type ScopeType = "col" | "colgroup" | "row" | "rowgroup"
  
  trait StickyOffsets extends StObject {
    
    var isSticky: js.UndefOr[Boolean] = js.undefined
    
    var left: js.Array[Double]
    
    var right: js.Array[Double]
  }
  object StickyOffsets {
    
    inline def apply(left: js.Array[Double], right: js.Array[Double]): StickyOffsets = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyOffsets]
    }
    
    extension [Self <: StickyOffsets](x: Self) {
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
      
      inline def setLeft(value: js.Array[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftVarargs(value: Double*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setRight(value: js.Array[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightVarargs(value: Double*): Self = StObject.set(x, "right", js.Array(value*))
    }
  }
  
  trait TableComponents[RecordType] extends StObject {
    
    var body: js.UndefOr[CustomizeScrollBody[RecordType] | Cell] = js.undefined
    
    var header: js.UndefOr[Cell] = js.undefined
    
    var table: js.UndefOr[CustomizeComponent] = js.undefined
  }
  object TableComponents {
    
    inline def apply[RecordType](): TableComponents[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableComponents[RecordType]]
    }
    
    extension [Self <: TableComponents[?], RecordType](x: Self & TableComponents[RecordType]) {
      
      inline def setBody(value: CustomizeScrollBody[RecordType] | Cell): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyFunction2(value: (/* data */ js.Array[RecordType], /* info */ OnScroll) => ReactNode): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeader(value: Cell): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setTable(value: CustomizeComponent): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  object TableLayout {
    
    inline def auto: "auto" = "auto".asInstanceOf["auto"]
    
    inline def fixed: "fixed" = "fixed".asInstanceOf["fixed"]
  }
  type TableLayout = "auto" | "fixed"
  
  trait TableSticky extends StObject {
    
    var getContainer: js.UndefOr[js.Function0[Window | HTMLElement]] = js.undefined
    
    var offsetHeader: js.UndefOr[Double] = js.undefined
    
    var offsetScroll: js.UndefOr[Double] = js.undefined
    
    var offsetSummary: js.UndefOr[Double] = js.undefined
  }
  object TableSticky {
    
    inline def apply(): TableSticky = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSticky]
    }
    
    extension [Self <: TableSticky](x: Self) {
      
      inline def setGetContainer(value: () => Window | HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setOffsetHeader(value: Double): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeaderUndefined: Self = StObject.set(x, "offsetHeader", js.undefined)
      
      inline def setOffsetScroll(value: Double): Self = StObject.set(x, "offsetScroll", value.asInstanceOf[js.Any])
      
      inline def setOffsetScrollUndefined: Self = StObject.set(x, "offsetScroll", js.undefined)
      
      inline def setOffsetSummary(value: Double): Self = StObject.set(x, "offsetSummary", value.asInstanceOf[js.Any])
      
      inline def setOffsetSummaryUndefined: Self = StObject.set(x, "offsetSummary", js.undefined)
    }
  }
  
  type TriggerEventHandler[RecordType] = js.Function2[/* record */ RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
}

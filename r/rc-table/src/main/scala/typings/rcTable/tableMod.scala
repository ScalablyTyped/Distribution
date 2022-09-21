package typings.rcTable

import typings.rcTable.anon.Body
import typings.rcTable.anon.X
import typings.rcTable.columnGroupMod.ColumnGroupProps
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.interfaceMod.ExpandableConfig
import typings.rcTable.interfaceMod.ExpandedRowRender
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.PanelRender
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.rcTable.interfaceMod.RowClassName
import typings.rcTable.interfaceMod.TableComponents
import typings.rcTable.interfaceMod.TableLayout
import typings.rcTable.interfaceMod.TableSticky
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.rcTable.summaryMod.SummaryProps
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  object default {
    
    inline def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    inline def Column[RecordType](_underscore: ColumnProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    inline def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ColumnGroup")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* was `typeof imported_Summary.default` */
    object Summary {
      
      /**
        * Syntactic sugar. Do not support HOC.
        */
      inline def apply(hasChildren: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
      
      @JSImport("rc-table/lib/Table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table/lib/Table", "default.Summary.Cell")
      @js.native
      def Cell: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_Cell.default */ Any = js.native
      inline def Cell_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_Cell.default */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.Summary.Row")
      @js.native
      def Row: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_Row.default */ Any = js.native
      inline def Row_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_Row.default */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("rc-table/lib/Table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def emptyText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyText")().asInstanceOf[String]
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      inline def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("rc-table/lib/Table", "INTERNAL_HOOKS")
  @js.native
  val INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String = js.native
  
  /* Inlined parent std.Omit<rc-table.rc-table/lib/interface.LegacyExpandableProps<RecordType>, 'showExpandColumn'> */
  trait TableProps[RecordType] extends StObject {
    
    var caption: js.UndefOr[String | ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var childrenColumnName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
    
    var components: js.UndefOr[TableComponents[RecordType]] = js.undefined
    
    var data: js.UndefOr[js.Array[RecordType]] = js.undefined
    
    var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
    
    var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
    
    var expandRowByClick: js.UndefOr[Boolean] = js.undefined
    
    /** Config expand rows */
    var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
    
    var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
    
    var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
    
    var footer: js.UndefOr[PanelRender[RecordType]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indentSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @private Internal usage, may remove by refactor. Should always use `columns` instead.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var internalHooks: js.UndefOr[String] = js.undefined
    
    /**
      * @private Internal usage, may remove by refactor.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var internalRefs: js.UndefOr[Body] = js.undefined
    
    var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
    
    var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.undefined
    
    var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.undefined
    
    var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.undefined
    
    var scroll: js.UndefOr[X] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var sticky: js.UndefOr[Boolean | TableSticky] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], ReactNode]] = js.undefined
    
    var tableLayout: js.UndefOr[TableLayout] = js.undefined
    
    var title: js.UndefOr[PanelRender[RecordType]] = js.undefined
    
    /**
      * @private Internal usage, may remove by refactor. Should always use `columns` instead.
      *
      * !!! DO NOT USE IN PRODUCTION ENVIRONMENT !!!
      */
    var transformColumns: js.UndefOr[js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]] = js.undefined
  }
  object TableProps {
    
    inline def apply[RecordType](): TableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps[RecordType]]
    }
    
    extension [Self <: TableProps[?], RecordType](x: Self & TableProps[RecordType]) {
      
      inline def setCaption(value: String | ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponents(value: TableComponents[RecordType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
      
      inline def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
      
      inline def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value*))
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
      
      inline def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
      
      inline def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      inline def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
      
      inline def setFooter(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      inline def setInternalHooks(value: String): Self = StObject.set(x, "internalHooks", value.asInstanceOf[js.Any])
      
      inline def setInternalHooksUndefined: Self = StObject.set(x, "internalHooks", js.undefined)
      
      inline def setInternalRefs(value: Body): Self = StObject.set(x, "internalRefs", value.asInstanceOf[js.Any])
      
      inline def setInternalRefsUndefined: Self = StObject.set(x, "internalRefs", js.undefined)
      
      inline def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
      
      inline def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      inline def setOnHeaderRowUndefined: Self = StObject.set(x, "onHeaderRow", js.undefined)
      
      inline def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      inline def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setRowKey(value: String | GetRowKey[RecordType]): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction2(value))
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setScroll(value: X): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "summary", js.Any.fromFunction1(value))
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def setTitle(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): Self = StObject.set(x, "transformColumns", js.Any.fromFunction1(value))
      
      inline def setTransformColumnsUndefined: Self = StObject.set(x, "transformColumns", js.undefined)
    }
  }
}

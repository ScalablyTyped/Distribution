package typings.rcTable

import typings.rcTable.anon.Body
import typings.rcTable.anon.X
import typings.rcTable.columnGroupMod.ColumnGroupProps
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.interfaceMod.ColumnGroupType
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ColumnsType
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.interfaceMod.ExpandableConfig
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.LegacyExpandableProps
import typings.rcTable.interfaceMod.PanelRender
import typings.rcTable.interfaceMod.RowClassName
import typings.rcTable.interfaceMod.TableComponents
import typings.rcTable.interfaceMod.TableLayout
import typings.rcTable.interfaceMod.TableSticky
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  object default {
    
    @scala.inline
    def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    @scala.inline
    def Column[RecordType](_underscore: ColumnProps[RecordType]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    @scala.inline
    def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ColumnGroup")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    object Summary {
      
      @JSImport("rc-table/lib/Table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table/lib/Table", "default.Summary.Cell")
      @js.native
      def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
      @scala.inline
      def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.Summary.Row")
      @js.native
      def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
      @scala.inline
      def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("rc-table/lib/Table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def emptyText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyText")().asInstanceOf[String]
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table/lib/Table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      @scala.inline
      def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("rc-table/lib/Table", "INTERNAL_HOOKS")
  @js.native
  val INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String = js.native
  
  trait TableProps[RecordType]
    extends StObject
       with LegacyExpandableProps[RecordType] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
    
    var components: js.UndefOr[TableComponents[RecordType]] = js.undefined
    
    var data: js.UndefOr[js.Array[RecordType]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var emptyText: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    /** Config expand rows */
    var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
    
    var footer: js.UndefOr[PanelRender[RecordType]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
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
    
    @scala.inline
    def apply[RecordType](): TableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps[RecordType]]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps[?], RecordType] (val x: Self & TableProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setComponents(value: TableComponents[RecordType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEmptyText(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      @scala.inline
      def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setFooter(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInternalHooks(value: String): Self = StObject.set(x, "internalHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalHooksUndefined: Self = StObject.set(x, "internalHooks", js.undefined)
      
      @scala.inline
      def setInternalRefs(value: Body): Self = StObject.set(x, "internalRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefsUndefined: Self = StObject.set(x, "internalRefs", js.undefined)
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHeaderRowUndefined: Self = StObject.set(x, "onHeaderRow", js.undefined)
      
      @scala.inline
      def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setRowKey(value: String | GetRowKey[RecordType]): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setScroll(value: X): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "summary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      @scala.inline
      def setTitle(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransformColumns(value: /* columns */ ColumnsType[RecordType] => ColumnsType[RecordType]): Self = StObject.set(x, "transformColumns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformColumnsUndefined: Self = StObject.set(x, "transformColumns", js.undefined)
    }
  }
}

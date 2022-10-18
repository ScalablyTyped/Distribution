package typings.rcTable

import typings.rcTable.libFooterCellMod.SummaryCellProps
import typings.rcTable.libFooterRowMod.FooterRowProps
import typings.rcTable.libFooterSummaryMod.SummaryProps
import typings.rcTable.libInterfaceMod.DefaultRecordType
import typings.rcTable.libSugarColumnGroupMod.ColumnGroupProps
import typings.rcTable.libSugarColumnMod.ColumnProps
import typings.rcTable.libTableMod.TableProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table", JSImport.Default)
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
      
      @JSImport("rc-table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      /* was `typeof imported_Cell.default` */
      inline def Cell(hasClassNameIndexChildrenColSpanRowSpanAlign: SummaryCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasClassNameIndexChildrenColSpanRowSpanAlign.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      /* was `typeof imported_Row.default` */
      inline def Row(hasChildrenProps: FooterRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    }
    
    object defaultProps {
      
      @JSImport("rc-table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def emptyText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyText")().asInstanceOf[String]
      
      @JSImport("rc-table", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      inline def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  inline def Column[RecordType](_underscore: ColumnProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  inline def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ColumnGroup")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("rc-table", "INTERNAL_COL_DEFINE")
  @js.native
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  
  object Summary {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    inline def apply(hasChildren: SummaryProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-table", "Summary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table", "Summary.Cell")
    @js.native
    def Cell: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any = js.native
    inline def Cell_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Cell.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table", "Summary.Row")
    @js.native
    def Row: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any = js.native
    inline def Row_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_Row.default */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
}

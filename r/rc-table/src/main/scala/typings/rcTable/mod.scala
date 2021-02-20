package typings.rcTable

import typings.rcTable.columnGroupMod.ColumnGroupProps
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.rowMod.FooterRowProps
import typings.rcTable.tableMod.TableProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rc-table", JSImport.Default)
    @js.native
    def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): Element = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    @JSImport("rc-table", "default.Column")
    @js.native
    def Column[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    @JSImport("rc-table", "default.ColumnGroup")
    @js.native
    def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
    
    object Summary {
      
      @JSImport("rc-table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table", "default.Summary.Cell")
      @js.native
      def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
      @scala.inline
      def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table", "default.Summary.Row")
      @js.native
      def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
      @scala.inline
      def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("rc-table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-table", "default.defaultProps.emptyText")
      @js.native
      def emptyText(): String = js.native
      
      @JSImport("rc-table", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      @scala.inline
      def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @JSImport("rc-table", "Column")
  @js.native
  def Column[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @JSImport("rc-table", "ColumnGroup")
  @js.native
  def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
  
  @JSImport("rc-table", "INTERNAL_COL_DEFINE")
  @js.native
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  
  object Summary {
    
    @JSImport("rc-table", "Summary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table", "Summary.Cell")
    @js.native
    def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
    @scala.inline
    def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table", "Summary.Row")
    @js.native
    def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
    @scala.inline
    def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
}

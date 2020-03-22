package typings.rcTable

import typings.rcTable.columnGroupMod.ColumnGroupProps
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.rcTableStrings.RC_TABLE_INTERNAL_COL_DEFINE
import typings.rcTable.tableMod.TableProps
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val INTERNAL_COL_DEFINE: RC_TABLE_INTERNAL_COL_DEFINE = js.native
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  def Column[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
  @js.native
  object default extends js.Object {
    def apply[RecordType /* <: DefaultRecordType */](props: TableProps[RecordType]): Element = js.native
    @js.native
    object Column extends js.Object {
      def apply[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
    }
    
    @js.native
    object ColumnGroup extends js.Object {
      def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): js.Any = js.native
    }
    
    @js.native
    object defaultProps extends js.Object {
      var prefixCls: String = js.native
      var rowKey: String = js.native
      def emptyText(): String = js.native
    }
    
  }
  
}


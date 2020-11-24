package typings.rcTable.tableMod

import typings.rcTable.columnGroupMod.ColumnGroupProps
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.interfaceMod.DefaultRecordType
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/Table", JSImport.Default)
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
  object Summary extends js.Object {
    
    var Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
    
    var Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    def emptyText(): String = js.native
    
    var prefixCls: String = js.native
    
    var rowKey: String = js.native
  }
}

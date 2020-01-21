package typings.rcTable

import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.rcTableStrings.RC_TABLE_INTERNAL_COL_DEFINE
import typings.rcTable.tableMod.TableProps
import typings.rcTable.tableMod.TableState
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ColumnGroup ()
    extends typings.rcTable.columnGroupMod.default
  
  @js.native
  class default[ValueType] protected ()
    extends typings.rcTable.tableMod.default[ValueType] {
    def this(props: TableProps[ValueType]) = this()
  }
  
  val Column: FC[ColumnProps] = js.native
  val INTERNAL_COL_DEFINE: RC_TABLE_INTERNAL_COL_DEFINE = js.native
  /* static members */
  @js.native
  object ColumnGroup extends js.Object {
    var isTableColumnGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Column: FC[ColumnProps] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var childContextTypes: AnonComponents = js.native
    var defaultProps: AnonBodyStyle = js.native
    def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): AnonChildren | AnonChildrenColumns = js.native
  }
  
}


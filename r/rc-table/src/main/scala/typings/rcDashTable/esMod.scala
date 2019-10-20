package typings.rcDashTable

import typings.rcDashTable.esColumnMod.ColumnProps
import typings.rcDashTable.esInterfaceMod.ColumnType
import typings.rcDashTable.esInterfaceMod.DefaultValueType
import typings.rcDashTable.esTableMod.TableProps
import typings.rcDashTable.esTableMod.TableState
import typings.rcDashTable.rcDashTableStrings.RC_TABLE_INTERNAL_COL_DEFINE
import typings.react.reactMod.FC
import typings.react.reactMod.FunctionComponent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class ColumnGroup ()
    extends typings.rcDashTable.esColumnGroupMod.default
  
  @js.native
  class default[ValueType] protected ()
    extends typings.rcDashTable.esTableMod.default[ValueType] {
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
    var Column: FunctionComponent[ColumnType[Record[String, _]]] = js.native
    var ColumnGroup: TypeofClassColumnGroup = js.native
    var childContextTypes: Anon_Components = js.native
    var defaultProps: Anon_BodyStyle = js.native
    def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): Anon_Children | Anon_ChildrenColumns = js.native
  }
  
}


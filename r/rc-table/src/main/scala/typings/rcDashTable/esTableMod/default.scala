package typings.rcDashTable.esTableMod

import typings.rcDashTable.Anon_BodyStyle
import typings.rcDashTable.Anon_Children
import typings.rcDashTable.Anon_ChildrenColumns
import typings.rcDashTable.Anon_Components
import typings.rcDashTable.TypeofClassColumnGroup
import typings.rcDashTable.esInterfaceMod.ColumnType
import typings.rcDashTable.esInterfaceMod.DefaultValueType
import typings.react.reactMod.FunctionComponent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/es/Table", JSImport.Default)
@js.native
class default[ValueType] protected () extends Table[ValueType] {
  def this(props: TableProps[ValueType]) = this()
}

/* static members */
@JSImport("rc-table/es/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var Column: FunctionComponent[ColumnType[Record[String, _]]] = js.native
  var ColumnGroup: TypeofClassColumnGroup = js.native
  var childContextTypes: Anon_Components = js.native
  var defaultProps: Anon_BodyStyle = js.native
  def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): Anon_Children | Anon_ChildrenColumns = js.native
}


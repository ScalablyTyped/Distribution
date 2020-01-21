package typings.rcTable.tableMod

import typings.rcTable.AnonBodyStyle
import typings.rcTable.AnonChildren
import typings.rcTable.AnonChildrenColumns
import typings.rcTable.AnonComponents
import typings.rcTable.TypeofClassColumnGroup
import typings.rcTable.columnMod.ColumnProps
import typings.rcTable.interfaceMod.DefaultValueType
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Table", JSImport.Default)
@js.native
class default[ValueType] protected () extends Table[ValueType] {
  def this(props: TableProps[ValueType]) = this()
}

/* static members */
@JSImport("rc-table/lib/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var Column: FC[ColumnProps] = js.native
  var ColumnGroup: TypeofClassColumnGroup = js.native
  var childContextTypes: AnonComponents = js.native
  var defaultProps: AnonBodyStyle = js.native
  def getDerivedStateFromProps(nextProps: TableProps[DefaultValueType], prevState: TableState): AnonChildren | AnonChildrenColumns = js.native
}


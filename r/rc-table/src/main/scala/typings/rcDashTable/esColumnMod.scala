package typings.rcDashTable

import typings.rcDashTable.esColumnMod.ColumnProps
import typings.rcDashTable.esInterfaceMod.ColumnType
import typings.rcDashTable.esInterfaceMod.DefaultValueType
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/es/Column", JSImport.Namespace)
@js.native
object esColumnMod extends js.Object {
  val default: FC[ColumnProps] = js.native
  type ColumnProps = ColumnType[DefaultValueType]
}


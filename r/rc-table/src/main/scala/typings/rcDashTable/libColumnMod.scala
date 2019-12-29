package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Column", JSImport.Namespace)
@js.native
object libColumnMod extends js.Object {
  val default: FC[ColumnProps] = js.native
  type ColumnProps = ColumnType[DefaultValueType]
}


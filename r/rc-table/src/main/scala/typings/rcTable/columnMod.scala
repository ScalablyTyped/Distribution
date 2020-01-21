package typings.rcTable

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/Column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  val default: FC[ColumnProps] = js.native
  type ColumnProps = ColumnType[DefaultValueType]
}


package typings.sortDashArray.sortDashArrayMod

import typings.sortDashArray.CustomOrder
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sort-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(recordset: js.Array[js.Object], columnNames: String | js.Array[String]): js.Array[js.Object] = js.native
  def apply(
    recordset: js.Array[js.Object],
    columnNames: String | js.Array[String],
    customOrder: Record[String, js.Array[_]]
  ): js.Array[js.Object] = js.native
  def apply[T](recordset: js.Array[T], columnNames: ColumnNames[T], customOrder: Partial[CustomOrder[T]]): js.Array[T] = js.native
}


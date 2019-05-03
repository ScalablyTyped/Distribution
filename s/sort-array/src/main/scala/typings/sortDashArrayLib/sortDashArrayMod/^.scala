package typings
package sortDashArrayLib.sortDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sort-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(recordset: js.Array[js.Object], columnNames: java.lang.String | js.Array[java.lang.String]): js.Array[js.Object] = js.native
  def apply(
    recordset: js.Array[js.Object],
    columnNames: java.lang.String | js.Array[java.lang.String],
    customOrder: stdLib.Record[java.lang.String, js.Array[_]]
  ): js.Array[js.Object] = js.native
  def apply[T](
    recordset: js.Array[T],
    columnNames: ColumnNames[T],
    customOrder: stdLib.Partial[sortDashArrayLib.CustomOrder[T]]
  ): js.Array[T] = js.native
}


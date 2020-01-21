package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-table", "defaultGroupByFn")
@js.native
object defaultGroupByFn extends js.Object {
  def apply[D /* <: js.Object */](rows: js.Array[Row[D]], columnId: IdType[D]): Record[String, Row[D]] = js.native
}


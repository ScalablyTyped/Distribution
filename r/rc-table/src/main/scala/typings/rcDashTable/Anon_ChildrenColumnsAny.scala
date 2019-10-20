package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenColumnsAny extends js.Object {
  var children: js.Any
  var columns: js.Array[ColumnType[Record[String, _]]]
}

object Anon_ChildrenColumnsAny {
  @scala.inline
  def apply(children: js.Any, columns: js.Array[ColumnType[Record[String, _]]]): Anon_ChildrenColumnsAny = {
    val __obj = js.Dynamic.literal(children = children, columns = columns)
  
    __obj.asInstanceOf[Anon_ChildrenColumnsAny]
  }
}


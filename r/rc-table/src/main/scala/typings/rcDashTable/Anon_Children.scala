package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Any
  var columns: js.Array[ColumnType[Record[String, _]]]
}

object Anon_Children {
  @scala.inline
  def apply(children: js.Any, columns: js.Array[ColumnType[Record[String, _]]]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}


package typings.rcTable

import typings.rcTable.interfaceMod.ColumnType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Any
  var columns: js.Array[ColumnType[Record[String, _]]]
}

object AnonChildren {
  @scala.inline
  def apply(children: js.Any, columns: js.Array[ColumnType[Record[String, _]]]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}


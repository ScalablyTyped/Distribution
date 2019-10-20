package typings.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Table[ValueType] extends js.Object {
  var table: Anon_ColumnManager[ValueType]
}

object Anon_Table {
  @scala.inline
  def apply[ValueType](table: Anon_ColumnManager[ValueType]): Anon_Table[ValueType] = {
    val __obj = js.Dynamic.literal(table = table)
  
    __obj.asInstanceOf[Anon_Table[ValueType]]
  }
}


package typings.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TableAnonColumnManager[ValueType] extends js.Object {
  var table: Anon_ColumnManager[ValueType]
}

object Anon_TableAnonColumnManager {
  @scala.inline
  def apply[ValueType](table: Anon_ColumnManager[ValueType]): Anon_TableAnonColumnManager[ValueType] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TableAnonColumnManager[ValueType]]
  }
}


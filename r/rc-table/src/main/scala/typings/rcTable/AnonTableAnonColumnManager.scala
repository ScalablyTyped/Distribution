package typings.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTableAnonColumnManager[ValueType] extends js.Object {
  var table: AnonColumnManager[ValueType]
}

object AnonTableAnonColumnManager {
  @scala.inline
  def apply[ValueType](table: AnonColumnManager[ValueType]): AnonTableAnonColumnManager[ValueType] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTableAnonColumnManager[ValueType]]
  }
}


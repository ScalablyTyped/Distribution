package typings.reactTable

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetSelectedRows[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: Boolean
  var manualRowSelectedKey: IdType[D]
}

object AnonAutoResetSelectedRows {
  @scala.inline
  def apply[D /* <: js.Object */](autoResetSelectedRows: Boolean, manualRowSelectedKey: IdType[D]): AnonAutoResetSelectedRows[D] = {
    val __obj = js.Dynamic.literal(autoResetSelectedRows = autoResetSelectedRows.asInstanceOf[js.Any], manualRowSelectedKey = manualRowSelectedKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoResetSelectedRows[D]]
  }
}


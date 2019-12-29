package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetSelectedRows[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: Boolean
  var manualRowSelectedKey: IdType[D]
}

object Anon_AutoResetSelectedRows {
  @scala.inline
  def apply[D /* <: js.Object */](autoResetSelectedRows: Boolean, manualRowSelectedKey: IdType[D]): Anon_AutoResetSelectedRows[D] = {
    val __obj = js.Dynamic.literal(autoResetSelectedRows = autoResetSelectedRows.asInstanceOf[js.Any], manualRowSelectedKey = manualRowSelectedKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoResetSelectedRows[D]]
  }
}


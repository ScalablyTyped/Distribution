package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: reactLib.reactMod.ReactNs.ReactElement[_]
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: reactLib.reactMod.ReactNs.ReactElement[_]
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: reactLib.reactMod.ReactNs.ReactElement[_]
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: reactLib.reactMod.ReactNs.ReactElement[_]
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: reactLib.reactMod.ReactNs.ReactElement[_],
    exportCSVBtn: reactLib.reactMod.ReactNs.ReactElement[_],
    insertBtn: reactLib.reactMod.ReactNs.ReactElement[_],
    showSelectedOnlyBtn: reactLib.reactMod.ReactNs.ReactElement[_]
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn, exportCSVBtn = exportCSVBtn, insertBtn = insertBtn, showSelectedOnlyBtn = showSelectedOnlyBtn)
  
    __obj.asInstanceOf[ButtonGroupProps]
  }
}


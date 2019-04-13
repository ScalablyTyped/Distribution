package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: reactLib.reactMod.ReactElement[_]
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: reactLib.reactMod.ReactElement[_]
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: reactLib.reactMod.ReactElement[_]
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: reactLib.reactMod.ReactElement[_]
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: reactLib.reactMod.ReactElement[_],
    exportCSVBtn: reactLib.reactMod.ReactElement[_],
    insertBtn: reactLib.reactMod.ReactElement[_],
    showSelectedOnlyBtn: reactLib.reactMod.ReactElement[_]
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn, exportCSVBtn = exportCSVBtn, insertBtn = insertBtn, showSelectedOnlyBtn = showSelectedOnlyBtn)
  
    __obj.asInstanceOf[ButtonGroupProps]
  }
}


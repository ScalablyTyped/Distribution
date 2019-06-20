package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: reactLib.reactMod.ReactElement
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: reactLib.reactMod.ReactElement
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: reactLib.reactMod.ReactElement
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: reactLib.reactMod.ReactElement
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: reactLib.reactMod.ReactElement,
    exportCSVBtn: reactLib.reactMod.ReactElement,
    insertBtn: reactLib.reactMod.ReactElement,
    showSelectedOnlyBtn: reactLib.reactMod.ReactElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn, exportCSVBtn = exportCSVBtn, insertBtn = insertBtn, showSelectedOnlyBtn = showSelectedOnlyBtn)
  
    __obj.asInstanceOf[ButtonGroupProps]
  }
}


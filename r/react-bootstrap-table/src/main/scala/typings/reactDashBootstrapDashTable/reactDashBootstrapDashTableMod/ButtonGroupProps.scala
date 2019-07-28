package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /**
  	 * Delete button.
  	 */
  var deleteBtn: ReactElement
  /**
  	 * Export to CSV button.
  	 */
  var exportCSVBtn: ReactElement
  /**
  	 * Insert button (to add a row).
  	 */
  var insertBtn: ReactElement
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: ReactElement
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn, exportCSVBtn = exportCSVBtn, insertBtn = insertBtn, showSelectedOnlyBtn = showSelectedOnlyBtn)
  
    __obj.asInstanceOf[ButtonGroupProps]
  }
}


package typings.reactBootstrapTable

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel  :react.react.ReactElement,   btnGroup  :react.react.ReactElement,   searchField  :react.react.ReactElement,   clearBtn  :react.react.ReactElement} */
trait ButtonGroupPropssearchPan extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: ReactElement
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: ReactElement
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
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: ReactElement
  /**
  		 * Search panel component.
  		 */
  var searchPanel: ReactElement
  /**
  	 * Toggle button to switch between showing all rows and showing selected rows only.
  	 */
  var showSelectedOnlyBtn: ReactElement
}

object ButtonGroupPropssearchPan {
  @scala.inline
  def apply(
    btnGroup: ReactElement,
    clearBtn: ReactElement,
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    searchField: ReactElement,
    searchPanel: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupPropssearchPan = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup.asInstanceOf[js.Any], clearBtn = clearBtn.asInstanceOf[js.Any], deleteBtn = deleteBtn.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.asInstanceOf[js.Any], insertBtn = insertBtn.asInstanceOf[js.Any], searchField = searchField.asInstanceOf[js.Any], searchPanel = searchPanel.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupPropssearchPan]
  }
}


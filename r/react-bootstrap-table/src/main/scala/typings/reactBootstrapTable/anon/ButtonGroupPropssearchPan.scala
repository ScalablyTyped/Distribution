package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel :react.react.ReactElement,   btnGroup :react.react.ReactElement,   searchField :react.react.ReactElement,   clearBtn :react.react.ReactElement} */
@js.native
trait ButtonGroupPropssearchPan extends js.Object {
  /**
    * Button group components.
    */
  var btnGroup: ReactElement = js.native
   // search field JSX
  /**
    * The button to clear the search field.
    */
  var clearBtn: ReactElement = js.native
  /**
    * Delete button.
    */
  var deleteBtn: ReactElement = js.native
  /**
    * Export to CSV button.
    */
  var exportCSVBtn: ReactElement = js.native
  /**
    * Insert button (to add a row).
    */
  var insertBtn: ReactElement = js.native
   // button groups JSX
  /**
    * The individual search field.
    */
  var searchField: ReactElement = js.native
  /**
    * Search panel component.
    */
  var searchPanel: ReactElement = js.native
  /**
    * Toggle button to switch between showing all rows and showing selected rows only.
    */
  var showSelectedOnlyBtn: ReactElement = js.native
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
  @scala.inline
  implicit class ButtonGroupPropssearchPanOps[Self <: ButtonGroupPropssearchPan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBtnGroup(value: ReactElement): Self = this.set("btnGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearBtn(value: ReactElement): Self = this.set("clearBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteBtn(value: ReactElement): Self = this.set("deleteBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportCSVBtn(value: ReactElement): Self = this.set("exportCSVBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertBtn(value: ReactElement): Self = this.set("insertBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchField(value: ReactElement): Self = this.set("searchField", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchPanel(value: ReactElement): Self = this.set("searchPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowSelectedOnlyBtn(value: ReactElement): Self = this.set("showSelectedOnlyBtn", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel :react.react.ReactElement,   btnGroup :react.react.ReactElement,   searchField :react.react.ReactElement,   clearBtn :react.react.ReactElement} */
@js.native
trait ButtonGroupPropssearchPan extends StObject {
  
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
  implicit class ButtonGroupPropssearchPanMutableBuilder[Self <: ButtonGroupPropssearchPan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBtnGroup(value: ReactElement): Self = StObject.set(x, "btnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBtn(value: ReactElement): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBtn(value: ReactElement): Self = StObject.set(x, "deleteBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCSVBtn(value: ReactElement): Self = StObject.set(x, "exportCSVBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBtn(value: ReactElement): Self = StObject.set(x, "insertBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchField(value: ReactElement): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPanel(value: ReactElement): Self = StObject.set(x, "searchPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelectedOnlyBtn(value: ReactElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.asInstanceOf[js.Any])
  }
}

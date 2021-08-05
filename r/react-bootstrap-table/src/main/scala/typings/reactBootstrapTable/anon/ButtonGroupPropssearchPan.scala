package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-bootstrap-table.react-bootstrap-table.ButtonGroupProps & {  searchPanel :react.react.ReactElement,   btnGroup :react.react.ReactElement,   searchField :react.react.ReactElement,   clearBtn :react.react.ReactElement} */
trait ButtonGroupPropssearchPan extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ButtonGroupPropssearchPan](x: Self) {
    
    inline def setBtnGroup(value: ReactElement): Self = StObject.set(x, "btnGroup", value.asInstanceOf[js.Any])
    
    inline def setClearBtn(value: ReactElement): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    inline def setDeleteBtn(value: ReactElement): Self = StObject.set(x, "deleteBtn", value.asInstanceOf[js.Any])
    
    inline def setExportCSVBtn(value: ReactElement): Self = StObject.set(x, "exportCSVBtn", value.asInstanceOf[js.Any])
    
    inline def setInsertBtn(value: ReactElement): Self = StObject.set(x, "insertBtn", value.asInstanceOf[js.Any])
    
    inline def setSearchField(value: ReactElement): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
    
    inline def setSearchPanel(value: ReactElement): Self = StObject.set(x, "searchPanel", value.asInstanceOf[js.Any])
    
    inline def setShowSelectedOnlyBtn(value: ReactElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.asInstanceOf[js.Any])
  }
}

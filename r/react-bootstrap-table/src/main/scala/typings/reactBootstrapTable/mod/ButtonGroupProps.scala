package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonGroupProps extends StObject {
  
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
  
  inline def apply(
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.asInstanceOf[js.Any], insertBtn = insertBtn.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    
    inline def setDeleteBtn(value: ReactElement): Self = StObject.set(x, "deleteBtn", value.asInstanceOf[js.Any])
    
    inline def setExportCSVBtn(value: ReactElement): Self = StObject.set(x, "exportCSVBtn", value.asInstanceOf[js.Any])
    
    inline def setInsertBtn(value: ReactElement): Self = StObject.set(x, "insertBtn", value.asInstanceOf[js.Any])
    
    inline def setShowSelectedOnlyBtn(value: ReactElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.asInstanceOf[js.Any])
  }
}

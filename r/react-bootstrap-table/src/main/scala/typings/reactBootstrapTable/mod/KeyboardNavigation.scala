package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardNavigation extends StObject {
  
  /**
    * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
    */
  var clickToNav: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return a style object which will be applied on the navigating cell.
    */
  var customStyle: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.undefined
  
  /**
    * Return a style object which will be applied on the both of navigating and editing cell.
    */
  var customStyleOnEditCell: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.undefined
  
  /**
    * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
    */
  var enterToEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, pressing ENTER will expand or collapse the current row.
    */
  var enterToExpand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, pressing ENTER will select or unselect the current row.
    */
  var enterToSelect: js.UndefOr[Boolean] = js.undefined
}
object KeyboardNavigation {
  
  @scala.inline
  def apply(): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigation]
  }
  
  @scala.inline
  implicit class KeyboardNavigationMutableBuilder[Self <: KeyboardNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickToNav(value: Boolean): Self = StObject.set(x, "clickToNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToNavUndefined: Self = StObject.set(x, "clickToNav", js.undefined)
    
    @scala.inline
    def setCustomStyle(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = StObject.set(x, "customStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomStyleOnEditCell(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = StObject.set(x, "customStyleOnEditCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomStyleOnEditCellUndefined: Self = StObject.set(x, "customStyleOnEditCell", js.undefined)
    
    @scala.inline
    def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
    
    @scala.inline
    def setEnterToEdit(value: Boolean): Self = StObject.set(x, "enterToEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterToEditUndefined: Self = StObject.set(x, "enterToEdit", js.undefined)
    
    @scala.inline
    def setEnterToExpand(value: Boolean): Self = StObject.set(x, "enterToExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterToExpandUndefined: Self = StObject.set(x, "enterToExpand", js.undefined)
    
    @scala.inline
    def setEnterToSelect(value: Boolean): Self = StObject.set(x, "enterToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterToSelectUndefined: Self = StObject.set(x, "enterToSelect", js.undefined)
  }
}

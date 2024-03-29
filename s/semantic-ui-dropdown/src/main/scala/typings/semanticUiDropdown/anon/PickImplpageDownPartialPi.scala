package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings.Param
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageDown'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl>> */
trait PickImplpageDownPartialPi
  extends StObject
     with Param {
  
  var backspace: js.UndefOr[Double] = js.undefined
  
  var deleteKey: js.UndefOr[Double] = js.undefined
  
  var delimiter: js.UndefOr[Double | `false`] = js.undefined
  
  var downArrow: js.UndefOr[Double] = js.undefined
  
  var enter: js.UndefOr[Double] = js.undefined
  
  var escape: js.UndefOr[Double] = js.undefined
  
  var leftArrow: js.UndefOr[Double] = js.undefined
  
  var pageDown: Double
  
  var pageUp: js.UndefOr[Double] = js.undefined
  
  var rightArrow: js.UndefOr[Double] = js.undefined
  
  var upArrow: js.UndefOr[Double] = js.undefined
}
object PickImplpageDownPartialPi {
  
  inline def apply(pageDown: Double): PickImplpageDownPartialPi = {
    val __obj = js.Dynamic.literal(pageDown = pageDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDownPartialPi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplpageDownPartialPi] (val x: Self) extends AnyVal {
    
    inline def setBackspace(value: Double): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
    
    inline def setBackspaceUndefined: Self = StObject.set(x, "backspace", js.undefined)
    
    inline def setDeleteKey(value: Double): Self = StObject.set(x, "deleteKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteKeyUndefined: Self = StObject.set(x, "deleteKey", js.undefined)
    
    inline def setDelimiter(value: Double | `false`): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDownArrow(value: Double): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
    
    inline def setDownArrowUndefined: Self = StObject.set(x, "downArrow", js.undefined)
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setEscape(value: Double): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setLeftArrow(value: Double): Self = StObject.set(x, "leftArrow", value.asInstanceOf[js.Any])
    
    inline def setLeftArrowUndefined: Self = StObject.set(x, "leftArrow", js.undefined)
    
    inline def setPageDown(value: Double): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
    
    inline def setPageUp(value: Double): Self = StObject.set(x, "pageUp", value.asInstanceOf[js.Any])
    
    inline def setPageUpUndefined: Self = StObject.set(x, "pageUp", js.undefined)
    
    inline def setRightArrow(value: Double): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
    
    inline def setRightArrowUndefined: Self = StObject.set(x, "rightArrow", js.undefined)
    
    inline def setUpArrow(value: Double): Self = StObject.set(x, "upArrow", value.asInstanceOf[js.Any])
    
    inline def setUpArrowUndefined: Self = StObject.set(x, "upArrow", js.undefined)
  }
}

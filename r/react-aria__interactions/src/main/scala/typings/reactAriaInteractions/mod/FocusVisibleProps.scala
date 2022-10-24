package typings.reactAriaInteractions.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisibleProps extends StObject {
  
  /** Whether the element will be auto focused. */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the element is a text input. */
  var isTextInput: js.UndefOr[Boolean] = js.undefined
}
object FocusVisibleProps {
  
  inline def apply(): FocusVisibleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusVisibleProps]
  }
  
  extension [Self <: FocusVisibleProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setIsTextInput(value: Boolean): Self = StObject.set(x, "isTextInput", value.asInstanceOf[js.Any])
    
    inline def setIsTextInputUndefined: Self = StObject.set(x, "isTextInput", js.undefined)
  }
}

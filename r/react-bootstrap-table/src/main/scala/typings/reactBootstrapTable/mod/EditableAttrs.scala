package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditableAttrs extends StObject {
  
  /**
    * Callback for on cell blur.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback for onKeyDown.
    */
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Placeholder text to use for the cell editor field.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Function to pass a reference to the input editor field.
    */
  var ref: js.UndefOr[js.Function1[/* ref */ js.Any, js.Any]] = js.undefined
}
object EditableAttrs {
  
  inline def apply(): EditableAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableAttrs]
  }
  
  extension [Self <: EditableAttrs](x: Self) {
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnKeyDown(value: () => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction0(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRef(value: /* ref */ js.Any => js.Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

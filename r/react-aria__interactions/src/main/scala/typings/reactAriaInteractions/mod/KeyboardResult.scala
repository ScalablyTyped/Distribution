package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardResult extends StObject {
  
  /** Props to spread onto the target element. */
  var keyboardProps: DOMAttributes[FocusableElement]
}
object KeyboardResult {
  
  inline def apply(keyboardProps: DOMAttributes[FocusableElement]): KeyboardResult = {
    val __obj = js.Dynamic.literal(keyboardProps = keyboardProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardResult]
  }
  
  extension [Self <: KeyboardResult](x: Self) {
    
    inline def setKeyboardProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "keyboardProps", value.asInstanceOf[js.Any])
  }
}

package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusWithinResult extends StObject {
  
  /** Props to spread onto the target element. */
  var focusWithinProps: DOMAttributes[FocusableElement]
}
object FocusWithinResult {
  
  inline def apply(focusWithinProps: DOMAttributes[FocusableElement]): FocusWithinResult = {
    val __obj = js.Dynamic.literal(focusWithinProps = focusWithinProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusWithinResult]
  }
  
  extension [Self <: FocusWithinResult](x: Self) {
    
    inline def setFocusWithinProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "focusWithinProps", value.asInstanceOf[js.Any])
  }
}

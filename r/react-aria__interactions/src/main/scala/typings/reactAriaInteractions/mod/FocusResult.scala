package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusResult extends StObject {
  
  /** Props to spread onto the target element. */
  var focusProps: DOMAttributes[FocusableElement]
}
object FocusResult {
  
  inline def apply(focusProps: DOMAttributes[FocusableElement]): FocusResult = {
    val __obj = js.Dynamic.literal(focusProps = focusProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusResult]
  }
  
  extension [Self <: FocusResult](x: Self) {
    
    inline def setFocusProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "focusProps", value.asInstanceOf[js.Any])
  }
}

package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressResult extends StObject {
  
  /** Whether the target is currently pressed. */
  var isPressed: Boolean
  
  /** Props to spread on the target element. */
  var pressProps: DOMAttributes[FocusableElement]
}
object PressResult {
  
  inline def apply(isPressed: Boolean, pressProps: DOMAttributes[FocusableElement]): PressResult = {
    val __obj = js.Dynamic.literal(isPressed = isPressed.asInstanceOf[js.Any], pressProps = pressProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressResult]
  }
  
  extension [Self <: PressResult](x: Self) {
    
    inline def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
    
    inline def setPressProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "pressProps", value.asInstanceOf[js.Any])
  }
}

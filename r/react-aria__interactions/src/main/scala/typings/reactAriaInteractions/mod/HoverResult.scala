package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverResult extends StObject {
  
  /** Props to spread on the target element. */
  var hoverProps: DOMAttributes[FocusableElement]
  
  var isHovered: Boolean
}
object HoverResult {
  
  inline def apply(hoverProps: DOMAttributes[FocusableElement], isHovered: Boolean): HoverResult = {
    val __obj = js.Dynamic.literal(hoverProps = hoverProps.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverResult]
  }
  
  extension [Self <: HoverResult](x: Self) {
    
    inline def setHoverProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "hoverProps", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}

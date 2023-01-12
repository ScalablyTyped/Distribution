package typings.storybookComponents.anon

import typings.std.Element
import typings.std.HTMLElement
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.VirtualElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrow extends StObject {
  
  var arrow: js.UndefOr[HTMLElement] = js.undefined
  
  var popper: HTMLElement
  
  var reference: Element | VirtualElement
}
object Arrow {
  
  inline def apply(popper: HTMLElement, reference: Element | VirtualElement): Arrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrow] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: HTMLElement): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setPopper(value: HTMLElement): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Element | VirtualElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}

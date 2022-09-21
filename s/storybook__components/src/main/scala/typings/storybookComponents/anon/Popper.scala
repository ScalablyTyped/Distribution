package typings.storybookComponents.anon

import typings.std.Element
import typings.storybookComponents.popperjsCoreLibTypesMod.VisualViewport
import typings.storybookComponents.popperjsCoreLibTypesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var popper: js.Array[Element | Window | VisualViewport]
  
  var reference: js.Array[Element | Window | VisualViewport]
}
object Popper {
  
  inline def apply(
    popper: js.Array[Element | Window | VisualViewport],
    reference: js.Array[Element | Window | VisualViewport]
  ): Popper = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  extension [Self <: Popper](x: Self) {
    
    inline def setPopper(value: js.Array[Element | Window | VisualViewport]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperVarargs(value: (Element | Window | VisualViewport)*): Self = StObject.set(x, "popper", js.Array(value*))
    
    inline def setReference(value: js.Array[Element | Window | VisualViewport]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarargs(value: (Element | Window | VisualViewport)*): Self = StObject.set(x, "reference", js.Array(value*))
  }
}

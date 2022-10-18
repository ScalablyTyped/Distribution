package typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`

import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualElement extends StObject {
  
  var contextElement: js.UndefOr[Element] = js.undefined
  
  def getBoundingClientRect(): ClientRect | DOMRect
}
object VirtualElement {
  
  inline def apply(getBoundingClientRect: () => ClientRect | DOMRect): VirtualElement = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[VirtualElement]
  }
  
  extension [Self <: VirtualElement](x: Self) {
    
    inline def setContextElement(value: Element): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
    
    inline def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
    
    inline def setGetBoundingClientRect(value: () => ClientRect | DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
  }
}

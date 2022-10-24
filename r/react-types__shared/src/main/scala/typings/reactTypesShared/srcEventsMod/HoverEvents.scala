package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverEvents extends StObject {
  
  /** Handler that is called when the hover state changes. */
  var onHoverChange: js.UndefOr[js.Function1[/* isHovering */ Boolean, Unit]] = js.undefined
  
  /** Handler that is called when a hover interaction ends. */
  var onHoverEnd: js.UndefOr[js.Function1[/* e */ HoverEvent, Unit]] = js.undefined
  
  /** Handler that is called when a hover interaction starts. */
  var onHoverStart: js.UndefOr[js.Function1[/* e */ HoverEvent, Unit]] = js.undefined
}
object HoverEvents {
  
  inline def apply(): HoverEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverEvents]
  }
  
  extension [Self <: HoverEvents](x: Self) {
    
    inline def setOnHoverChange(value: /* isHovering */ Boolean => Unit): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction1(value))
    
    inline def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
    
    inline def setOnHoverEnd(value: /* e */ HoverEvent => Unit): Self = StObject.set(x, "onHoverEnd", js.Any.fromFunction1(value))
    
    inline def setOnHoverEndUndefined: Self = StObject.set(x, "onHoverEnd", js.undefined)
    
    inline def setOnHoverStart(value: /* e */ HoverEvent => Unit): Self = StObject.set(x, "onHoverStart", js.Any.fromFunction1(value))
    
    inline def setOnHoverStartUndefined: Self = StObject.set(x, "onHoverStart", js.undefined)
  }
}

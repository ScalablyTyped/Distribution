package typings.primereact

import typings.primereact.primereactStrings.`overlay-click`
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayserviceOverlayserviceMod {
  
  @JSImport("primereact/overlayservice/overlayservice", "OverlayService")
  @js.native
  val OverlayService: OverlayServiceOptions = js.native
  
  type OverlayServiceActionType = `overlay-click`
  
  @js.native
  trait OverlayServiceOptions extends StObject {
    
    def emit(action: OverlayServiceActionType): Unit = js.native
    def emit(action: OverlayServiceActionType, params: OverlayServiceParams): Unit = js.native
    
    def off(action: OverlayServiceActionType, fn: Any): Unit = js.native
    
    def on(action: OverlayServiceActionType, fn: Any): Unit = js.native
  }
  
  trait OverlayServiceParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    var target: HTMLElement
  }
  object OverlayServiceParams {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], target: HTMLElement): OverlayServiceParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayServiceParams]
    }
    
    extension [Self <: OverlayServiceParams](x: Self) {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}

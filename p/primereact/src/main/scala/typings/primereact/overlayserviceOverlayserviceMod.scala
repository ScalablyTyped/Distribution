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
  
  trait OverlayServiceEvent extends StObject {
    
    /**
      * Original event that triggered the overlay.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Target element that the overlay is bound to.
      */
    var target: HTMLElement
  }
  object OverlayServiceEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], target: HTMLElement): OverlayServiceEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayServiceEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayServiceEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverlayServiceOptions extends StObject {
    
    /**
      * Trigger overlay click event.
      * @param {string} action - Custom listener.
      * @param {*} params - Custom listener.
      */
    @JSName("emit")
    def emit_overlayclick(action: `overlay-click`): Unit = js.native
    @JSName("emit")
    def emit_overlayclick(action: `overlay-click`, params: OverlayServiceEvent): Unit = js.native
    
    /**
      * Remove event listener for overlay click.
      * @param {string} action - Custom listener.
      * @param {*} fn - Custom listener.
      */
    @JSName("off")
    def off_overlayclick(action: `overlay-click`, fn: Any): Unit = js.native
    
    /**
      * Add event listener for overlay click.
      * @param {string} action - Custom listener.
      * @param {*} fn - Custom listener.
      */
    @JSName("on")
    def on_overlayclick(action: `overlay-click`, fn: Any): Unit = js.native
  }
}

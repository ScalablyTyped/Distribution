package typings.stencilCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOptions extends StObject {
  
  /**
    * A Boolean indicating whether the event bubbles up through the DOM or not.
    */
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean indicating whether the event is cancelable.
    */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value indicating whether or not the event can bubble across the boundary between the shadow DOM and the regular DOM.
    */
  var composed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string custom event name to override the default.
    */
  var eventName: js.UndefOr[String] = js.undefined
}
object EventOptions {
  
  inline def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  
  extension [Self <: EventOptions](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
  }
}

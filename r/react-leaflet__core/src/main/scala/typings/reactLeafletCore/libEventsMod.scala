package typings.reactLeafletCore

import typings.leaflet.mod.Evented
import typings.leaflet.mod.LeafletEventHandlerFnMap
import typings.reactLeafletCore.libElementMod.LeafletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventsMod {
  
  @JSImport("@react-leaflet/core/lib/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEventHandlers(element: LeafletElement[Evented, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventHandlers")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEventHandlers(element: LeafletElement[Evented, Any], eventHandlers: LeafletEventHandlerFnMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventHandlers")(element.asInstanceOf[js.Any], eventHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EventedProps extends StObject {
    
    var eventHandlers: js.UndefOr[LeafletEventHandlerFnMap] = js.undefined
  }
  object EventedProps {
    
    inline def apply(): EventedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventedProps] (val x: Self) extends AnyVal {
      
      inline def setEventHandlers(value: LeafletEventHandlerFnMap): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    }
  }
}

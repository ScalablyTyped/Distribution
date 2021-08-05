package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/ScrollListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils/types/events/useScrollListener.Options<std.HTMLElement>, 'enabled'> */
  trait ScrollListenerProps extends StObject {
    
    var element: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var onScroll: EventListener
    
    var options: js.UndefOr[AddEventListenerOptions | Boolean] = js.undefined
  }
  object ScrollListenerProps {
    
    inline def apply(onScroll: /* evt */ Event => Unit): ScrollListenerProps = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
      __obj.asInstanceOf[ScrollListenerProps]
    }
    
    extension [Self <: ScrollListenerProps](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setOnScroll(value: /* evt */ Event => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOptions(value: AddEventListenerOptions | Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}

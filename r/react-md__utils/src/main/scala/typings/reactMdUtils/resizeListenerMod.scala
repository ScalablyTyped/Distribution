package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeListenerMod {
  
  @JSImport("@react-md/utils/types/sizing/ResizeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResizeListener(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizeListener")(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils/types/sizing/useResizeListener.ResizeListenerOptions, 'enabled'> */
  trait ResizeListenerProps extends StObject {
    
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    var onResize: EventListener
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
  }
  object ResizeListenerProps {
    
    inline def apply(onResize: /* evt */ Event => Unit): ResizeListenerProps = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[ResizeListenerProps]
    }
    
    extension [Self <: ResizeListenerProps](x: Self) {
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setOnResize(value: /* evt */ Event => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}

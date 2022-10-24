package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsUseScrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/useScrollListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScrollListener(param0: ScrollListenerHookOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ScrollListenerHookOptions
    extends StObject
       with AddEventListenerOptions {
    
    /** @defaultValue `true` */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event handler that will be fired when the page scrolls or if any child
      * element scrolls when the {@link capture} option is `true`.
      */
    var onScroll: EventListener
  }
  object ScrollListenerHookOptions {
    
    inline def apply(onScroll: /* evt */ Event => Unit): ScrollListenerHookOptions = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
      __obj.asInstanceOf[ScrollListenerHookOptions]
    }
    
    extension [Self <: ScrollListenerHookOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnScroll(value: /* evt */ Event => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    }
  }
}

package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeListenerMod {
  
  object ResizeListener {
    
    inline def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].apply(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("@react-md/utils/types/sizing/ResizeListener", "ResizeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing/ResizeListener", "ResizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing/ResizeListener", "ResizeListener.propTypes.immediate")
      @js.native
      def immediate: js.Any = js.native
      inline def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeListener", "ResizeListener.propTypes.onResize")
      @js.native
      def onResize: js.Any = js.native
      inline def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeListener", "ResizeListener.propTypes.options")
      @js.native
      def options: js.Any = js.native
      inline def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
  }
  
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

package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/useScrollListener", "useScrollListener")
  @js.native
  def useScrollListener[E /* <: HTMLElement */](hasEnabledOnScrollElementOptions: Options[E]): Unit = js.native
  
  @js.native
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The element that should gain the focus event. When this is omitted, it will
      * default to the entire `window`.
      */
    var element: js.UndefOr[E | Null] = js.native
    
    /**
      * Boolean if the scroll listener should be enabled. You can swap this boolean
      * to `true` or `false` to add/remove the event listeners. The event listeners
      * will *always* be removed when the parent component is unmounted though.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that is called whenever the scroll event is triggered.
      */
    var onScroll: EventListener = js.native
    
    /**
      * Any event listener options to use when attaching the event.
      */
    var options: js.UndefOr[AddEventListenerOptions | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](onScroll: /* evt */ Event => Unit): Options[E] = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
      __obj.asInstanceOf[Options[E]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
      
      @scala.inline
      def setElement(value: E): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* evt */ Event => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: AddEventListenerOptions | Boolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}

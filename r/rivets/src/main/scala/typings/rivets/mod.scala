package typings.rivets

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.rivets.anon.Handler
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Rivets extends Shortcut {
    
    @JSImport("rivets", "Rivets")
    @js.native
    val ^ : typings.rivets.mod.Rivets.Rivets = js.native
    @js.native
    trait Rivets extends StObject {
      
      // Global sightglass adapters.
      var adapters: js.Object = js.native
      
      def bind(element: js.Array[HTMLElement], models: js.Object): View = js.native
      def bind(element: js.Array[HTMLElement], models: js.Object, options: js.Object): View = js.native
      def bind(element: JQuery[HTMLElement], models: js.Object): View = js.native
      def bind(element: JQuery[HTMLElement], models: js.Object, options: js.Object): View = js.native
      def bind(element: HTMLElement, models: js.Object): View = js.native
      def bind(element: HTMLElement, models: js.Object, options: js.Object): View = js.native
      
      // Global binders.
      var binders: js.Object = js.native
      
      // Global components.
      var components: js.Object = js.native
      
      def configure(): Unit = js.native
      def configure(options: Handler): Unit = js.native
      
      // Global formatters.
      var formatters: js.Object = js.native
      
      def handler(context: Any, ev: Event, biding: Any): Unit = js.native
      
      // Default attribute prefix.
      var prefix: String = js.native
      
      // Preload data by default.
      var preloadData: Boolean = js.native
      
      // Default sightglass root interface.
      var rootInterface: String = js.native
      
      // Default template delimiters.
      var templateDelimiters: js.Array[String] = js.native
    }
    
    trait View extends StObject {
      
      def bind(): Unit
      
      def build(): Unit
      
      def unbind(): Unit
    }
    object View {
      
      inline def apply(bind: () => Unit, build: () => Unit, unbind: () => Unit): View = {
        val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), build = js.Any.fromFunction0(build), unbind = js.Any.fromFunction0(unbind))
        __obj.asInstanceOf[View]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
        
        inline def setBind(value: () => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction0(value))
        
        inline def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
        
        inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
      }
    }
    
    type _To = typings.rivets.mod.Rivets.Rivets
    
    /* This means you don't have to write `^`, but can instead just say `Rivets.foo` */
    override def _to: typings.rivets.mod.Rivets.Rivets = ^
  }
}

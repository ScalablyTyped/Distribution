package typings.rivets

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Handler extends StObject {
    
    // Augment the event handler of the on-* binder
    var handler: js.UndefOr[js.Function3[/* context */ js.Any, /* ev */ Event, /* biding */ js.Any, Unit]] = js.native
    
    // Attribute prefix in templates
    var prefix: js.UndefOr[String] = js.native
    
    // Preload templates with initial data on bind
    var preloadData: js.UndefOr[Boolean] = js.native
    
    // Root sightglass interface for keypaths
    var rootInterface: js.UndefOr[String] = js.native
    
    // Template delimiters for text bindings
    var templateDelimiters: js.UndefOr[js.Array[String]] = js.native
  }
  object Handler {
    
    @scala.inline
    def apply(): Handler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handler]
    }
    
    @scala.inline
    implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: (/* context */ js.Any, /* ev */ Event, /* biding */ js.Any) => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreloadData(value: Boolean): Self = StObject.set(x, "preloadData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadDataUndefined: Self = StObject.set(x, "preloadData", js.undefined)
      
      @scala.inline
      def setRootInterface(value: String): Self = StObject.set(x, "rootInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootInterfaceUndefined: Self = StObject.set(x, "rootInterface", js.undefined)
      
      @scala.inline
      def setTemplateDelimiters(value: js.Array[String]): Self = StObject.set(x, "templateDelimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateDelimitersUndefined: Self = StObject.set(x, "templateDelimiters", js.undefined)
      
      @scala.inline
      def setTemplateDelimitersVarargs(value: String*): Self = StObject.set(x, "templateDelimiters", js.Array(value :_*))
    }
  }
}

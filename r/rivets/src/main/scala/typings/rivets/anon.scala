package typings.rivets

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handler extends StObject {
    
    // Augment the event handler of the on-* binder
    var handler: js.UndefOr[js.Function3[/* context */ Any, /* ev */ Event, /* biding */ Any, Unit]] = js.undefined
    
    // Attribute prefix in templates
    var prefix: js.UndefOr[String] = js.undefined
    
    // Preload templates with initial data on bind
    var preloadData: js.UndefOr[Boolean] = js.undefined
    
    // Root sightglass interface for keypaths
    var rootInterface: js.UndefOr[String] = js.undefined
    
    // Template delimiters for text bindings
    var templateDelimiters: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Handler {
    
    inline def apply(): Handler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handler]
    }
    
    extension [Self <: Handler](x: Self) {
      
      inline def setHandler(value: (/* context */ Any, /* ev */ Event, /* biding */ Any) => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreloadData(value: Boolean): Self = StObject.set(x, "preloadData", value.asInstanceOf[js.Any])
      
      inline def setPreloadDataUndefined: Self = StObject.set(x, "preloadData", js.undefined)
      
      inline def setRootInterface(value: String): Self = StObject.set(x, "rootInterface", value.asInstanceOf[js.Any])
      
      inline def setRootInterfaceUndefined: Self = StObject.set(x, "rootInterface", js.undefined)
      
      inline def setTemplateDelimiters(value: js.Array[String]): Self = StObject.set(x, "templateDelimiters", value.asInstanceOf[js.Any])
      
      inline def setTemplateDelimitersUndefined: Self = StObject.set(x, "templateDelimiters", js.undefined)
      
      inline def setTemplateDelimitersVarargs(value: String*): Self = StObject.set(x, "templateDelimiters", js.Array(value*))
    }
  }
}

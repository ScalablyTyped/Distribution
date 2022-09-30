package typings.reactDndHtml5Backend

import typings.reactDndHtml5Backend.browserDetectorMod.global.Window
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type HTML5BackendContext = js.UndefOr[Window]
  
  trait HTML5BackendOptions extends StObject {
    
    /**
      * The root DOM node to use for subscribing to events. Default=Window
      */
    var rootElement: Node
  }
  object HTML5BackendOptions {
    
    inline def apply(rootElement: Node): HTML5BackendOptions = {
      val __obj = js.Dynamic.literal(rootElement = rootElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTML5BackendOptions]
    }
    
    extension [Self <: HTML5BackendOptions](x: Self) {
      
      inline def setRootElement(value: Node): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
    }
  }
}

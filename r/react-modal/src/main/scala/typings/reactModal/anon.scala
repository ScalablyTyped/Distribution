package typings.reactModal

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: Null | HTMLDivElement
    
    var overlay: Null | HTMLDivElement
  }
  object Content {
    
    inline def apply(): Content = {
      val __obj = js.Dynamic.literal(content = null, overlay = null)
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: HTMLDivElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setOverlay(value: HTMLDivElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
    }
  }
}

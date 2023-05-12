package typings.reactTooltip

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveAnchor extends StObject {
    
    var activeAnchor: HTMLElement | Null
    
    var content: String | Null
  }
  object ActiveAnchor {
    
    inline def apply(): ActiveAnchor = {
      val __obj = js.Dynamic.literal(activeAnchor = null, content = null)
      __obj.asInstanceOf[ActiveAnchor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveAnchor] (val x: Self) extends AnyVal {
      
      inline def setActiveAnchor(value: HTMLElement): Self = StObject.set(x, "activeAnchor", value.asInstanceOf[js.Any])
      
      inline def setActiveAnchorNull: Self = StObject.set(x, "activeAnchor", null)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
    }
  }
}

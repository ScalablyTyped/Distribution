package typings.reactDndHtml5Backend

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserDetectorMod {
  
  @JSImport("react-dnd-html5-backend/lib/BrowserDetector", "isFirefox")
  @js.native
  val isFirefox: Predicate = js.native
  
  @JSImport("react-dnd-html5-backend/lib/BrowserDetector", "isSafari")
  @js.native
  val isSafari: Predicate = js.native
  
  type Predicate = js.Function0[Boolean]
  
  object global {
    
    @js.native
    trait Window extends HTMLElement {
      
      var safari: js.Any = js.native
    }
  }
}

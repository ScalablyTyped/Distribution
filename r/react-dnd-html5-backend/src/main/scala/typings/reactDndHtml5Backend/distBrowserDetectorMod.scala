package typings.reactDndHtml5Backend

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserDetectorMod {
  
  @JSImport("react-dnd-html5-backend/dist/BrowserDetector", "isFirefox")
  @js.native
  val isFirefox: Predicate = js.native
  
  @JSImport("react-dnd-html5-backend/dist/BrowserDetector", "isSafari")
  @js.native
  val isSafari: Predicate = js.native
  
  type Predicate = js.Function0[Boolean]
  
  object global {
    
    @js.native
    trait Window
      extends StObject
         with HTMLElement {
      
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
      
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      /* InferMemberOverrides */
      override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
      
      var safari: Any = js.native
    }
  }
}

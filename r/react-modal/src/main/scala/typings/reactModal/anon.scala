package typings.reactModal

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content extends StObject {
    
    var content: Null | HTMLDivElement = js.native
    
    var overlay: Null | HTMLDivElement = js.native
  }
  object Content {
    
    @scala.inline
    def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: HTMLDivElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setOverlay(value: HTMLDivElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayNull: Self = StObject.set(x, "overlay", null)
    }
  }
}

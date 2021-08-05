package typings.reactVisibilitySensor

import typings.reactVisibilitySensor.mod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsVisible extends StObject {
    
    var isVisible: Boolean
    
    var visibilityRect: js.UndefOr[Shape] = js.undefined
  }
  object IsVisible {
    
    inline def apply(isVisible: Boolean): IsVisible = {
      val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsVisible]
    }
    
    extension [Self <: IsVisible](x: Self) {
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setVisibilityRect(value: Shape): Self = StObject.set(x, "visibilityRect", value.asInstanceOf[js.Any])
      
      inline def setVisibilityRectUndefined: Self = StObject.set(x, "visibilityRect", js.undefined)
    }
  }
}

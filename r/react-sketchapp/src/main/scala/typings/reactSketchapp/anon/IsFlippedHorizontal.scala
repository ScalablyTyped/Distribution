package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFlippedHorizontal extends StObject {
  
  var isFlippedHorizontal: js.UndefOr[Boolean] = js.undefined
  
  var isFlippedVertical: js.UndefOr[Boolean] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
}
object IsFlippedHorizontal {
  
  inline def apply(): IsFlippedHorizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFlippedHorizontal]
  }
  
  extension [Self <: IsFlippedHorizontal](x: Self) {
    
    inline def setIsFlippedHorizontal(value: Boolean): Self = StObject.set(x, "isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedHorizontalUndefined: Self = StObject.set(x, "isFlippedHorizontal", js.undefined)
    
    inline def setIsFlippedVertical(value: Boolean): Self = StObject.set(x, "isFlippedVertical", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedVerticalUndefined: Self = StObject.set(x, "isFlippedVertical", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}

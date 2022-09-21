package typings.reactNavigationStack.vendorTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCardInterpolatedStyle extends StObject {
  
  /**
    * Interpolated style for the view representing the card.
    */
  var cardStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * Interpolated style for the container view wrapping the card.
    */
  var containerStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * Interpolated style for the view representing the semi-transparent overlay below the card.
    */
  var overlayStyle: js.UndefOr[Any] = js.undefined
  
  /**
    * Interpolated style representing the card shadow.
    */
  var shadowStyle: js.UndefOr[Any] = js.undefined
}
object StackCardInterpolatedStyle {
  
  inline def apply(): StackCardInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackCardInterpolatedStyle]
  }
  
  extension [Self <: StackCardInterpolatedStyle](x: Self) {
    
    inline def setCardStyle(value: Any): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
    
    inline def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
    
    inline def setContainerStyle(value: Any): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setOverlayStyle(value: Any): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setShadowStyle(value: Any): Self = StObject.set(x, "shadowStyle", value.asInstanceOf[js.Any])
    
    inline def setShadowStyleUndefined: Self = StObject.set(x, "shadowStyle", js.undefined)
  }
}

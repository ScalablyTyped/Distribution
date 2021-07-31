package typings.reactNavigationStack.vendorTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCardInterpolatedStyle extends StObject {
  
  /**
    * Interpolated style for the view representing the card.
    */
  var cardStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the container view wrapping the card.
    */
  var containerStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the view representing the semi-transparent overlay below the card.
    */
  var overlayStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style representing the card shadow.
    */
  var shadowStyle: js.UndefOr[js.Any] = js.undefined
}
object StackCardInterpolatedStyle {
  
  @scala.inline
  def apply(): StackCardInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackCardInterpolatedStyle]
  }
  
  @scala.inline
  implicit class StackCardInterpolatedStyleMutableBuilder[Self <: StackCardInterpolatedStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardStyle(value: js.Any): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: js.Any): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: js.Any): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setShadowStyle(value: js.Any): Self = StObject.set(x, "shadowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowStyleUndefined: Self = StObject.set(x, "shadowStyle", js.undefined)
  }
}

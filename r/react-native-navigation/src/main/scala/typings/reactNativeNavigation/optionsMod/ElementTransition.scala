package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementTransition extends StObject {
  
  var alpha: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var id: String
  
  var rotationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var rotationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var scaleX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var scaleY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var translationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var translationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var x: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
  
  var y: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.undefined
}
object ElementTransition {
  
  @scala.inline
  def apply(id: String): ElementTransition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTransition]
  }
  
  @scala.inline
  implicit class ElementTransitionMutableBuilder[Self <: ElementTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "rotationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationXUndefined: Self = StObject.set(x, "rotationX", js.undefined)
    
    @scala.inline
    def setRotationY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "rotationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationYUndefined: Self = StObject.set(x, "rotationY", js.undefined)
    
    @scala.inline
    def setScaleX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setTranslationX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationXUndefined: Self = StObject.set(x, "translationX", js.undefined)
    
    @scala.inline
    def setTranslationY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationYUndefined: Self = StObject.set(x, "translationY", js.undefined)
    
    @scala.inline
    def setX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenAnimationOptions extends StObject {
  
  /**
    * Animate the element over opacity
    */
  var alpha: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animate the element over rotation
    */
  var rotation: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over rotationX
    */
  var rotationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over rotationY
    */
  var rotationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over scaleX
    */
  var scaleX: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over scaleY
    */
  var scaleY: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over translateX
    */
  var translationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over translateY
    */
  var translationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Wait for the root view to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animate the element over x value
    */
  var x: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  
  /**
    * Animate the element over y value
    */
  var y: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
}
object ScreenAnimationOptions {
  
  inline def apply(): ScreenAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenAnimationOptions]
  }
  
  extension [Self <: ScreenAnimationOptions](x: Self) {
    
    inline def setAlpha(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRotation(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setRotationX(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "rotationX", value.asInstanceOf[js.Any])
    
    inline def setRotationXUndefined: Self = StObject.set(x, "rotationX", js.undefined)
    
    inline def setRotationY(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "rotationY", value.asInstanceOf[js.Any])
    
    inline def setRotationYUndefined: Self = StObject.set(x, "rotationY", js.undefined)
    
    inline def setScaleX(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setTranslationX(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
    
    inline def setTranslationXUndefined: Self = StObject.set(x, "translationX", js.undefined)
    
    inline def setTranslationY(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    
    inline def setTranslationYUndefined: Self = StObject.set(x, "translationY", js.undefined)
    
    inline def setWaitForRender(value: Boolean): Self = StObject.set(x, "waitForRender", value.asInstanceOf[js.Any])
    
    inline def setWaitForRenderUndefined: Self = StObject.set(x, "waitForRender", js.undefined)
    
    inline def setX(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: OptionsAnimationPropertyConfig): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

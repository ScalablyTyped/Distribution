package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.spectacle.mod.TemplateFn
import typings.spectacle.mod.TransitionEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundImage: js.UndefOr[String] = js.undefined
  
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var backgroundRepeat: js.UndefOr[String] = js.undefined
  
  var backgroundSize: js.UndefOr[String] = js.undefined
  
  var children: ReactNode
  
  var scaleRatio: js.UndefOr[Double] = js.undefined
  
  var template: js.UndefOr[TemplateFn] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var transitionEffect: js.UndefOr[TransitionEffect] = js.undefined
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
    
    inline def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
    
    inline def setTemplate(value: /* options */ CurrentSlide => ReactNode): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
    
    inline def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
  }
}

package typings.reactNativeTypingAnimation

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleSheetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-typing-animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TypingAnimation(props: TypingAnimationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TypingAnimation")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TypingAnimationProps extends StObject {
    
    var dotAmplitude: js.UndefOr[Double] = js.undefined
    
    var dotColor: js.UndefOr[String] = js.undefined
    
    var dotMargin: js.UndefOr[Double] = js.undefined
    
    var dotRadius: js.UndefOr[Double] = js.undefined
    
    var dotSpeed: js.UndefOr[Double] = js.undefined
    
    var dotStyles: js.UndefOr[StyleSheetProperties] = js.undefined
    
    var dotX: js.UndefOr[Double] = js.undefined
    
    var dotY: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleSheetProperties] = js.undefined
  }
  object TypingAnimationProps {
    
    inline def apply(): TypingAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypingAnimationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypingAnimationProps] (val x: Self) extends AnyVal {
      
      inline def setDotAmplitude(value: Double): Self = StObject.set(x, "dotAmplitude", value.asInstanceOf[js.Any])
      
      inline def setDotAmplitudeUndefined: Self = StObject.set(x, "dotAmplitude", js.undefined)
      
      inline def setDotColor(value: String): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      inline def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      inline def setDotMargin(value: Double): Self = StObject.set(x, "dotMargin", value.asInstanceOf[js.Any])
      
      inline def setDotMarginUndefined: Self = StObject.set(x, "dotMargin", js.undefined)
      
      inline def setDotRadius(value: Double): Self = StObject.set(x, "dotRadius", value.asInstanceOf[js.Any])
      
      inline def setDotRadiusUndefined: Self = StObject.set(x, "dotRadius", js.undefined)
      
      inline def setDotSpeed(value: Double): Self = StObject.set(x, "dotSpeed", value.asInstanceOf[js.Any])
      
      inline def setDotSpeedUndefined: Self = StObject.set(x, "dotSpeed", js.undefined)
      
      inline def setDotStyles(value: StyleSheetProperties): Self = StObject.set(x, "dotStyles", value.asInstanceOf[js.Any])
      
      inline def setDotStylesUndefined: Self = StObject.set(x, "dotStyles", js.undefined)
      
      inline def setDotX(value: Double): Self = StObject.set(x, "dotX", value.asInstanceOf[js.Any])
      
      inline def setDotXUndefined: Self = StObject.set(x, "dotX", js.undefined)
      
      inline def setDotY(value: Double): Self = StObject.set(x, "dotY", value.asInstanceOf[js.Any])
      
      inline def setDotYUndefined: Self = StObject.set(x, "dotY", js.undefined)
      
      inline def setStyle(value: StyleSheetProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.TouchableNativeFeedbackProps
import typings.reactNativeGestureHandler.anon.Attribute
import typings.reactNativeGestureHandler.anon.Borderless
import typings.reactNativeGestureHandler.anon.UseForeground
import typings.reactNativeGestureHandler.libTypescriptComponentsTouchablesGenericTouchableMod.GenericTouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTouchablesTouchableNativeFeedbackDotandroidMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableNativeFeedback.android", JSImport.Default)
  @js.native
  open class default () extends TouchableNativeFeedback
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableNativeFeedback.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Ripple(color: ColorValue, borderless: Boolean): Borderless = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[Borderless]
    inline def Ripple(color: ColorValue, borderless: Boolean, rippleRadius: Double): Borderless = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any], rippleRadius.asInstanceOf[js.Any])).asInstanceOf[Borderless]
    
    inline def SelectableBackground(): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[Attribute]
    inline def SelectableBackground(rippleRadius: Double): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    
    inline def SelectableBackgroundBorderless(): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[Attribute]
    inline def SelectableBackgroundBorderless(rippleRadius: Double): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[Attribute]
    
    inline def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableNativeFeedback.android", "default.defaultProps")
    @js.native
    def defaultProps: UseForeground = js.native
    inline def defaultProps_=(x: UseForeground): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TouchableNativeFeedback
    extends Component[TouchableNativeFeedbackProps & GenericTouchableProps, js.Object, Any] {
    
    def getExtraButtonProps(): TouchableNativeFeedbackExtraProps = js.native
  }
  
  trait TouchableNativeFeedbackExtraProps extends StObject {
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var foreground: js.UndefOr[Boolean] = js.undefined
    
    var rippleColor: js.UndefOr[Double | Null] = js.undefined
    
    var rippleRadius: js.UndefOr[Double | Null] = js.undefined
  }
  object TouchableNativeFeedbackExtraProps {
    
    inline def apply(): TouchableNativeFeedbackExtraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchableNativeFeedbackExtraProps]
    }
    
    extension [Self <: TouchableNativeFeedbackExtraProps](x: Self) {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setRippleColor(value: Double): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorNull: Self = StObject.set(x, "rippleColor", null)
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleRadius(value: Double): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
      
      inline def setRippleRadiusNull: Self = StObject.set(x, "rippleRadius", null)
      
      inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
    }
  }
}

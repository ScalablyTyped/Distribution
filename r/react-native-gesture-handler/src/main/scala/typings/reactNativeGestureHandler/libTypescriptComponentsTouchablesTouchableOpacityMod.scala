package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNativeGestureHandler.anon.ActiveOpacityDelayLongPress
import typings.reactNativeGestureHandler.libTypescriptComponentsTouchablesGenericTouchableMod.GenericTouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTouchablesTouchableOpacityMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableOpacity", JSImport.Default)
  @js.native
  open class default () extends TouchableOpacity
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableOpacity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableOpacity", "default.defaultProps")
    @js.native
    def defaultProps: ActiveOpacityDelayLongPress = js.native
    inline def defaultProps_=(x: ActiveOpacityDelayLongPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait GHTouchableOpacityProps extends StObject {
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  }
  object GHTouchableOpacityProps {
    
    inline def apply(): GHTouchableOpacityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GHTouchableOpacityProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GHTouchableOpacityProps] (val x: Self) extends AnyVal {
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
    }
  }
  
  @js.native
  trait TouchableOpacity
    extends Component[
          TouchableOpacityProps & GenericTouchableProps & GHTouchableOpacityProps, 
          js.Object, 
          Any
        ] {
    
    def getChildStyleOpacityWithDefault(): Double = js.native
    
    def onStateChange(_from: Double, to: Double): Unit = js.native
    
    var opacity: Value = js.native
    
    def setOpacityTo(value: Double, duration: Double): Unit = js.native
  }
}

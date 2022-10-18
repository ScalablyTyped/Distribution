package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNativeGestureHandler.anon.BackgroundColor
import typings.reactNativeGestureHandler.anon.DelayPressOut
import typings.reactNativeGestureHandler.anon.Opacity
import typings.reactNativeGestureHandler.libTypescriptComponentsTouchablesGenericTouchableMod.GenericTouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTouchablesTouchableHighlightMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableHighlight", JSImport.Default)
  @js.native
  open class default protected () extends TouchableHighlight {
    def this(props: TouchableHighlightProps & GenericTouchableProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableHighlight", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/touchables/TouchableHighlight", "default.defaultProps")
    @js.native
    def defaultProps: DelayPressOut = js.native
    inline def defaultProps_=(x: DelayPressOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait State extends StObject {
    
    var extraChildStyle: Null | Opacity
    
    var extraUnderlayStyle: Null | BackgroundColor
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(extraChildStyle = null, extraUnderlayStyle = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setExtraChildStyle(value: Opacity): Self = StObject.set(x, "extraChildStyle", value.asInstanceOf[js.Any])
      
      inline def setExtraChildStyleNull: Self = StObject.set(x, "extraChildStyle", null)
      
      inline def setExtraUnderlayStyle(value: BackgroundColor): Self = StObject.set(x, "extraUnderlayStyle", value.asInstanceOf[js.Any])
      
      inline def setExtraUnderlayStyleNull: Self = StObject.set(x, "extraUnderlayStyle", null)
    }
  }
  
  @js.native
  trait TouchableHighlight extends Component[TouchableHighlightProps & GenericTouchableProps, State, Any] {
    
    def hasPressHandler(): js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) & js.Function0[Unit]] = js.native
    
    def hideUnderlay(): Unit = js.native
    
    def onStateChange(_from: Double, to: Double): Unit = js.native
    
    def renderChildren(): Element = js.native
    
    def showUnderlay(): Unit = js.native
  }
}

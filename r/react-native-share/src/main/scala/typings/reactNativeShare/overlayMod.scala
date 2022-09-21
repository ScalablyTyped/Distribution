package typings.reactNativeShare

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-native-share/Overlay", JSImport.Default)
  @js.native
  open class default () extends Overlay
  
  @js.native
  trait Overlay extends Component[OverlayProps, OverlayState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MOverlay(newProps: OverlayProps): Unit = js.native
    
    def onAnimatedEnd(): Unit = js.native
  }
  
  trait OverlayProps extends StObject {
    
    var children: ReactNode
    
    def onCancel(): Unit
    
    var visible: Boolean
  }
  object OverlayProps {
    
    inline def apply(onCancel: () => Unit, visible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverlayState extends StObject {
    
    var fadeAnim: Value
    
    var overlayStyle: StyleProp[ViewProps]
  }
  object OverlayState {
    
    inline def apply(fadeAnim: Value): OverlayState = {
      val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayState]
    }
    
    extension [Self <: OverlayState](x: Self) {
      
      inline def setFadeAnim(value: Value): Self = StObject.set(x, "fadeAnim", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    }
  }
}

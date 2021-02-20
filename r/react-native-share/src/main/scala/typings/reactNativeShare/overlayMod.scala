package typings.reactNativeShare

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-native-share/Overlay", JSImport.Default)
  @js.native
  class default () extends Overlay
  
  @js.native
  trait Overlay
    extends Component[OverlayProps, OverlayState, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MOverlay(newProps: OverlayProps): Unit = js.native
    
    def onAnimatedEnd(): Unit = js.native
  }
  
  @js.native
  trait OverlayProps extends StObject {
    
    var children: ReactNode = js.native
    
    def onCancel(): Unit = js.native
    
    var visible: Boolean = js.native
  }
  object OverlayProps {
    
    @scala.inline
    def apply(onCancel: () => Unit, visible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverlayState extends StObject {
    
    var fadeAnim: Value = js.native
    
    var overlayStyle: StyleProp[ViewProps] = js.native
  }
  object OverlayState {
    
    @scala.inline
    def apply(fadeAnim: Value): OverlayState = {
      val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayState]
    }
    
    @scala.inline
    implicit class OverlayStateMutableBuilder[Self <: OverlayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFadeAnim(value: Value): Self = StObject.set(x, "fadeAnim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    }
  }
}

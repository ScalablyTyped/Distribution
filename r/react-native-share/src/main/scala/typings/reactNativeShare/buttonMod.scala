package typings.reactNativeShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("react-native-share/Button", JSImport.Default)
  @js.native
  val default: FC[ButtonProps] = js.native
  
  trait ButtonProps extends StObject {
    
    var buttonStyle: StyleProp[ViewProps]
    
    var children: ReactNode
    
    var iconSrc: ImageSourcePropType
    
    def onPress(): Unit
    
    var textStyle: StyleProp[TextProps]
  }
  object ButtonProps {
    
    @scala.inline
    def apply(iconSrc: ImageSourcePropType, onPress: () => Unit): ButtonProps = {
      val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIconSrc(value: ImageSourcePropType): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSrcVarargs(value: ImageURISource*): Self = StObject.set(x, "iconSrc", js.Array(value :_*))
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextProps]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  type _To = FC[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: FC[ButtonProps] = default
}

package typings.reactNativePlatformTouchable

import typings.react.mod.Component
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.RippleBackgroundPropType
import typings.reactNative.mod.ThemeAttributeBackgroundPropType
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-platform-touchable", JSImport.Default)
  @js.native
  class default protected () extends Touchable {
    def this(props: PlatformTouchableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PlatformTouchableProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-platform-touchable", "default.Ripple")
    @js.native
    def Ripple(color: String): RippleBackgroundPropType = js.native
    @JSImport("react-native-platform-touchable", "default.Ripple")
    @js.native
    def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = js.native
    
    // TouchableNativeFeedback (default Android)
    @JSImport("react-native-platform-touchable", "default.SelectableBackground")
    @js.native
    def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
    
    @JSImport("react-native-platform-touchable", "default.SelectableBackgroundBorderless")
    @js.native
    def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
    
    @JSImport("react-native-platform-touchable", "default.canUseNativeForeground")
    @js.native
    def canUseNativeForeground(): Boolean = js.native
  }
  
  @JSImport("react-native-platform-touchable", "Touchable")
  @js.native
  class Touchable protected ()
    extends Component[PlatformTouchableProps, js.Object, js.Any] {
    def this(props: PlatformTouchableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PlatformTouchableProps, context: js.Any) = this()
    
    // TouchableOpacity (default iOS)
    def setOpacityTo(value: Double): Unit = js.native
  }
  /* static members */
  object Touchable {
    
    @JSImport("react-native-platform-touchable", "Touchable.Ripple")
    @js.native
    def Ripple(color: String): RippleBackgroundPropType = js.native
    @JSImport("react-native-platform-touchable", "Touchable.Ripple")
    @js.native
    def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = js.native
    
    // TouchableNativeFeedback (default Android)
    @JSImport("react-native-platform-touchable", "Touchable.SelectableBackground")
    @js.native
    def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
    
    @JSImport("react-native-platform-touchable", "Touchable.SelectableBackgroundBorderless")
    @js.native
    def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
    
    @JSImport("react-native-platform-touchable", "Touchable.canUseNativeForeground")
    @js.native
    def canUseNativeForeground(): Boolean = js.native
  }
  
  @js.native
  trait PlatformTouchableProps extends TouchableWithoutFeedbackProps {
    
    // TouchableOpacity (default iOS)
    var activeOpacity: js.UndefOr[Double] = js.native
    
    // TouchableNativeFeedback (default Android)
    var background: js.UndefOr[BackgroundPropType] = js.native
    
    var foreground: js.UndefOr[BackgroundPropType] = js.native
    
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    // TouchableHighlight
    var underlayColor: js.UndefOr[String] = js.native
  }
  object PlatformTouchableProps {
    
    @scala.inline
    def apply(): PlatformTouchableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformTouchableProps]
    }
    
    @scala.inline
    implicit class PlatformTouchablePropsMutableBuilder[Self <: PlatformTouchableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setForeground(value: BackgroundPropType): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      @scala.inline
      def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}

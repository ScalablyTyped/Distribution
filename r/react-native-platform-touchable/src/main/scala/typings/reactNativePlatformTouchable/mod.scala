package typings.reactNativePlatformTouchable

import typings.react.mod.Component
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.RippleBackgroundPropType
import typings.reactNative.mod.ThemeAttributeBackgroundPropType
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("react-native-platform-touchable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Ripple(color: String): RippleBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any]).asInstanceOf[RippleBackgroundPropType]
    inline def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
    
    // TouchableNativeFeedback (default Android)
    inline def SelectableBackground(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[ThemeAttributeBackgroundPropType]
    
    inline def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[ThemeAttributeBackgroundPropType]
    
    inline def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
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
    
    @JSImport("react-native-platform-touchable", "Touchable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Ripple(color: String): RippleBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any]).asInstanceOf[RippleBackgroundPropType]
    inline def Ripple(color: String, borderless: Boolean): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
    
    // TouchableNativeFeedback (default Android)
    inline def SelectableBackground(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[ThemeAttributeBackgroundPropType]
    
    inline def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[ThemeAttributeBackgroundPropType]
    
    inline def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
  }
  
  trait PlatformTouchableProps
    extends StObject
       with TouchableWithoutFeedbackProps {
    
    // TouchableOpacity (default iOS)
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    // TouchableNativeFeedback (default Android)
    var background: js.UndefOr[BackgroundPropType] = js.undefined
    
    var foreground: js.UndefOr[BackgroundPropType] = js.undefined
    
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // TouchableHighlight
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object PlatformTouchableProps {
    
    inline def apply(): PlatformTouchableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformTouchableProps]
    }
    
    extension [Self <: PlatformTouchableProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setForeground(value: BackgroundPropType): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}

package typings.reactNativeWindows.reactNativeWindowsMod

import typings.reactNativeWindows.rntypesMod.ColorValue
import typings.reactNativeWindows.rntypesMod.RippleBackgroundPropType
import typings.reactNativeWindows.rntypesMod.ThemeAttributeBackgroundPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", "TouchableNativeFeedback")
@js.native
open class TouchableNativeFeedback ()
  extends typings.reactNativeWindows.rntypesMod.TouchableNativeFeedback
/* static members */
object TouchableNativeFeedback {
  
  @JSImport("react-native-windows", "TouchableNativeFeedback")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an object that represents ripple drawable with specified color (as a
    * string). If property `borderless` evaluates to true the ripple will
    * render outside of the view bounds (see native actionbar buttons as an
    * example of that behavior). This background type is available on Android
    * API level 21+.
    *
    * @param color The ripple color
    * @param borderless If the ripple can render outside it's bounds
    * @param rippleRadius The radius of ripple effect
    */
  inline def Ripple(color: ColorValue, borderless: Boolean): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
  inline def Ripple(color: ColorValue, borderless: Boolean, rippleRadius: Double): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any], rippleRadius.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
  
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    *
    * @param rippleRadius The radius of ripple effect
    */
  inline def SelectableBackground(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[ThemeAttributeBackgroundPropType]
  inline def SelectableBackground(rippleRadius: Double): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[ThemeAttributeBackgroundPropType]
  
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    *
    * @param rippleRadius The radius of ripple effect
    */
  inline def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[ThemeAttributeBackgroundPropType]
  inline def SelectableBackgroundBorderless(rippleRadius: Double): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[ThemeAttributeBackgroundPropType]
  
  inline def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
}

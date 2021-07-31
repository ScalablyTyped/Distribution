package typings.reactNative.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TouchableMixin */ @JSImport("react-native", "TouchableNativeFeedback")
@js.native
class TouchableNativeFeedback ()
  extends Component[TouchableNativeFeedbackProps, js.Object, js.Any]
/* static members */
object TouchableNativeFeedback {
  
  @JSImport("react-native", "TouchableNativeFeedback")
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
    */
  @scala.inline
  def Ripple(color: ColorValue): RippleBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any]).asInstanceOf[RippleBackgroundPropType]
  @scala.inline
  def Ripple(color: ColorValue, borderless: Boolean): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
  
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    */
  @scala.inline
  def SelectableBackground(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[ThemeAttributeBackgroundPropType]
  
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    */
  @scala.inline
  def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[ThemeAttributeBackgroundPropType]
  
  @scala.inline
  def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
}

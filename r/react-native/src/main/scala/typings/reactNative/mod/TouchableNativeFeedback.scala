package typings.reactNative.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TouchableMixin */ @JSImport("react-native", "TouchableNativeFeedback")
@js.native
class TouchableNativeFeedback ()
  extends Component[TouchableNativeFeedbackProps, js.Object, js.Any]
/* static members */
object TouchableNativeFeedback {
  
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
  @JSImport("react-native", "TouchableNativeFeedback.Ripple")
  @js.native
  def Ripple(color: ColorValue): RippleBackgroundPropType = js.native
  @JSImport("react-native", "TouchableNativeFeedback.Ripple")
  @js.native
  def Ripple(color: ColorValue, borderless: Boolean): RippleBackgroundPropType = js.native
  
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    */
  @JSImport("react-native", "TouchableNativeFeedback.SelectableBackground")
  @js.native
  def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
  
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    */
  @JSImport("react-native", "TouchableNativeFeedback.SelectableBackgroundBorderless")
  @js.native
  def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
  
  @JSImport("react-native", "TouchableNativeFeedback.canUseNativeForeground")
  @js.native
  def canUseNativeForeground(): Boolean = js.native
}

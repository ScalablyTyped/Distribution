package typings.reactNativeMaterialRipple

import typings.react.anon.Children
import typings.react.mod.Component
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNativeMaterialRipple.anon.AnimatedPropsViewProps
import typings.reactNativeMaterialRipple.anon.Disabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-ripple", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default ()
    extends Component[RippleProps, js.Object, js.Any]
  
  type Ripple = Component[RippleProps, js.Object, js.Any]
  
  type RippleProps = TouchableWithoutFeedbackProps with Children with AnimatedPropsViewProps with Disabled
}

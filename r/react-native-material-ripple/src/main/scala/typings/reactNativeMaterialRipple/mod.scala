package typings.reactNativeMaterialRipple

import typings.react.mod.Component
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNativeMaterialRipple.anon.AnimatedPropsViewProps
import typings.reactNativeMaterialRipple.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-ripple", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RippleProps, js.Object, Any]
  
  type Ripple = Component[RippleProps, js.Object, Any]
  
  type RippleProps = TouchableWithoutFeedbackProps & AnimatedPropsViewProps & Disabled
}

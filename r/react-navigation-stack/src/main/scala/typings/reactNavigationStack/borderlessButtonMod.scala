package typings.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.reactNativeGestureHandler.mod.BaseButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", JSImport.Namespace)
@js.native
object borderlessButtonMod extends js.Object {
  @js.native
  trait BorderlessButton
    extends Component[Props, js.Object, js.Any] {
    var handleActiveStateChange: js.Any = js.native
    var opacity: js.Any = js.native
  }
  
  @js.native
  class default () extends BorderlessButton
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonActiveOpacity = js.native
  }
  
  type Props = ComponentProps[Instantiable0[BaseButton]] with AnonActiveOpacityNumber
}


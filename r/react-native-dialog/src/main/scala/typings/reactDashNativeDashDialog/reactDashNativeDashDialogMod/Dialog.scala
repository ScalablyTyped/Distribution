package typings.reactDashNativeDashDialog.reactDashNativeDashDialogMod

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.TextInputProps
import typings.reactDashNative.reactDashNativeMod.TextProps
import typings.reactDashNative.reactDashNativeMod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialog", "Dialog")
@js.native
object Dialog extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Container ()
    extends Component[ContainerProps with ViewProps with reactNativeModalContainerProps, js.Object, js.Any]
  
  @js.native
  class Description ()
    extends Component[DescriptionProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Input[T] ()
    extends Component[InputProps[T] with ViewProps with TextInputProps, js.Object, js.Any]
  
  @js.native
  class Title ()
    extends Component[TitleProps with ViewProps with TextProps, js.Object, js.Any]
  
}


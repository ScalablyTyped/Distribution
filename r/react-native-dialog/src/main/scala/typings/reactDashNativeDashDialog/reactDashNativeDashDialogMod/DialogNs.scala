package typings.reactDashNativeDashDialog.reactDashNativeDashDialogMod

import typings.react.reactMod.PureComponent
import typings.reactDashNative.reactDashNativeMod.TextInputProps
import typings.reactDashNative.reactDashNativeMod.TextProps
import typings.reactDashNative.reactDashNativeMod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialog", "Dialog")
@js.native
object DialogNs extends js.Object {
  @js.native
  class Button ()
    extends PureComponent[ButtonProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Container ()
    extends PureComponent[ContainerProps with ViewProps, js.Object, js.Any]
  
  @js.native
  class Description ()
    extends PureComponent[DescriptionProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Input[T] ()
    extends PureComponent[InputProps[T] with ViewProps with TextInputProps, js.Object, js.Any]
  
  @js.native
  class Title ()
    extends PureComponent[TitleProps with ViewProps with TextProps, js.Object, js.Any]
  
}


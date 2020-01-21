package typings.reactNativeDialog.mod

import typings.react.mod.Component
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialog", JSImport.Default)
@js.native
object default extends js.Object {
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


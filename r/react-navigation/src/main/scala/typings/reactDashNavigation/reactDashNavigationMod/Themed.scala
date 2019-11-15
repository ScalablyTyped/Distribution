package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "Themed")
@js.native
object Themed extends js.Object {
  @js.native
  class StatusBar protected ()
    extends Component[ThemedStatusBarProps, ComponentState, js.Any] {
    def this(props: ThemedStatusBarProps) = this()
    def this(props: ThemedStatusBarProps, context: js.Any) = this()
  }
  
  @js.native
  class Text protected ()
    extends Component[ThemedTextProps, ComponentState, js.Any] {
    def this(props: ThemedTextProps) = this()
    def this(props: ThemedTextProps, context: js.Any) = this()
  }
  
  @js.native
  class TextInput protected ()
    extends Component[ThemedTextInputProps, ComponentState, js.Any] {
    def this(props: ThemedTextInputProps) = this()
    def this(props: ThemedTextInputProps, context: js.Any) = this()
  }
  
  val StatusBar: ComponentType[ThemedStatusBarProps] = js.native
  val Text: ComponentType[ThemedTextProps] = js.native
  val TextInput: ComponentType[ThemedTextInputProps] = js.native
}


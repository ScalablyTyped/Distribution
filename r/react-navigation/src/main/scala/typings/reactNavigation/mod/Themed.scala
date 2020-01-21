package typings.reactNavigation.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
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
  
  @js.native
  object StatusBar extends TopLevel[ComponentType[ThemedStatusBarProps]]
  
  @js.native
  object Text extends TopLevel[ComponentType[ThemedTextProps]]
  
  @js.native
  object TextInput extends TopLevel[ComponentType[ThemedTextInputProps]]
  
}


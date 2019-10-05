package typings.reactDashSelect

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcComponentsInputMod.InputProps
import typings.reactDashSelect.srcTypesMod.PropsWithStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Input", JSImport.Namespace)
@js.native
object srcComponentsInputMod extends js.Object {
  @js.native
  class Input protected ()
    extends Component[InputProps, ComponentState, js.Any] {
    def this(props: InputProps) = this()
    def this(props: InputProps, context: js.Any) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[InputProps, ComponentState, js.Any] {
    def this(props: InputProps) = this()
    def this(props: InputProps, context: js.Any) = this()
  }
  
  val Input: ComponentType[InputProps] = js.native
  val default: ComponentType[InputProps] = js.native
  def inputCSS(props: InputProps): CSSProperties = js.native
  def inputStyle(isHidden: Boolean): CSSProperties = js.native
  type InputProps = PropsWithStyles with Anon_A
}


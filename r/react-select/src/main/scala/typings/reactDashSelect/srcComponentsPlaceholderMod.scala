package typings.reactDashSelect

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcComponentsPlaceholderMod.PlaceholderProps
import typings.reactDashSelect.srcTypesMod.CommonProps
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Placeholder", JSImport.Namespace)
@js.native
object srcComponentsPlaceholderMod extends js.Object {
  @js.native
  class Placeholder protected ()
    extends Component[PlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: PlaceholderProps[_]) = this()
    def this(props: PlaceholderProps[_], context: js.Any) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[PlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: PlaceholderProps[_]) = this()
    def this(props: PlaceholderProps[_], context: js.Any) = this()
  }
  
  val Placeholder: ComponentType[PlaceholderProps[js.Any]] = js.native
  val default: ComponentType[PlaceholderProps[js.Any]] = js.native
  def placeholderCSS(): CSSProperties = js.native
  type PlaceholderProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenInnerPropsKey
}


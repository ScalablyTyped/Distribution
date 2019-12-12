package typings.reactDashSelect

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashSelect.srcAnimatedInputMod.AnimatedInputProps
import typings.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typings.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typings.reactDashSelect.srcAnimatedSingleValueMod.AnimatedSingleValueProps
import typings.reactDashSelect.srcAnimatedValueContainerMod.AnimatedValueContainerProps
import typings.reactDashSelect.srcComponentsMod.SelectComponents
import typings.reactDashSelect.srcComponentsMod.SelectComponentsConfig
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/animated", JSImport.Namespace)
@js.native
object animatedMod extends js.Object {
  @js.native
  class Input protected ()
    extends Component[AnimatedInputProps, ComponentState, js.Any] {
    def this(props: AnimatedInputProps) = this()
    def this(props: AnimatedInputProps, context: js.Any) = this()
  }
  
  @js.native
  class MultiValue protected ()
    extends Component[AnimatedMultiValueProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedMultiValueProps[_]) = this()
    def this(props: AnimatedMultiValueProps[_], context: js.Any) = this()
  }
  
  @js.native
  class Placeholder protected ()
    extends Component[AnimatedPlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedPlaceholderProps[_]) = this()
    def this(props: AnimatedPlaceholderProps[_], context: js.Any) = this()
  }
  
  @js.native
  class SingleValue protected ()
    extends Component[AnimatedSingleValueProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedSingleValueProps[_]) = this()
    def this(props: AnimatedSingleValueProps[_], context: js.Any) = this()
  }
  
  @js.native
  class ValueContainer protected ()
    extends Component[AnimatedValueContainerProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedValueContainerProps[_]) = this()
    def this(props: AnimatedValueContainerProps[_], context: js.Any) = this()
  }
  
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  @js.native
  object Input extends TopLevel[ComponentType[AnimatedInputProps]]
  
  @js.native
  object MultiValue
    extends TopLevel[ComponentType[AnimatedMultiValueProps[js.Any]]]
  
  @js.native
  object Placeholder
    extends TopLevel[ComponentType[AnimatedPlaceholderProps[js.Any]]]
  
  @js.native
  object SingleValue
    extends TopLevel[ComponentType[AnimatedSingleValueProps[js.Any]]]
  
  @js.native
  object ValueContainer
    extends TopLevel[ComponentType[AnimatedValueContainerProps[js.Any]]]
  
}


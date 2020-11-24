package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsMod.SelectComponents
import typings.reactSelect.componentsMod.SelectComponentsConfig
import typings.reactSelect.inputMod.AnimatedInputProps
import typings.reactSelect.multiValueMod.AnimatedMultiValueProps
import typings.reactSelect.placeholderMod.AnimatedPlaceholderProps
import typings.reactSelect.singleValueMod.AnimatedSingleValueProps
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.valueContainerMod.AnimatedValueContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/animated", JSImport.Namespace)
@js.native
object animatedMod extends js.Object {
  
  val Input: ComponentType[AnimatedInputProps] = js.native
  
  val MultiValue: ComponentType[AnimatedMultiValueProps[js.Any]] = js.native
  
  val Placeholder: ComponentType[AnimatedPlaceholderProps[js.Any]] = js.native
  
  val SingleValue: ComponentType[AnimatedSingleValueProps[js.Any]] = js.native
  
  val ValueContainer: ComponentType[AnimatedValueContainerProps[js.Any]] = js.native
  
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

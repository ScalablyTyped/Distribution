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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimatedMod {
  
  @JSImport("react-select/src/animated", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  @JSImport("react-select/src/animated", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  
  @JSImport("react-select/src/animated", "Input")
  @js.native
  val Input: ComponentType[AnimatedInputProps] = js.native
  
  @JSImport("react-select/src/animated", "MultiValue")
  @js.native
  val MultiValue: ComponentType[AnimatedMultiValueProps[js.Any]] = js.native
  
  @JSImport("react-select/src/animated", "Placeholder")
  @js.native
  val Placeholder: ComponentType[AnimatedPlaceholderProps[js.Any]] = js.native
  
  @JSImport("react-select/src/animated", "SingleValue")
  @js.native
  val SingleValue: ComponentType[AnimatedSingleValueProps[js.Any]] = js.native
  
  @JSImport("react-select/src/animated", "ValueContainer")
  @js.native
  val ValueContainer: ComponentType[AnimatedValueContainerProps[js.Any]] = js.native
  
  @JSImport("react-select/src/animated", "makeAnimated")
  @js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  @JSImport("react-select/src/animated", "makeAnimated")
  @js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

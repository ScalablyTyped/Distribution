package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleValueMod {
  
  @JSImport("react-select/src/animated/SingleValue", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  
  @JSImport("react-select/src/animated/SingleValue", "AnimatedSingleValue")
  @js.native
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = js.native
  
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}

package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("react-select/src/animated/Placeholder", JSImport.Default)
  @js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
  
  @JSImport("react-select/src/animated/Placeholder", "AnimatedPlaceholder")
  @js.native
  def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = js.native
  
  type AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] = PlaceholderProps[OptionType]
}

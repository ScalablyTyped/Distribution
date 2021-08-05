package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  @JSImport("react-select/src/animated/Placeholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedPlaceholderProps[OptionType]]]
  
  inline def AnimatedPlaceholder[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[PlaceholderProps[OptionType]]): ComponentType[AnimatedPlaceholderProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("AnimatedPlaceholder")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedPlaceholderProps[OptionType]]]
  
  type AnimatedPlaceholderProps[OptionType /* <: OptionTypeBase */] = PlaceholderProps[OptionType]
}

package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueContainerMod {
  
  @JSImport("react-select/src/animated/ValueContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedValueContainerProps[OptionType]]]
  
  @scala.inline
  def AnimatedValueContainer[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[ValueContainerProps[OptionType]]): ComponentType[AnimatedValueContainerProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("AnimatedValueContainer")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedValueContainerProps[OptionType]]]
  
  type AnimatedValueContainerProps[OptionType /* <: OptionTypeBase */] = ValueContainerProps[OptionType]
}

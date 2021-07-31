package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleValueMod {
  
  @JSImport("react-select/src/animated/SingleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedSingleValueProps[OptionType]]]
  
  @scala.inline
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ComponentType[SingleValueProps[OptionType]]): ComponentType[AnimatedSingleValueProps[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("AnimatedSingleValue")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedSingleValueProps[OptionType]]]
  
  type AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] = SingleValueProps[OptionType]
}

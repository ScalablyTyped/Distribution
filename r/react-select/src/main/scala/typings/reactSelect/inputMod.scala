package typings.reactSelect

import typings.react.mod.ComponentType
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.transitionsMod.BaseTransition
import typings.reactSelect.typesMod.PropsWithInnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("react-select/src/animated/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedInputProps]]
  
  @scala.inline
  def AnimatedInput(WrappedComponent: ComponentType[InputProps]): ComponentType[AnimatedInputProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("AnimatedInput")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedInputProps]]
  
  type AnimatedInputProps = BaseTransition & PropsWithInnerRef & InputProps
}

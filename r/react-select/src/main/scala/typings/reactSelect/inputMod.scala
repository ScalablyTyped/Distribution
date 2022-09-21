package typings.reactSelect

import typings.react.mod.ReactElement
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.typesMod.GroupBase
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("react-select/dist/declarations/src/animated/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: InputComponent): InputComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[InputComponent]
  
  type AnimatedInputProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (InputProps[Option, IsMulti, Group]) & Partial[TransitionProps[Unit]]
  
  type InputComponent = js.Function1[/* props */ InputProps[Any, Boolean, GroupBase[Any]], ReactElement]
}

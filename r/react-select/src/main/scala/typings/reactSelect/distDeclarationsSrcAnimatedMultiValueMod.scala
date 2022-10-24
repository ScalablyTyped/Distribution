package typings.reactSelect

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMultiValueMod {
  
  @JSImport("react-select/dist/declarations/src/animated/MultiValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: MultiValueComponent): js.Function1[/* param0 */ AnimatedMultiValueProps[Any, Boolean, GroupBase[Any]], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ AnimatedMultiValueProps[Any, Boolean, GroupBase[Any]], Element]]
  
  type AnimatedMultiValueProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (MultiValueProps[Option, IsMulti, Group]) & Partial[TransitionProps[Unit]]
  
  type MultiValueComponent = js.Function1[/* props */ MultiValueProps[Any, Boolean, GroupBase[Any]], ReactElement]
}

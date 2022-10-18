package typings.reactSpringCore

import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.anon.Children
import typings.reactSpringCore.anon.To
import typings.reactSpringCore.anon.ToState
import typings.reactSpringCore.distDeclarationsSrcHooksUseSpringMod.UseSpringProps
import typings.reactSpringCore.reactSpringCoreStrings.from
import typings.reactSpringCore.reactSpringCoreStrings.to
import typings.reactSpringTypes.utilMod.NoInfer
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsSpringMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components/Spring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Spring[State /* <: js.Object */](props: To[State] & (Omit[SpringComponentProps[NoInfer[State]], from | to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Spring_to[State /* <: js.Object */](props: ToState[State] & (Omit[SpringComponentProps[NoInfer[State]], to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  type SpringComponentProps[State /* <: js.Object */] = Any & UseSpringProps[State] & Children[State]
}

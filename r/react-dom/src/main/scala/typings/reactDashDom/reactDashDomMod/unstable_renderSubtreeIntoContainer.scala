package typings.reactDashDom.reactDashDomMod

import typings.react.reactMod.CElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DOMElement
import typings.react.reactMod.ReactElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
@js.native
object unstable_renderSubtreeIntoContainer extends js.Object {
  def apply[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def apply[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def apply[P](parentComponent: Component[_, js.Object, _], element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, _]) | Element], _]
  ): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](parentComponent: Component[_, js.Object, _], element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}


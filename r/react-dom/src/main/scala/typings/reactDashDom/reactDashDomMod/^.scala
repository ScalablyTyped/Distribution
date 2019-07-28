package typings.reactDashDom.reactDashDomMod

import typings.react.reactMod.CElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DOMElement
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactPortal
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val hydrate: Renderer = js.native
  val render: Renderer = js.native
  val version: String = js.native
  def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
  def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[_, js.Object, _], element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, _]) | Element], _]
  ): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](parentComponent: Component[_, js.Object, _], element: CElement[P, T], container: Element): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}


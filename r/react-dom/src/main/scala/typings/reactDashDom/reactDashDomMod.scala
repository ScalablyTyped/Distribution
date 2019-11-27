package typings.reactDashDom

import typings.react.reactMod.CElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.DOMElement
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactPortal
import typings.react.reactMod.SFCElement
import typings.reactDashDom.reactDashDomMod.Renderer
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", JSImport.Namespace)
@js.native
object reactDashDomMod extends js.Object {
  @js.native
  trait Renderer extends js.Object {
    def apply(element: js.Array[ReactElement]): (Component[_, ComponentState, _]) | Element | Unit = js.native
    def apply(element: js.Array[ReactElement], container: Null, callback: js.Function0[Unit]): (Component[_, ComponentState, _]) | Element | Unit = js.native
    def apply(element: js.Array[ReactElement], container: Element): (Component[_, ComponentState, _]) | Element | Unit = js.native
    def apply(element: js.Array[ReactElement], container: Element, callback: js.Function0[Unit]): (Component[_, ComponentState, _]) | Element | Unit = js.native
    def apply(element: SFCElement[_]): Unit = js.native
    def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: SFCElement[_], container: Element): Unit = js.native
    def apply(element: SFCElement[_], container: Element, callback: js.Function0[Unit]): Unit = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
    // Deprecated(render): The return value is deprecated.
    // In future releases the render function's return type will be void.
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
    def apply[P](element: ReactElement): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
  }
  
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


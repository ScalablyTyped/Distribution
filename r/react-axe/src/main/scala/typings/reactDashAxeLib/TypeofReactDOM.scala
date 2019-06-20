package typings
package reactDashAxeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactDOM extends js.Object {
  val hydrate: reactDashDomLib.reactDashDomMod.Renderer = js.native
  val render: reactDashDomLib.reactDashDomMod.Renderer = js.native
  val version: java.lang.String = js.native
  def createPortal(children: reactLib.reactMod.ReactNode, container: stdLib.Element): reactLib.reactMod.ReactPortal = js.native
  def createPortal(children: reactLib.reactMod.ReactNode, container: stdLib.Element, key: java.lang.String): reactLib.reactMod.ReactPortal = js.native
  def findDOMNode(): stdLib.Element | scala.Null | stdLib.Text = js.native
  def findDOMNode(instance: reactLib.reactMod.ReactInstance): stdLib.Element | scala.Null | stdLib.Text = js.native
  def unmountComponentAtNode(container: stdLib.Element): scala.Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): scala.Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): scala.Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: stdLib.Element */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: stdLib.Element */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactElement,
    container: stdLib.Element
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactElement,
    container: stdLib.Element,
    callback: js.Function1[
      /* component */ js.UndefOr[
        (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element
      ], 
      _
    ]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.CElement[P, T],
    container: stdLib.Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.CElement[P, T],
    container: stdLib.Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}


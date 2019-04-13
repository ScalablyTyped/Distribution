package typings
package reactDashAxeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AB extends js.Object {
  val version: java.lang.String = js.native
  def createPortal(children: reactLib.reactMod.ReactNode, container: stdLib.Element): reactLib.reactMod.ReactPortal = js.native
  def createPortal(children: reactLib.reactMod.ReactNode, container: stdLib.Element, key: java.lang.String): reactLib.reactMod.ReactPortal = js.native
  def findDOMNode(): stdLib.Element | scala.Null | stdLib.Text = js.native
  def findDOMNode(instance: reactLib.reactMod.ReactInstance): stdLib.Element | scala.Null | stdLib.Text = js.native
  def hydrate(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def hydrate(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def hydrate(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def hydrate(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def hydrate(element: reactLib.reactMod.SFCElement[_]): scala.Unit = js.native
  def hydrate(
    element: reactLib.reactMod.SFCElement[_],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def hydrate(element: reactLib.reactMod.SFCElement[_], container: stdLib.Element): scala.Unit = js.native
  def hydrate(
    element: reactLib.reactMod.SFCElement[_],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def hydrate[T /* <: stdLib.Element */](element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T]): T = js.native
  def hydrate[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def hydrate[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element
  ): T = js.native
  def hydrate[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def hydrate[P](element: reactLib.reactMod.ReactElement[P]): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def hydrate[P](
    element: reactLib.reactMod.ReactElement[P],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def hydrate[P](element: reactLib.reactMod.ReactElement[P], container: stdLib.Element): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def hydrate[P](
    element: reactLib.reactMod.ReactElement[P],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def hydrate[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T]): T = js.native
  def hydrate[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def hydrate[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T], container: stdLib.Element): T = js.native
  def hydrate[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  @JSName("hydrate")
  def `hydrate_<union>`(element: js.Array[reactLib.reactMod.ReactElement[_]]): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("hydrate")
  def `hydrate_<union>`(
    element: js.Array[reactLib.reactMod.ReactElement[_]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("hydrate")
  def `hydrate_<union>`(element: js.Array[reactLib.reactMod.ReactElement[_]], container: stdLib.Element): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("hydrate")
  def `hydrate_<union>`(
    element: js.Array[reactLib.reactMod.ReactElement[_]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("hydrate")
  def hydrate_Element(element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]]): stdLib.Element = js.native
  @JSName("hydrate")
  def hydrate_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): stdLib.Element = js.native
  @JSName("hydrate")
  def hydrate_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: stdLib.Element
  ): stdLib.Element = js.native
  @JSName("hydrate")
  def hydrate_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): stdLib.Element = js.native
  @JSName("hydrate")
  def hydrate_Unit(element: js.Array[reactLib.reactMod.SFCElement[_]]): scala.Unit = js.native
  @JSName("hydrate")
  def hydrate_Unit(
    element: js.Array[reactLib.reactMod.SFCElement[_]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("hydrate")
  def hydrate_Unit(element: js.Array[reactLib.reactMod.SFCElement[_]], container: stdLib.Element): scala.Unit = js.native
  @JSName("hydrate")
  def hydrate_Unit(
    element: js.Array[reactLib.reactMod.SFCElement[_]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def render(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def render(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def render(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def render(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def render(element: reactLib.reactMod.SFCElement[_]): scala.Unit = js.native
  def render(
    element: reactLib.reactMod.SFCElement[_],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def render(element: reactLib.reactMod.SFCElement[_], container: stdLib.Element): scala.Unit = js.native
  def render(
    element: reactLib.reactMod.SFCElement[_],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def render[T /* <: stdLib.Element */](element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T]): T = js.native
  def render[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def render[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element
  ): T = js.native
  def render[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def render[P](element: reactLib.reactMod.ReactElement[P]): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def render[P](
    element: reactLib.reactMod.ReactElement[P],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def render[P](element: reactLib.reactMod.ReactElement[P], container: stdLib.Element): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def render[P](
    element: reactLib.reactMod.ReactElement[P],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def render[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T]): T = js.native
  def render[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def render[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T], container: stdLib.Element): T = js.native
  def render[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  @JSName("render")
  def `render_<union>`(element: js.Array[reactLib.reactMod.ReactElement[_]]): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("render")
  def `render_<union>`(
    element: js.Array[reactLib.reactMod.ReactElement[_]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("render")
  def `render_<union>`(element: js.Array[reactLib.reactMod.ReactElement[_]], container: stdLib.Element): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("render")
  def `render_<union>`(
    element: js.Array[reactLib.reactMod.ReactElement[_]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  @JSName("render")
  def render_Element(element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]]): stdLib.Element = js.native
  @JSName("render")
  def render_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): stdLib.Element = js.native
  @JSName("render")
  def render_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: stdLib.Element
  ): stdLib.Element = js.native
  @JSName("render")
  def render_Element(
    element: js.Array[reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[_], _]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): stdLib.Element = js.native
  @JSName("render")
  def render_Unit(element: js.Array[reactLib.reactMod.SFCElement[_]]): scala.Unit = js.native
  @JSName("render")
  def render_Unit(
    element: js.Array[reactLib.reactMod.SFCElement[_]],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("render")
  def render_Unit(element: js.Array[reactLib.reactMod.SFCElement[_]], container: stdLib.Element): scala.Unit = js.native
  @JSName("render")
  def render_Unit(
    element: js.Array[reactLib.reactMod.SFCElement[_]],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
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
    element: reactLib.reactMod.ReactElement[P],
    container: stdLib.Element
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactElement[P],
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


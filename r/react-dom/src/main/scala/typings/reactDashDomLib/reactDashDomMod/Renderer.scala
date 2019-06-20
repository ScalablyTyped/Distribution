package typings
package reactDashDomLib.reactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _]]
    ],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ComponentState, _] = js.native
  def apply(element: reactLib.reactMod.SFCElement[_]): scala.Unit = js.native
  def apply(
    element: reactLib.reactMod.SFCElement[_],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply(element: reactLib.reactMod.SFCElement[_], container: stdLib.Element): scala.Unit = js.native
  def apply(
    element: reactLib.reactMod.SFCElement[_],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply[T /* <: stdLib.Element */](element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T]): T = js.native
  def apply[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def apply[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element
  ): T = js.native
  def apply[T /* <: stdLib.Element */](
    element: reactLib.reactMod.DOMElement[reactLib.reactMod.DOMAttributes[T], T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def apply[P](element: reactLib.reactMod.ReactElement): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def apply[P](element: reactLib.reactMod.ReactElement, container: scala.Null, callback: js.Function0[scala.Unit]): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def apply[P](element: reactLib.reactMod.ReactElement, container: stdLib.Element): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def apply[P](
    element: reactLib.reactMod.ReactElement,
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _]) | stdLib.Element | scala.Unit = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T]): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](element: reactLib.reactMod.CElement[P, T], container: stdLib.Element): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ComponentState, _] */](
    element: reactLib.reactMod.CElement[P, T],
    container: stdLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
}


package typings
package reactDashDomLib.reactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(
    element: js.Array[
      reactLib.reactMod.ReactNs.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _]]
    ]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.ReactNs.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _]]
    ],
    container: reactLib.Element
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.ReactNs.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _]]
    ],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _] = js.native
  def apply(
    element: js.Array[
      reactLib.reactMod.ReactNs.CElement[_, reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _]]
    ],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): reactLib.reactMod.Component[_, reactLib.reactMod.ReactNs.ComponentState, _] = js.native
  def apply(element: reactLib.reactMod.ReactNs.SFCElement[_]): scala.Unit = js.native
  def apply(element: reactLib.reactMod.ReactNs.SFCElement[_], container: reactLib.Element): scala.Unit = js.native
  def apply(
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply(
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply(
    parentComponent: js.Array[reactLib.reactMod.Component[_, js.Object, _]],
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: reactLib.Element
  ): scala.Unit = js.native
  def apply(
    parentComponent: js.Array[reactLib.reactMod.Component[_, js.Object, _]],
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply(
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: reactLib.Element
  ): scala.Unit = js.native
  def apply(
    parentComponent: reactLib.reactMod.Component[_, js.Object, _],
    element: reactLib.reactMod.ReactNs.SFCElement[_],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def apply[T /* <: reactLib.Element */](element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T]): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def apply[T /* <: reactLib.Element */](
    element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T],
    container: reactLib.Element
  ): T = js.native
  def apply[T /* <: reactLib.Element */](
    element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def apply[T /* <: reactLib.Element */](
    element: reactLib.reactMod.ReactNs.DOMElement[reactLib.reactMod.ReactNs.DOMAttributes[T], T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def apply[P](element: reactLib.reactMod.ReactNs.ReactElement[P]): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | reactLib.Element | scala.Unit = js.native
  def apply[P](element: reactLib.reactMod.ReactNs.ReactElement[P], container: reactLib.Element): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | reactLib.Element | scala.Unit = js.native
  def apply[P](
    element: reactLib.reactMod.ReactNs.ReactElement[P],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | reactLib.Element | scala.Unit = js.native
  def apply[P](
    element: reactLib.reactMod.ReactNs.ReactElement[P],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): (reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _]) | reactLib.Element | scala.Unit = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](element: reactLib.reactMod.ReactNs.CElement[P, T]): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](element: reactLib.reactMod.ReactNs.CElement[P, T], container: reactLib.Element): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](
    element: reactLib.reactMod.ReactNs.CElement[P, T],
    container: reactLib.Element,
    callback: js.Function0[scala.Unit]
  ): T = js.native
  def apply[P, T /* <: reactLib.reactMod.Component[P, reactLib.reactMod.ReactNs.ComponentState, _] */](
    element: reactLib.reactMod.ReactNs.CElement[P, T],
    container: scala.Null,
    callback: js.Function0[scala.Unit]
  ): T = js.native
}


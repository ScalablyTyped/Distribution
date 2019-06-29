package typings
package atReachMenuDashButtonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[T /* <: atReachMenuDashButtonLib.atReachMenuDashButtonMod.SupportedMenuLinkComponent */] extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var as: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[atReachMenuDashButtonLib.atReachMenuDashButtonMod.ResolvedMenuLinkComponent[T]] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement], scala.Unit]
  ] = js.undefined
  var setState: js.UndefOr[
    js.Function1[
      /* s */ atReachMenuDashButtonLib.atReachMenuDashButtonMod.State, 
      stdLib.Partial[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State]
    ]
  ] = js.undefined
  var state: js.UndefOr[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[T /* <: atReachMenuDashButtonLib.atReachMenuDashButtonMod.SupportedMenuLinkComponent */](
    _ref: /* node */ stdLib.HTMLElement => scala.Unit = null,
    as: java.lang.String = null,
    component: atReachMenuDashButtonLib.atReachMenuDashButtonMod.ResolvedMenuLinkComponent[T] = null,
    index: scala.Int | scala.Double = null,
    onClick: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onKeyDown: /* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    setState: /* s */ atReachMenuDashButtonLib.atReachMenuDashButtonMod.State => stdLib.Partial[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State] = null,
    state: atReachMenuDashButtonLib.atReachMenuDashButtonMod.State = null,
    style: reactLib.reactMod.CSSProperties = null,
    to: java.lang.String = null
  ): Anon_As[T] = {
    val __obj = js.Dynamic.literal()
    if (_ref != null) __obj.updateDynamic("_ref")(js.Any.fromFunction1(_ref))
    if (as != null) __obj.updateDynamic("as")(as)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_As[T]]
  }
}


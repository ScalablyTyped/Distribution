package typings
package atReachMenuDashButtonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Unit]] = js.undefined
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
  var onMouseMove: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var setState: js.UndefOr[
    js.Function1[
      /* s */ atReachMenuDashButtonLib.atReachMenuDashButtonMod.State, 
      stdLib.Partial[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State]
    ]
  ] = js.undefined
  var state: js.UndefOr[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State] = js.undefined
}

object Anon_E {
  @scala.inline
  def apply(
    _ref: /* node */ stdLib.HTMLElement => scala.Unit = null,
    index: scala.Int | scala.Double = null,
    onClick: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onKeyDown: /* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseMove: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onSelect: () => scala.Unit = null,
    role: java.lang.String = null,
    setState: /* s */ atReachMenuDashButtonLib.atReachMenuDashButtonMod.State => stdLib.Partial[atReachMenuDashButtonLib.atReachMenuDashButtonMod.State] = null,
    state: atReachMenuDashButtonLib.atReachMenuDashButtonMod.State = null
  ): Anon_E = {
    val __obj = js.Dynamic.literal()
    if (_ref != null) __obj.updateDynamic("_ref")(js.Any.fromFunction1(_ref))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (role != null) __obj.updateDynamic("role")(role)
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_E]
  }
}


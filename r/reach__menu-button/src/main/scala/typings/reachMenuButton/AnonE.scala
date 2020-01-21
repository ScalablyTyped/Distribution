package typings.reachMenuButton

import typings.reachMenuButton.mod.State
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var setState: js.UndefOr[js.Function1[/* s */ State, Partial[State]]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
}

object AnonE {
  @scala.inline
  def apply(
    _ref: /* node */ HTMLElement => Unit = null,
    index: Int | Double = null,
    onClick: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLElement] => Unit = null,
    onMouseMove: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onSelect: () => Unit = null,
    role: String = null,
    setState: /* s */ State => Partial[State] = null,
    state: State = null
  ): AnonE = {
    val __obj = js.Dynamic.literal()
    if (_ref != null) __obj.updateDynamic("_ref")(js.Any.fromFunction1(_ref))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonE]
  }
}


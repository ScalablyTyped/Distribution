package typings.atReachMenuDashButton

import typings.atReachMenuDashButton.atReachMenuDashButtonMod.ResolvedMenuLinkComponent
import typings.atReachMenuDashButton.atReachMenuDashButtonMod.State
import typings.atReachMenuDashButton.atReachMenuDashButtonMod.SupportedMenuLinkComponent
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[T /* <: SupportedMenuLinkComponent */] extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ResolvedMenuLinkComponent[T]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.undefined
  var setState: js.UndefOr[js.Function1[/* s */ State, Partial[State]]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[T /* <: SupportedMenuLinkComponent */](
    _ref: /* node */ HTMLElement => Unit = null,
    as: String = null,
    component: ResolvedMenuLinkComponent[T] = null,
    index: Int | Double = null,
    onClick: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLElement] => Unit = null,
    setState: /* s */ State => Partial[State] = null,
    state: State = null,
    style: CSSProperties = null,
    to: String = null
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


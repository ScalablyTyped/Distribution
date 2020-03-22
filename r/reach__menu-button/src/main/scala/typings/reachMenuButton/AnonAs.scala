package typings.reachMenuButton

import typings.reachMenuButton.mod.ResolvedMenuLinkComponent
import typings.reachMenuButton.mod.State
import typings.reachMenuButton.mod.SupportedMenuLinkComponent
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs[T /* <: SupportedMenuLinkComponent */] extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ResolvedMenuLinkComponent[T]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.undefined
  var setState: js.UndefOr[js.Function1[/* s */ State, PartialState]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply[T /* <: SupportedMenuLinkComponent */](
    _ref: /* node */ HTMLElement => Unit = null,
    as: String = null,
    component: ResolvedMenuLinkComponent[T] = null,
    index: Int | Double = null,
    onClick: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyDown: /* e */ KeyboardEvent[HTMLElement] => Unit = null,
    setState: /* s */ State => PartialState = null,
    state: State = null,
    style: CSSProperties = null,
    to: String = null
  ): AnonAs[T] = {
    val __obj = js.Dynamic.literal()
    if (_ref != null) __obj.updateDynamic("_ref")(js.Any.fromFunction1(_ref))
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (setState != null) __obj.updateDynamic("setState")(js.Any.fromFunction1(setState))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs[T]]
  }
}


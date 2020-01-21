package typings.qtip2.QTip2

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Events property
	 */
trait Events extends js.Object {
  var blur: js.UndefOr[EventApiFunc] = js.undefined
  var focus: js.UndefOr[EventApiFunc] = js.undefined
  var hidden: js.UndefOr[EventApiFunc] = js.undefined
  var hide: js.UndefOr[EventApiFunc] = js.undefined
  var move: js.UndefOr[EventApiFunc] = js.undefined
  var render: js.UndefOr[EventApiFunc] = js.undefined
  var show: js.UndefOr[EventApiFunc] = js.undefined
  var toggle: js.UndefOr[EventApiFunc] = js.undefined
  var visible: js.UndefOr[EventApiFunc] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    blur: (/* event */ Event_, /* api */ Api) => Unit = null,
    focus: (/* event */ Event_, /* api */ Api) => Unit = null,
    hidden: (/* event */ Event_, /* api */ Api) => Unit = null,
    hide: (/* event */ Event_, /* api */ Api) => Unit = null,
    move: (/* event */ Event_, /* api */ Api) => Unit = null,
    render: (/* event */ Event_, /* api */ Api) => Unit = null,
    show: (/* event */ Event_, /* api */ Api) => Unit = null,
    toggle: (/* event */ Event_, /* api */ Api) => Unit = null,
    visible: (/* event */ Event_, /* api */ Api) => Unit = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2(blur))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction2(hidden))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction2(hide))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction2(move))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2(show))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction2(toggle))
    if (visible != null) __obj.updateDynamic("visible")(js.Any.fromFunction2(visible))
    __obj.asInstanceOf[Events]
  }
}


package typings.qtip2.QTip2Ns

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
    blur: EventApiFunc = null,
    focus: EventApiFunc = null,
    hidden: EventApiFunc = null,
    hide: EventApiFunc = null,
    move: EventApiFunc = null,
    render: EventApiFunc = null,
    show: EventApiFunc = null,
    toggle: EventApiFunc = null,
    visible: EventApiFunc = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (move != null) __obj.updateDynamic("move")(move)
    if (render != null) __obj.updateDynamic("render")(render)
    if (show != null) __obj.updateDynamic("show")(show)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Events]
  }
}


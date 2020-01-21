package typings.reactDndTouchBackend.interfacesMod

import typings.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName extends js.Object {
  var contextmenu: js.UndefOr[typings.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu] = js.undefined
  var end: js.UndefOr[mouseup | touchend] = js.undefined
  var keydown: js.UndefOr[typings.reactDndTouchBackend.reactDndTouchBackendStrings.keydown] = js.undefined
  var move: js.UndefOr[mousemove | touchmove] = js.undefined
  var start: js.UndefOr[mousedown | touchstart] = js.undefined
}

object EventName {
  @scala.inline
  def apply(
    contextmenu: contextmenu = null,
    end: mouseup | touchend = null,
    keydown: keydown = null,
    move: mousemove | touchmove = null,
    start: mousedown | touchstart = null
  ): EventName = {
    val __obj = js.Dynamic.literal()
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(keydown.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
}


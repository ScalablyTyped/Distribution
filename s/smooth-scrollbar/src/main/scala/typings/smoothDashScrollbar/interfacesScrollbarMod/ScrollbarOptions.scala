package typings.smoothDashScrollbar.interfacesScrollbarMod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarOptions extends js.Object {
  var alwaysShowTracks: Boolean
  var continuousScrolling: Boolean
  var damping: Double
  var delegateTo: EventTarget | Null
  var plugins: js.Any
  var renderByPixels: Boolean
  var thumbMinSize: Double
  var wheelEventTarget: EventTarget | Null
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    alwaysShowTracks: Boolean,
    continuousScrolling: Boolean,
    damping: Double,
    plugins: js.Any,
    renderByPixels: Boolean,
    thumbMinSize: Double,
    delegateTo: EventTarget = null,
    wheelEventTarget: EventTarget = null
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks, continuousScrolling = continuousScrolling, damping = damping, plugins = plugins, renderByPixels = renderByPixels, thumbMinSize = thumbMinSize)
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo)
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget)
    __obj.asInstanceOf[ScrollbarOptions]
  }
}


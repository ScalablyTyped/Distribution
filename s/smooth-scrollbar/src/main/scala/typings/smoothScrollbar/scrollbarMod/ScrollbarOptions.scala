package typings.smoothScrollbar.scrollbarMod

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
    val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks.asInstanceOf[js.Any], continuousScrolling = continuousScrolling.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderByPixels = renderByPixels.asInstanceOf[js.Any], thumbMinSize = thumbMinSize.asInstanceOf[js.Any], delegateTo = delegateTo.asInstanceOf[js.Any], wheelEventTarget = wheelEventTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
}


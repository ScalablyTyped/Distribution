package typings.smoothScrollbar

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
trait PartialScrollbarOptions extends js.Object {
  var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
  var continuousScrolling: js.UndefOr[Boolean] = js.undefined
  var damping: js.UndefOr[Double] = js.undefined
  var delegateTo: js.UndefOr[EventTarget] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var renderByPixels: js.UndefOr[Boolean] = js.undefined
  var thumbMinSize: js.UndefOr[Double] = js.undefined
  var wheelEventTarget: js.UndefOr[EventTarget] = js.undefined
}

object PartialScrollbarOptions {
  @scala.inline
  def apply(
    alwaysShowTracks: js.UndefOr[Boolean] = js.undefined,
    continuousScrolling: js.UndefOr[Boolean] = js.undefined,
    damping: Int | Double = null,
    delegateTo: EventTarget = null,
    plugins: js.Any = null,
    renderByPixels: js.UndefOr[Boolean] = js.undefined,
    thumbMinSize: Int | Double = null,
    wheelEventTarget: EventTarget = null
  ): PartialScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousScrolling)) __obj.updateDynamic("continuousScrolling")(continuousScrolling.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(renderByPixels)) __obj.updateDynamic("renderByPixels")(renderByPixels.asInstanceOf[js.Any])
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollbarOptions]
  }
}


package typings.smoothScrollbar.anon

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
    damping: js.UndefOr[Double] = js.undefined,
    delegateTo: EventTarget = null,
    plugins: js.Any = null,
    renderByPixels: js.UndefOr[Boolean] = js.undefined,
    thumbMinSize: js.UndefOr[Double] = js.undefined,
    wheelEventTarget: EventTarget = null
  ): PartialScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousScrolling)) __obj.updateDynamic("continuousScrolling")(continuousScrolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(renderByPixels)) __obj.updateDynamic("renderByPixels")(renderByPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbMinSize)) __obj.updateDynamic("thumbMinSize")(thumbMinSize.get.asInstanceOf[js.Any])
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollbarOptions]
  }
}


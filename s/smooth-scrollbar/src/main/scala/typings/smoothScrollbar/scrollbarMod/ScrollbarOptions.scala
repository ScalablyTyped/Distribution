package typings.smoothScrollbar.scrollbarMod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarOptions extends js.Object {
  var alwaysShowTracks: Boolean = js.native
  var continuousScrolling: Boolean = js.native
  var damping: Double = js.native
  var delegateTo: EventTarget | Null = js.native
  var plugins: js.Any = js.native
  var renderByPixels: Boolean = js.native
  var thumbMinSize: Double = js.native
  var wheelEventTarget: EventTarget | Null = js.native
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    alwaysShowTracks: Boolean,
    continuousScrolling: Boolean,
    damping: Double,
    plugins: js.Any,
    renderByPixels: Boolean,
    thumbMinSize: Double
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks.asInstanceOf[js.Any], continuousScrolling = continuousScrolling.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderByPixels = renderByPixels.asInstanceOf[js.Any], thumbMinSize = thumbMinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
  @scala.inline
  implicit class ScrollbarOptionsOps[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysShowTracks(value: Boolean): Self = this.set("alwaysShowTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinuousScrolling(value: Boolean): Self = this.set("continuousScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderByPixels(value: Boolean): Self = this.set("renderByPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbMinSize(value: Double): Self = this.set("thumbMinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegateTo(value: EventTarget): Self = this.set("delegateTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegateToNull: Self = this.set("delegateTo", null)
    @scala.inline
    def setWheelEventTarget(value: EventTarget): Self = this.set("wheelEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheelEventTargetNull: Self = this.set("wheelEventTarget", null)
  }
  
}


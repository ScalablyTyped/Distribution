package typings.screenfull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawEventNames extends js.Object {
  val exitFullscreen: String = js.native
  val fullscreenElement: String = js.native
  val fullscreenEnabled: String = js.native
  val fullscreenchange: String = js.native
  val fullscreenerror: String = js.native
  val requestFullscreen: String = js.native
}

object RawEventNames {
  @scala.inline
  def apply(
    exitFullscreen: String,
    fullscreenElement: String,
    fullscreenEnabled: String,
    fullscreenchange: String,
    fullscreenerror: String,
    requestFullscreen: String
  ): RawEventNames = {
    val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen.asInstanceOf[js.Any], fullscreenElement = fullscreenElement.asInstanceOf[js.Any], fullscreenEnabled = fullscreenEnabled.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], requestFullscreen = requestFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEventNames]
  }
  @scala.inline
  implicit class RawEventNamesOps[Self <: RawEventNames] (val x: Self) extends AnyVal {
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
    def setExitFullscreen(value: String): Self = this.set("exitFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenElement(value: String): Self = this.set("fullscreenElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenEnabled(value: String): Self = this.set("fullscreenEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenchange(value: String): Self = this.set("fullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenerror(value: String): Self = this.set("fullscreenerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestFullscreen(value: String): Self = this.set("requestFullscreen", value.asInstanceOf[js.Any])
  }
  
}


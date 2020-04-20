package typings.screenfull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEventNames extends js.Object {
  val exitFullscreen: String
  val fullscreenElement: String
  val fullscreenEnabled: String
  val fullscreenchange: String
  val fullscreenerror: String
  val requestFullscreen: String
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
}


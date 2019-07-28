package typings.screenfull.screenfullMod

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
    val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen, fullscreenElement = fullscreenElement, fullscreenEnabled = fullscreenEnabled, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, requestFullscreen = requestFullscreen)
  
    __obj.asInstanceOf[RawEventNames]
  }
}


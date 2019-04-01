package typings
package screenfullLib.screenfullMod.screenfullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEventNames extends js.Object {
  val exitFullscreen: java.lang.String
  val fullscreenElement: java.lang.String
  val fullscreenEnabled: java.lang.String
  val fullscreenchange: java.lang.String
  val fullscreenerror: java.lang.String
  val requestFullscreen: java.lang.String
}

object RawEventNames {
  @scala.inline
  def apply(
    exitFullscreen: java.lang.String,
    fullscreenElement: java.lang.String,
    fullscreenEnabled: java.lang.String,
    fullscreenchange: java.lang.String,
    fullscreenerror: java.lang.String,
    requestFullscreen: java.lang.String
  ): RawEventNames = {
    val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen, fullscreenElement = fullscreenElement, fullscreenEnabled = fullscreenEnabled, fullscreenchange = fullscreenchange, fullscreenerror = fullscreenerror, requestFullscreen = requestFullscreen)
  
    __obj.asInstanceOf[RawEventNames]
  }
}


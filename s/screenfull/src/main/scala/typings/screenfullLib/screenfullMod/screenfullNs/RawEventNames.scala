package typings
package screenfullLib.screenfullMod.screenfullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEventNames extends js.Object {
  var exitFullscreen: java.lang.String
  var fullscreenElement: java.lang.String
  var fullscreenEnabled: java.lang.String
  var fullscreenchange: java.lang.String
  var fullscreenerror: java.lang.String
  var requestFullscreen: java.lang.String
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


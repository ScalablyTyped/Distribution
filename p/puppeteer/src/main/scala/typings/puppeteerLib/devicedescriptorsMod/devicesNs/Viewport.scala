package typings
package puppeteerLib.devicedescriptorsMod.devicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var deviceScaleFactor: scala.Double
  var hasTouch: scala.Boolean
  var height: scala.Double
  var isLandscape: scala.Boolean
  var isMobile: scala.Boolean
  var width: scala.Double
}

object Viewport {
  @scala.inline
  def apply(
    deviceScaleFactor: scala.Double,
    hasTouch: scala.Boolean,
    height: scala.Double,
    isLandscape: scala.Boolean,
    isMobile: scala.Boolean,
    width: scala.Double
  ): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor)
    __obj.updateDynamic("hasTouch")(hasTouch)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isLandscape")(isLandscape)
    __obj.updateDynamic("isMobile")(isMobile)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Viewport]
  }
}


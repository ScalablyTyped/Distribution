package typings.puppeteer.deviceDescriptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var deviceScaleFactor: Double
  var hasTouch: Boolean
  var height: Double
  var isLandscape: Boolean
  var isMobile: Boolean
  var width: Double
}

object Viewport {
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    hasTouch: Boolean,
    height: Double,
    isLandscape: Boolean,
    isMobile: Boolean,
    width: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor, hasTouch = hasTouch, height = height, isLandscape = isLandscape, isMobile = isMobile, width = width)
  
    __obj.asInstanceOf[Viewport]
  }
}


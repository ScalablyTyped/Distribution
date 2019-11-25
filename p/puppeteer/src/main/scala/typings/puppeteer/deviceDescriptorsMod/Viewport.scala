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
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Viewport]
  }
}


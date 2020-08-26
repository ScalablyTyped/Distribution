package typings.puppeteer.deviceDescriptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  var deviceScaleFactor: Double = js.native
  var hasTouch: Boolean = js.native
  var height: Double = js.native
  var isLandscape: Boolean = js.native
  var isMobile: Boolean = js.native
  var width: Double = js.native
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
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
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
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasTouch(value: Boolean): Self = this.set("hasTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


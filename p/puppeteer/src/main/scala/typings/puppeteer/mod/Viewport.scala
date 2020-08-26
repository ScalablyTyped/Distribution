package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  /**
    * Specify device scale factor (can be thought of as dpr).
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[Double] = js.native
  /**
    * Specifies if viewport supports touch events.
    * @default false
    */
  var hasTouch: js.UndefOr[Boolean] = js.native
  /** The page height in pixels. */
  var height: Double = js.native
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[Boolean] = js.native
  /**
    * Whether the `meta viewport` tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[Boolean] = js.native
  /** The page width in pixels. */
  var width: Double = js.native
}

object Viewport {
  @scala.inline
  def apply(height: Double, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceScaleFactor: Self = this.set("deviceScaleFactor", js.undefined)
    @scala.inline
    def setHasTouch(value: Boolean): Self = this.set("hasTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTouch: Self = this.set("hasTouch", js.undefined)
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLandscape: Self = this.set("isLandscape", js.undefined)
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
  }
  
}


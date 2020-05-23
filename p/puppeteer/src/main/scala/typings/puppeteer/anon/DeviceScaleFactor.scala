package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceScaleFactor extends js.Object {
  /**
    * Specify device scale factor (can be thought of as dpr).
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * Specifies if viewport supports touch events.
    * @default false
    */
  var hasTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * page height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the meta viewport tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[Boolean] = js.undefined
  /**
    * page width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object DeviceScaleFactor {
  @scala.inline
  def apply(
    deviceScaleFactor: js.UndefOr[Double] = js.undefined,
    hasTouch: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isLandscape: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): DeviceScaleFactor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceScaleFactor)) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceScaleFactor]
  }
}


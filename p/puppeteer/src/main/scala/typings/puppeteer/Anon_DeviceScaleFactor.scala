package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceScaleFactor extends js.Object {
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

object Anon_DeviceScaleFactor {
  @scala.inline
  def apply(
    deviceScaleFactor: Int | Double = null,
    hasTouch: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    isLandscape: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Anon_DeviceScaleFactor = {
    val __obj = js.Dynamic.literal()
    if (deviceScaleFactor != null) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceScaleFactor]
  }
}


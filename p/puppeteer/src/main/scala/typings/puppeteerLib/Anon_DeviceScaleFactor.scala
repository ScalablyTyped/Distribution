package typings
package puppeteerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceScaleFactor extends js.Object {
  /**
    * Specify device scale factor (can be thought of as dpr).
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies if viewport supports touch events.
    * @default false
    */
  var hasTouch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * page height in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the meta viewport tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * page width in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DeviceScaleFactor {
  @scala.inline
  def apply(
    deviceScaleFactor: scala.Int | scala.Double = null,
    hasTouch: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    isLandscape: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Anon_DeviceScaleFactor = {
    val __obj = js.Dynamic.literal()
    if (deviceScaleFactor != null) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceScaleFactor]
  }
}


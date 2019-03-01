package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
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
  /** The page height in pixels. */
  var height: scala.Double
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the `meta viewport` tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  /** The page width in pixels. */
  var width: scala.Double
}

object Viewport {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    deviceScaleFactor: scala.Int | scala.Double = null,
    hasTouch: js.UndefOr[scala.Boolean] = js.undefined,
    isLandscape: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined
  ): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (deviceScaleFactor != null) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch)
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    __obj.asInstanceOf[Viewport]
  }
}


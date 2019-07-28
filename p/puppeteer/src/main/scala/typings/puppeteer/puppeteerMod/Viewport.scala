package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
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
  /** The page height in pixels. */
  var height: Double
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the `meta viewport` tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[Boolean] = js.undefined
  /** The page width in pixels. */
  var width: Double
}

object Viewport {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    deviceScaleFactor: Int | Double = null,
    hasTouch: js.UndefOr[Boolean] = js.undefined,
    isLandscape: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined
  ): Viewport = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (deviceScaleFactor != null) __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTouch)) __obj.updateDynamic("hasTouch")(hasTouch)
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    __obj.asInstanceOf[Viewport]
  }
}


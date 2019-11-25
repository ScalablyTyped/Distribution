package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderFullscreenOptions extends js.Object {
  /**
    * Fullscreen button at top right. (default: true)
    */
  var buttonFS: js.UndefOr[Boolean] = js.undefined
  /**
    * Fullscreen functions enabled. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Force keyboard arrows nav in fullscreen. (default: true)
    */
  var keyboardNav: js.UndefOr[Boolean] = js.undefined
  /**
    * Native browser fullscreen. (default: false)
    */
  var nativeFS: js.UndefOr[Boolean] = js.undefined
}

object RoyalSliderFullscreenOptions {
  @scala.inline
  def apply(
    buttonFS: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    keyboardNav: js.UndefOr[Boolean] = js.undefined,
    nativeFS: js.UndefOr[Boolean] = js.undefined
  ): RoyalSliderFullscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttonFS)) __obj.updateDynamic("buttonFS")(buttonFS.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardNav)) __obj.updateDynamic("keyboardNav")(keyboardNav.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeFS)) __obj.updateDynamic("nativeFS")(nativeFS.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderFullscreenOptions]
  }
}


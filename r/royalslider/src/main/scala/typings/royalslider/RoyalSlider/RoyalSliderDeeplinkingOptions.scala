package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderDeeplinkingOptions extends js.Object {
  /**
    * Automatically change URL after transition and listen for hash change. (default: false)
    */
  var change: js.UndefOr[Boolean] = js.undefined
  /**
    * Linking to slides by appending #SLIDE_INDEX to url.Slides count starts from 1. If change is set to false hash is only read once, after page load. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Prefix that will be added to hash. For example if you set it to 'gallery-', hash would look like this: #gallery-5 (default: '')
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object RoyalSliderDeeplinkingOptions {
  @scala.inline
  def apply(
    change: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null
  ): RoyalSliderDeeplinkingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(change)) __obj.updateDynamic("change")(change.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderDeeplinkingOptions]
  }
}


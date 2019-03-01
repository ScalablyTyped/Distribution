package typings
package royalsliderLib.RoyalSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderVideoOptions extends js.Object {
  /**
    * Auto hide arrows when video is playing  (default: true)
    */
  var autoHideArrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto hide animated blocks when video is playing. (default: false)
    */
  var autoHideBlocks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto hide navigation when video is playing. (default: false)
    */
  var autoHideControlNav: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vimeo embed code. %id% is replaced by video id. (default: '<iframe src="http://player.vimeo.com/video/%id%?byline=0&amp;portrait=0&amp;autoplay=1" frameborder="no" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>')
    */
  var vimeoCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Youtube embed code. %id% is replaced by video id. (default: '<iframe src="http://www.youtube.com/embed/%id%?rel=1&autoplay=1&showinfo=0" frameborder="no"></iframe>')
    */
  var youTubeCode: js.UndefOr[java.lang.String] = js.undefined
}

object RoyalSliderVideoOptions {
  @scala.inline
  def apply(
    autoHideArrows: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideControlNav: js.UndefOr[scala.Boolean] = js.undefined,
    vimeoCode: java.lang.String = null,
    youTubeCode: java.lang.String = null
  ): RoyalSliderVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideArrows)) __obj.updateDynamic("autoHideArrows")(autoHideArrows)
    if (!js.isUndefined(autoHideBlocks)) __obj.updateDynamic("autoHideBlocks")(autoHideBlocks)
    if (!js.isUndefined(autoHideControlNav)) __obj.updateDynamic("autoHideControlNav")(autoHideControlNav)
    if (vimeoCode != null) __obj.updateDynamic("vimeoCode")(vimeoCode)
    if (youTubeCode != null) __obj.updateDynamic("youTubeCode")(youTubeCode)
    __obj.asInstanceOf[RoyalSliderVideoOptions]
  }
}


package typings
package royalsliderLib.RoyalSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RoyalSliderVisibleOptions extends js.Object {
  /**
           * Used for responsive design. Changes centerArea value to breakpointCenterArea when width of slider is less then value in this option. Set to 0 to disable. (default: 0)
           */
  var breakpoint: js.UndefOr[scala.Double] = js.undefined
  /**
           * Same as centerArea option, just for breakpoint. Can be changed dynamically via `sliderInstance.st.breakpointCenterArea`. (default: 0.8)
           */
  var breakpointCenterArea: js.UndefOr[scala.Double] = js.undefined
  /**
           * Alignment of center image, if you set it to false center image will be aligned to left. (default: true)
           */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Ratio that determines area of center image.For example for 0.6 - 60 % of slider area will get center image and 20% for two images on sides. (default: 0.6)
           */
  var centerArea: js.UndefOr[scala.Double] = js.undefined
  /**
           * Enable visible-nearby. (default: true)
           */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Disables navigation to next slide by clicking on current slide (if navigateByClick is true). (default: true)
           */
  var navigateByCenterClick: js.UndefOr[scala.Boolean] = js.undefined
}


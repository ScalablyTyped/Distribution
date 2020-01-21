package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardIOCommonProps extends js.Object {
  /**  true - By default, in camera view the card guide and the buttons always rotate to match the device's orientation. */
  var allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined
  /**  iOS only */
  /**  false - Set the detection mode. (iOS) */
  var detectionMode: js.UndefOr[CardIODetectionMode] = js.undefined
  /**  Alter the card guide (bracket) color. Opaque colors recommended.. */
  var guideColor: js.UndefOr[String | Double] = js.undefined
  /**  false - Hide the PayPal or card.io logo in the scan view.. */
  var hideCardIOLogo: js.UndefOr[Boolean] = js.undefined
  /**  The preferred language for all strings appearing in the user interface. */
  var languageOrLocale: js.UndefOr[String] = js.undefined
  /**  true - Set to false if you don't want the camera to try to scan the card expiration.. */
  var scanExpiry: js.UndefOr[Boolean] = js.undefined
  /**  - Set the scan instruction text. If nil, use the default text.. */
  var scanInstructions: js.UndefOr[String] = js.undefined
  /**  0.1 - How long card.io will display an image of the card with the computed card number superimposed after a successful scan. */
  var scannedImageDuration: js.UndefOr[Double] = js.undefined
  /**  false - Set to true to show the card.io logo over the camera view instead of the PayPal logo.. */
  var useCardIOLogo: js.UndefOr[Boolean] = js.undefined
}

object CardIOCommonProps {
  @scala.inline
  def apply(
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    guideColor: String | Double = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: Int | Double = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined
  ): CardIOCommonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide.asInstanceOf[js.Any])
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode.asInstanceOf[js.Any])
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo.asInstanceOf[js.Any])
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry.asInstanceOf[js.Any])
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions.asInstanceOf[js.Any])
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardIOCommonProps]
  }
}


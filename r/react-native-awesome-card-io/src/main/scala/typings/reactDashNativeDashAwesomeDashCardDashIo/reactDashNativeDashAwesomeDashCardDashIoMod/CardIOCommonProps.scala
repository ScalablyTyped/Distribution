package typings.reactDashNativeDashAwesomeDashCardDashIo.reactDashNativeDashAwesomeDashCardDashIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardIOCommonProps extends js.Object {
   // 0.1 - How long card.io will display an image of the card with the computed card number superimposed after a successful scan.
  var allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined
   // true - Set to false if you don't want the camera to try to scan the card expiration.
  // iOS only
  var detectionMode: js.UndefOr[CardIODetectionMode] = js.undefined
   // The preferred language for all strings appearing in the user interface.
  var guideColor: js.UndefOr[String] = js.undefined
   // false - Set to true to show the card.io logo over the camera view instead of the PayPal logo.
  var hideCardIOLogo: js.UndefOr[Boolean] = js.undefined
  var languageOrLocale: js.UndefOr[String] = js.undefined
   // - Set the scan instruction text. If nil, use the default text.
  var scanExpiry: js.UndefOr[Boolean] = js.undefined
   // false - Hide the PayPal or card.io logo in the scan view.
  var scanInstructions: js.UndefOr[String] = js.undefined
   // false - Set the detection mode. (iOS)
  var scannedImageDuration: js.UndefOr[Double] = js.undefined
   // Alter the card guide (bracket) color. Opaque colors recommended.
  var useCardIOLogo: js.UndefOr[Boolean] = js.undefined
}

object CardIOCommonProps {
  @scala.inline
  def apply(
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    guideColor: String = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: Int | Double = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined
  ): CardIOCommonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide)
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode)
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor)
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo)
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale)
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry)
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions)
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo)
    __obj.asInstanceOf[CardIOCommonProps]
  }
}


package typings.reactDashNativeDashAwesomeDashCardDashIo.reactDashNativeDashAwesomeDashCardDashIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardIOModuleProps extends CardIOCommonProps {
  /**  iOS Only */
  /**  false - Disable the blur of the screen when the app is backgrounded. */
  var disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.undefined
  /**  false - If true, the status bar's style will be kept as whatever your app has set it to. */
  var keepStatusBarStyle: js.UndefOr[Boolean] = js.undefined
  /**  Android Only */
  /**  false If set, the card will not be scanned with the camera. */
  var noCamera: js.UndefOr[Boolean] = js.undefined
  /**  true - Set to false if you don't need to collect the CVV from the user. */
  var requireCVV: js.UndefOr[Boolean] = js.undefined
  /**  false - Set to true if you need to collect the cardholder name. */
  var requireCardholderName: js.UndefOr[Boolean] = js.undefined
  /**  true - Set to false if you don't need to collect the card expiration. */
  var requireExpiry: js.UndefOr[Boolean] = js.undefined
  /**  false - Set to false if you need to collect the billing postal code. */
  var requirePostalCode: js.UndefOr[Boolean] = js.undefined
  /**  false - Set to true if the postal code should only collect numeric input. */
  var restrictPostalCodeToNumericOnly: js.UndefOr[Boolean] = js.undefined
  /**  false - If true, don't have the user confirm the scanned card, just return the results immediately. */
  var suppressConfirmation: js.UndefOr[Boolean] = js.undefined
  /**  false - Set to true to prevent card.io from showing its "Enter Manually" button. */
  var suppressManualEntry: js.UndefOr[Boolean] = js.undefined
  /**  false - If true, instead of displaying the image of the scanned card, present the manual entry screen with the scanned card number prefilled. */
  var suppressScannedCardImage: js.UndefOr[Boolean] = js.undefined
  /**  -1 Privacy feature. How many of the Card number digits NOT to blur on the resulting image. Setting it to 4 will blur all digits except the last four. */
  var unblurDigits: js.UndefOr[Double] = js.undefined
  /**   Default false; Use the PayPal icon in the ActionBar. */
  var usePaypalActionbarIcon: js.UndefOr[Boolean] = js.undefined
}

object CardIOModuleProps {
  @scala.inline
  def apply(
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.undefined,
    guideColor: String | Double = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    keepStatusBarStyle: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    noCamera: js.UndefOr[Boolean] = js.undefined,
    requireCVV: js.UndefOr[Boolean] = js.undefined,
    requireCardholderName: js.UndefOr[Boolean] = js.undefined,
    requireExpiry: js.UndefOr[Boolean] = js.undefined,
    requirePostalCode: js.UndefOr[Boolean] = js.undefined,
    restrictPostalCodeToNumericOnly: js.UndefOr[Boolean] = js.undefined,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: Int | Double = null,
    suppressConfirmation: js.UndefOr[Boolean] = js.undefined,
    suppressManualEntry: js.UndefOr[Boolean] = js.undefined,
    suppressScannedCardImage: js.UndefOr[Boolean] = js.undefined,
    unblurDigits: Int | Double = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    usePaypalActionbarIcon: js.UndefOr[Boolean] = js.undefined
  ): CardIOModuleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide)
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode)
    if (!js.isUndefined(disableBlurWhenBackgrounding)) __obj.updateDynamic("disableBlurWhenBackgrounding")(disableBlurWhenBackgrounding)
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo)
    if (!js.isUndefined(keepStatusBarStyle)) __obj.updateDynamic("keepStatusBarStyle")(keepStatusBarStyle)
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale)
    if (!js.isUndefined(noCamera)) __obj.updateDynamic("noCamera")(noCamera)
    if (!js.isUndefined(requireCVV)) __obj.updateDynamic("requireCVV")(requireCVV)
    if (!js.isUndefined(requireCardholderName)) __obj.updateDynamic("requireCardholderName")(requireCardholderName)
    if (!js.isUndefined(requireExpiry)) __obj.updateDynamic("requireExpiry")(requireExpiry)
    if (!js.isUndefined(requirePostalCode)) __obj.updateDynamic("requirePostalCode")(requirePostalCode)
    if (!js.isUndefined(restrictPostalCodeToNumericOnly)) __obj.updateDynamic("restrictPostalCodeToNumericOnly")(restrictPostalCodeToNumericOnly)
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry)
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions)
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressConfirmation)) __obj.updateDynamic("suppressConfirmation")(suppressConfirmation)
    if (!js.isUndefined(suppressManualEntry)) __obj.updateDynamic("suppressManualEntry")(suppressManualEntry)
    if (!js.isUndefined(suppressScannedCardImage)) __obj.updateDynamic("suppressScannedCardImage")(suppressScannedCardImage)
    if (unblurDigits != null) __obj.updateDynamic("unblurDigits")(unblurDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo)
    if (!js.isUndefined(usePaypalActionbarIcon)) __obj.updateDynamic("usePaypalActionbarIcon")(usePaypalActionbarIcon)
    __obj.asInstanceOf[CardIOModuleProps]
  }
}


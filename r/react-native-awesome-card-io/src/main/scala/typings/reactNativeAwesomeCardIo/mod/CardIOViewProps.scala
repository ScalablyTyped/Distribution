package typings.reactNativeAwesomeCardIo.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardIOViewProps extends CardIOCommonProps {
  /**  Style props of CardIOViewProps */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**  This function will be called when the CardIOView completes its work and returns a CreditCard. */
  def didScanCard(card: CardDetails): Unit
}

object CardIOViewProps {
  @scala.inline
  def apply(
    didScanCard: CardDetails => Unit,
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    guideColor: String | Double = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined
  ): CardIOViewProps = {
    val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide.get.asInstanceOf[js.Any])
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode.asInstanceOf[js.Any])
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo.get.asInstanceOf[js.Any])
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry.get.asInstanceOf[js.Any])
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions.asInstanceOf[js.Any])
    if (!js.isUndefined(scannedImageDuration)) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardIOViewProps]
  }
}


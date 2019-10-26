package typings.reactDashNativeDashAwesomeDashCardDashIo.reactDashNativeDashAwesomeDashCardDashIoMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    scannedImageDuration: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined
  ): CardIOViewProps = {
    val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide)
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode)
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo)
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale)
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry)
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions)
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo)
    __obj.asInstanceOf[CardIOViewProps]
  }
}


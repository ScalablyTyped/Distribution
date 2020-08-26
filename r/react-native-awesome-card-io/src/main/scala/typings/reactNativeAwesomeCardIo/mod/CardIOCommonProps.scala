package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardIOCommonProps extends js.Object {
  /**  true - By default, in camera view the card guide and the buttons always rotate to match the device's orientation. */
  var allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.native
  /**  iOS only */
  /**  false - Set the detection mode. (iOS) */
  var detectionMode: js.UndefOr[CardIODetectionMode] = js.native
  /**  Alter the card guide (bracket) color. Opaque colors recommended.. */
  var guideColor: js.UndefOr[String | Double] = js.native
  /**  false - Hide the PayPal or card.io logo in the scan view.. */
  var hideCardIOLogo: js.UndefOr[Boolean] = js.native
  /**  The preferred language for all strings appearing in the user interface. */
  var languageOrLocale: js.UndefOr[String] = js.native
  /**  true - Set to false if you don't want the camera to try to scan the card expiration.. */
  var scanExpiry: js.UndefOr[Boolean] = js.native
  /**  - Set the scan instruction text. If nil, use the default text.. */
  var scanInstructions: js.UndefOr[String] = js.native
  /**  0.1 - How long card.io will display an image of the card with the computed card number superimposed after a successful scan. */
  var scannedImageDuration: js.UndefOr[Double] = js.native
  /**  false - Set to true to show the card.io logo over the camera view instead of the PayPal logo.. */
  var useCardIOLogo: js.UndefOr[Boolean] = js.native
}

object CardIOCommonProps {
  @scala.inline
  def apply(): CardIOCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardIOCommonProps]
  }
  @scala.inline
  implicit class CardIOCommonPropsOps[Self <: CardIOCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowFreelyRotatingCardGuide(value: Boolean): Self = this.set("allowFreelyRotatingCardGuide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFreelyRotatingCardGuide: Self = this.set("allowFreelyRotatingCardGuide", js.undefined)
    @scala.inline
    def setDetectionMode(value: CardIODetectionMode): Self = this.set("detectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectionMode: Self = this.set("detectionMode", js.undefined)
    @scala.inline
    def setGuideColor(value: String | Double): Self = this.set("guideColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuideColor: Self = this.set("guideColor", js.undefined)
    @scala.inline
    def setHideCardIOLogo(value: Boolean): Self = this.set("hideCardIOLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCardIOLogo: Self = this.set("hideCardIOLogo", js.undefined)
    @scala.inline
    def setLanguageOrLocale(value: String): Self = this.set("languageOrLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageOrLocale: Self = this.set("languageOrLocale", js.undefined)
    @scala.inline
    def setScanExpiry(value: Boolean): Self = this.set("scanExpiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanExpiry: Self = this.set("scanExpiry", js.undefined)
    @scala.inline
    def setScanInstructions(value: String): Self = this.set("scanInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanInstructions: Self = this.set("scanInstructions", js.undefined)
    @scala.inline
    def setScannedImageDuration(value: Double): Self = this.set("scannedImageDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScannedImageDuration: Self = this.set("scannedImageDuration", js.undefined)
    @scala.inline
    def setUseCardIOLogo(value: Boolean): Self = this.set("useCardIOLogo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCardIOLogo: Self = this.set("useCardIOLogo", js.undefined)
  }
  
}


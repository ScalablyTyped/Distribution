package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardIOModuleProps extends CardIOCommonProps {
  /**  iOS Only */
  /**  false - Disable the blur of the screen when the app is backgrounded. */
  var disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.native
  /**  false - If true, the status bar's style will be kept as whatever your app has set it to. */
  var keepStatusBarStyle: js.UndefOr[Boolean] = js.native
  /**  Android Only */
  /**  false If set, the card will not be scanned with the camera. */
  var noCamera: js.UndefOr[Boolean] = js.native
  /**  true - Set to false if you don't need to collect the CVV from the user. */
  var requireCVV: js.UndefOr[Boolean] = js.native
  /**  false - Set to true if you need to collect the cardholder name. */
  var requireCardholderName: js.UndefOr[Boolean] = js.native
  /**  true - Set to false if you don't need to collect the card expiration. */
  var requireExpiry: js.UndefOr[Boolean] = js.native
  /**  false - Set to false if you need to collect the billing postal code. */
  var requirePostalCode: js.UndefOr[Boolean] = js.native
  /**  false - Set to true if the postal code should only collect numeric input. */
  var restrictPostalCodeToNumericOnly: js.UndefOr[Boolean] = js.native
  /**  false - If true, don't have the user confirm the scanned card, just return the results immediately. */
  var suppressConfirmation: js.UndefOr[Boolean] = js.native
  /**  false - Set to true to prevent card.io from showing its "Enter Manually" button. */
  var suppressManualEntry: js.UndefOr[Boolean] = js.native
  /**  false - If true, instead of displaying the image of the scanned card, present the manual entry screen with the scanned card number prefilled. */
  var suppressScannedCardImage: js.UndefOr[Boolean] = js.native
  /**  -1 Privacy feature. How many of the Card number digits NOT to blur on the resulting image. Setting it to 4 will blur all digits except the last four. */
  var unblurDigits: js.UndefOr[Double] = js.native
  /**   Default false; Use the PayPal icon in the ActionBar. */
  var usePaypalActionbarIcon: js.UndefOr[Boolean] = js.native
}

object CardIOModuleProps {
  @scala.inline
  def apply(): CardIOModuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardIOModuleProps]
  }
  @scala.inline
  implicit class CardIOModulePropsOps[Self <: CardIOModuleProps] (val x: Self) extends AnyVal {
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
    def setDisableBlurWhenBackgrounding(value: Boolean): Self = this.set("disableBlurWhenBackgrounding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBlurWhenBackgrounding: Self = this.set("disableBlurWhenBackgrounding", js.undefined)
    @scala.inline
    def setKeepStatusBarStyle(value: Boolean): Self = this.set("keepStatusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepStatusBarStyle: Self = this.set("keepStatusBarStyle", js.undefined)
    @scala.inline
    def setNoCamera(value: Boolean): Self = this.set("noCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCamera: Self = this.set("noCamera", js.undefined)
    @scala.inline
    def setRequireCVV(value: Boolean): Self = this.set("requireCVV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireCVV: Self = this.set("requireCVV", js.undefined)
    @scala.inline
    def setRequireCardholderName(value: Boolean): Self = this.set("requireCardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireCardholderName: Self = this.set("requireCardholderName", js.undefined)
    @scala.inline
    def setRequireExpiry(value: Boolean): Self = this.set("requireExpiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireExpiry: Self = this.set("requireExpiry", js.undefined)
    @scala.inline
    def setRequirePostalCode(value: Boolean): Self = this.set("requirePostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirePostalCode: Self = this.set("requirePostalCode", js.undefined)
    @scala.inline
    def setRestrictPostalCodeToNumericOnly(value: Boolean): Self = this.set("restrictPostalCodeToNumericOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictPostalCodeToNumericOnly: Self = this.set("restrictPostalCodeToNumericOnly", js.undefined)
    @scala.inline
    def setSuppressConfirmation(value: Boolean): Self = this.set("suppressConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressConfirmation: Self = this.set("suppressConfirmation", js.undefined)
    @scala.inline
    def setSuppressManualEntry(value: Boolean): Self = this.set("suppressManualEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressManualEntry: Self = this.set("suppressManualEntry", js.undefined)
    @scala.inline
    def setSuppressScannedCardImage(value: Boolean): Self = this.set("suppressScannedCardImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressScannedCardImage: Self = this.set("suppressScannedCardImage", js.undefined)
    @scala.inline
    def setUnblurDigits(value: Double): Self = this.set("unblurDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnblurDigits: Self = this.set("unblurDigits", js.undefined)
    @scala.inline
    def setUsePaypalActionbarIcon(value: Boolean): Self = this.set("usePaypalActionbarIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePaypalActionbarIcon: Self = this.set("usePaypalActionbarIcon", js.undefined)
  }
  
}


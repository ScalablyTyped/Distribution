package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDialog extends js.Object {
  /**
    * Indicates whether you would like to append the description of an available release to the
    * notification message which is displayed to the end user. Defaults to false.
    */
  var appendReleaseDescription: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the string you would like to prefix the release description with, if any, when
    * displaying the update notification to the end user. Defaults to " Description: "
    */
  var descriptionPrefix: js.UndefOr[String] = js.undefined
  /**
    * The text to use for the button the end user must press in order to install a mandatory update. Defaults to "Continue".
    */
  var mandatoryContinueButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * The text used as the body of an update notification, when the update is specified as mandatory.
    * Defaults to "An update is available that must be installed.".
    */
  var mandatoryUpdateMessage: js.UndefOr[String] = js.undefined
  /**
    * The text to use for the button the end user can press in order to ignore an optional update that is available. Defaults to "Ignore".
    */
  var optionalIgnoreButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * The text to use for the button the end user can press in order to install an optional update. Defaults to "Install".
    */
  var optionalInstallButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * The text used as the body of an update notification, when the update is optional. Defaults to "An update is available. Would you like to install it?".
    */
  var optionalUpdateMessage: js.UndefOr[String] = js.undefined
  /**
    * The text used as the header of an update notification that is displayed to the end user. Defaults to "Update available".
    */
  var title: js.UndefOr[String] = js.undefined
}

object UpdateDialog {
  @scala.inline
  def apply(
    appendReleaseDescription: js.UndefOr[Boolean] = js.undefined,
    descriptionPrefix: String = null,
    mandatoryContinueButtonLabel: String = null,
    mandatoryUpdateMessage: String = null,
    optionalIgnoreButtonLabel: String = null,
    optionalInstallButtonLabel: String = null,
    optionalUpdateMessage: String = null,
    title: String = null
  ): UpdateDialog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendReleaseDescription)) __obj.updateDynamic("appendReleaseDescription")(appendReleaseDescription.asInstanceOf[js.Any])
    if (descriptionPrefix != null) __obj.updateDynamic("descriptionPrefix")(descriptionPrefix.asInstanceOf[js.Any])
    if (mandatoryContinueButtonLabel != null) __obj.updateDynamic("mandatoryContinueButtonLabel")(mandatoryContinueButtonLabel.asInstanceOf[js.Any])
    if (mandatoryUpdateMessage != null) __obj.updateDynamic("mandatoryUpdateMessage")(mandatoryUpdateMessage.asInstanceOf[js.Any])
    if (optionalIgnoreButtonLabel != null) __obj.updateDynamic("optionalIgnoreButtonLabel")(optionalIgnoreButtonLabel.asInstanceOf[js.Any])
    if (optionalInstallButtonLabel != null) __obj.updateDynamic("optionalInstallButtonLabel")(optionalInstallButtonLabel.asInstanceOf[js.Any])
    if (optionalUpdateMessage != null) __obj.updateDynamic("optionalUpdateMessage")(optionalUpdateMessage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDialog]
  }
}


package typings.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDialog extends js.Object {
  
  /**
    * Indicates whether you would like to append the description of an available release to the
    * notification message which is displayed to the end user. Defaults to false.
    */
  var appendReleaseDescription: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the string you would like to prefix the release description with, if any, when
    * displaying the update notification to the end user. Defaults to " Description: "
    */
  var descriptionPrefix: js.UndefOr[String] = js.native
  
  /**
    * The text to use for the button the end user must press in order to install a mandatory update. Defaults to "Continue".
    */
  var mandatoryContinueButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * The text used as the body of an update notification, when the update is specified as mandatory.
    * Defaults to "An update is available that must be installed.".
    */
  var mandatoryUpdateMessage: js.UndefOr[String] = js.native
  
  /**
    * The text to use for the button the end user can press in order to ignore an optional update that is available. Defaults to "Ignore".
    */
  var optionalIgnoreButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * The text to use for the button the end user can press in order to install an optional update. Defaults to "Install".
    */
  var optionalInstallButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * The text used as the body of an update notification, when the update is optional. Defaults to "An update is available. Would you like to install it?".
    */
  var optionalUpdateMessage: js.UndefOr[String] = js.native
  
  /**
    * The text used as the header of an update notification that is displayed to the end user. Defaults to "Update available".
    */
  var title: js.UndefOr[String] = js.native
}
object UpdateDialog {
  
  @scala.inline
  def apply(): UpdateDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDialog]
  }
  
  @scala.inline
  implicit class UpdateDialogOps[Self <: UpdateDialog] (val x: Self) extends AnyVal {
    
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
    def setAppendReleaseDescription(value: Boolean): Self = this.set("appendReleaseDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendReleaseDescription: Self = this.set("appendReleaseDescription", js.undefined)
    
    @scala.inline
    def setDescriptionPrefix(value: String): Self = this.set("descriptionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionPrefix: Self = this.set("descriptionPrefix", js.undefined)
    
    @scala.inline
    def setMandatoryContinueButtonLabel(value: String): Self = this.set("mandatoryContinueButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatoryContinueButtonLabel: Self = this.set("mandatoryContinueButtonLabel", js.undefined)
    
    @scala.inline
    def setMandatoryUpdateMessage(value: String): Self = this.set("mandatoryUpdateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatoryUpdateMessage: Self = this.set("mandatoryUpdateMessage", js.undefined)
    
    @scala.inline
    def setOptionalIgnoreButtonLabel(value: String): Self = this.set("optionalIgnoreButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalIgnoreButtonLabel: Self = this.set("optionalIgnoreButtonLabel", js.undefined)
    
    @scala.inline
    def setOptionalInstallButtonLabel(value: String): Self = this.set("optionalInstallButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalInstallButtonLabel: Self = this.set("optionalInstallButtonLabel", js.undefined)
    
    @scala.inline
    def setOptionalUpdateMessage(value: String): Self = this.set("optionalUpdateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalUpdateMessage: Self = this.set("optionalUpdateMessage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

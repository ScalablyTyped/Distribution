package typings.reactNativeGoby.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDialog extends StObject {
  
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
  
  inline def apply(): UpdateDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDialog]
  }
  
  extension [Self <: UpdateDialog](x: Self) {
    
    inline def setAppendReleaseDescription(value: Boolean): Self = StObject.set(x, "appendReleaseDescription", value.asInstanceOf[js.Any])
    
    inline def setAppendReleaseDescriptionUndefined: Self = StObject.set(x, "appendReleaseDescription", js.undefined)
    
    inline def setDescriptionPrefix(value: String): Self = StObject.set(x, "descriptionPrefix", value.asInstanceOf[js.Any])
    
    inline def setDescriptionPrefixUndefined: Self = StObject.set(x, "descriptionPrefix", js.undefined)
    
    inline def setMandatoryContinueButtonLabel(value: String): Self = StObject.set(x, "mandatoryContinueButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setMandatoryContinueButtonLabelUndefined: Self = StObject.set(x, "mandatoryContinueButtonLabel", js.undefined)
    
    inline def setMandatoryUpdateMessage(value: String): Self = StObject.set(x, "mandatoryUpdateMessage", value.asInstanceOf[js.Any])
    
    inline def setMandatoryUpdateMessageUndefined: Self = StObject.set(x, "mandatoryUpdateMessage", js.undefined)
    
    inline def setOptionalIgnoreButtonLabel(value: String): Self = StObject.set(x, "optionalIgnoreButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setOptionalIgnoreButtonLabelUndefined: Self = StObject.set(x, "optionalIgnoreButtonLabel", js.undefined)
    
    inline def setOptionalInstallButtonLabel(value: String): Self = StObject.set(x, "optionalInstallButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setOptionalInstallButtonLabelUndefined: Self = StObject.set(x, "optionalInstallButtonLabel", js.undefined)
    
    inline def setOptionalUpdateMessage(value: String): Self = StObject.set(x, "optionalUpdateMessage", value.asInstanceOf[js.Any])
    
    inline def setOptionalUpdateMessageUndefined: Self = StObject.set(x, "optionalUpdateMessage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

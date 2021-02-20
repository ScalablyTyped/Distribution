package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareDialog {
  
  /**
    * Check if the dialog can be shown.
    */
  @JSImport("react-native-fbsdk", "ShareDialog.canShow")
  @js.native
  def canShow(shareContent: ShareContent): js.Promise[Boolean] = js.native
  
  /**
    * Sets the mode for the share dialog.
    */
  @JSImport("react-native-fbsdk", "ShareDialog.setMode")
  @js.native
  def setMode(mode: ShareDialogMode): Unit = js.native
  
  /**
    * Sets whether or not the native share dialog should fail when it encounters a data error.
    */
  @JSImport("react-native-fbsdk", "ShareDialog.setShouldFailOnDataError")
  @js.native
  def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = js.native
  
  /**
    * Shows the dialog using the specified content.
    */
  @JSImport("react-native-fbsdk", "ShareDialog.show")
  @js.native
  def show(shareContent: ShareContent): js.Promise[_] = js.native
}

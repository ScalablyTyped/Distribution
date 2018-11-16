package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "ShareDialog")
@js.native
object ShareDialogNs extends js.Object {
  /**
       * Check if the dialog can be shown.
       */
  def canShow(shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Sets the mode for the share dialog.
       */
  def setMode(mode: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareDialogMode): scala.Unit = js.native
  /**
       * Sets whether or not the native share dialog should fail when it encounters a data error.
       */
  def setShouldFailOnDataError(shouldFailOnDataError: scala.Boolean): scala.Unit = js.native
  /**
       * Shows the dialog using the specified content.
       */
  def show(shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent): stdLib.Promise[_] = js.native
}


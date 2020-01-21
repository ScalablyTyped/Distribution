package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "MessageDialog")
@js.native
object MessageDialog extends js.Object {
  /**
    * Check if the dialog can be shown.
    */
  def canShow(shareContent: ShareContent): js.Promise[Boolean] = js.native
  /**
    * Sets whether or not the native message dialog should fail when it encounters a data error.
    */
  def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = js.native
  /**
    * Shows the dialog using the specified content.
    */
  def show(shareContent: ShareContent): js.Promise[_] = js.native
}


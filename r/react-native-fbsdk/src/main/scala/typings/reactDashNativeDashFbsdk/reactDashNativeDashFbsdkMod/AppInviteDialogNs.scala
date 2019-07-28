package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "AppInviteDialog")
@js.native
object AppInviteDialogNs extends js.Object {
  /**
    * Check if the dialog can be shown.
    */
  def canShow(): js.Promise[_] = js.native
  /**
    * Shows the dialog using the specified content.
    */
  def show(appInviteContent: AppInviteContent): js.Promise[_] = js.native
}


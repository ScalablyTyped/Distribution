package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "ShareApi")
@js.native
object ShareApiNs extends js.Object {
  /**
       * Check if the content can be shared via share api.
       */
  def canShare(shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent): stdLib.Promise[scala.Boolean] = js.native
  /**
       * For iOS only, creates a User Owned Open Graph object without an action.
       * NOTE: Only one share action can be performed at a time.
       * @platform ios
       */
  def createOpenGraphObject(openGraphObject: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareOpenGraphObject): stdLib.Promise[_] = js.native
  /**
       * Shares the specified content with a message.
       * NOTE: Only one share action can be performed at a time.
       */
  def share(
    shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent,
    graphNode: java.lang.String,
    message: java.lang.String
  ): stdLib.Promise[_] = js.native
}


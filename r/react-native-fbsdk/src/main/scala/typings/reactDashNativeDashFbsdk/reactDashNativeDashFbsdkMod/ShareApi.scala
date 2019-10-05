package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "ShareApi")
@js.native
object ShareApi extends js.Object {
  /**
    * Check if the content can be shared via share api.
    */
  def canShare(shareContent: ShareContent): js.Promise[Boolean] = js.native
  /**
    * For iOS only, creates a User Owned Open Graph object without an action.
    * NOTE: Only one share action can be performed at a time.
    * @platform ios
    */
  def createOpenGraphObject(openGraphObject: ShareOpenGraphObject): js.Promise[_] = js.native
  /**
    * Shares the specified content with a message.
    * NOTE: Only one share action can be performed at a time.
    */
  def share(shareContent: ShareContent, graphNode: String, message: String): js.Promise[_] = js.native
}


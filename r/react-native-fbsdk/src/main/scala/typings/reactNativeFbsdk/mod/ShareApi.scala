package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareApi {
  
  /**
    * Check if the content can be shared via share api.
    */
  @JSImport("react-native-fbsdk", "ShareApi.canShare")
  @js.native
  def canShare(shareContent: ShareContent): js.Promise[Boolean] = js.native
  
  /**
    * For iOS only, creates a User Owned Open Graph object without an action.
    * NOTE: Only one share action can be performed at a time.
    * @platform ios
    */
  @JSImport("react-native-fbsdk", "ShareApi.createOpenGraphObject")
  @js.native
  def createOpenGraphObject(openGraphObject: ShareOpenGraphObject): js.Promise[_] = js.native
  
  /**
    * Shares the specified content with a message.
    * NOTE: Only one share action can be performed at a time.
    */
  @JSImport("react-native-fbsdk", "ShareApi.share")
  @js.native
  def share(shareContent: ShareContent, graphNode: String, message: String): js.Promise[_] = js.native
}

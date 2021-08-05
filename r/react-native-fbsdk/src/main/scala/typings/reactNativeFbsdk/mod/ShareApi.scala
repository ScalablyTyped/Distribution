package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareApi {
  
  @JSImport("react-native-fbsdk", "ShareApi")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the content can be shared via share api.
    */
  inline def canShare(shareContent: ShareContent): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canShare")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * For iOS only, creates a User Owned Open Graph object without an action.
    * NOTE: Only one share action can be performed at a time.
    * @platform ios
    */
  inline def createOpenGraphObject(openGraphObject: ShareOpenGraphObject): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOpenGraphObject")(openGraphObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Shares the specified content with a message.
    * NOTE: Only one share action can be performed at a time.
    */
  inline def share(shareContent: ShareContent, graphNode: String, message: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("share")(shareContent.asInstanceOf[js.Any], graphNode.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}

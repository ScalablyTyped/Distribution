package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageDialog {
  
  @JSImport("react-native-fbsdk", "MessageDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the dialog can be shown.
    */
  @scala.inline
  def canShow(shareContent: ShareContent): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canShow")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Sets whether or not the native message dialog should fail when it encounters a data error.
    */
  @scala.inline
  def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldFailOnDataError")(shouldFailOnDataError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows the dialog using the specified content.
    */
  @scala.inline
  def show(shareContent: ShareContent): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}

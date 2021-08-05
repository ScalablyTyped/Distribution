package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareDialog {
  
  @JSImport("react-native-fbsdk", "ShareDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the dialog can be shown.
    */
  inline def canShow(shareContent: ShareContent): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canShow")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Sets the mode for the share dialog.
    */
  inline def setMode(mode: ShareDialogMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets whether or not the native share dialog should fail when it encounters a data error.
    */
  inline def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldFailOnDataError")(shouldFailOnDataError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows the dialog using the specified content.
    */
  inline def show(shareContent: ShareContent): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}

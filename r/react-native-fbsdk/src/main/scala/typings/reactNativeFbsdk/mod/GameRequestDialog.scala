package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GameRequestDialog {
  
  @JSImport("react-native-fbsdk", "GameRequestDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the dialog can be shown.
    */
  inline def canShow(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("canShow")().asInstanceOf[js.Promise[Any]]
  
  /**
    * Shows the dialog using the specified content.
    */
  inline def show(gameRequestContent: GameRequestContent): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(gameRequestContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}

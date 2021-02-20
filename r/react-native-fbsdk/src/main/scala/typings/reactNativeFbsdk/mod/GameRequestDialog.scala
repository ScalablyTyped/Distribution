package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GameRequestDialog {
  
  /**
    * Check if the dialog can be shown.
    */
  @JSImport("react-native-fbsdk", "GameRequestDialog.canShow")
  @js.native
  def canShow(): js.Promise[_] = js.native
  
  /**
    * Shows the dialog using the specified content.
    */
  @JSImport("react-native-fbsdk", "GameRequestDialog.show")
  @js.native
  def show(gameRequestContent: GameRequestContent): js.Promise[_] = js.native
}

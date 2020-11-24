package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fbsdk", "GameRequestDialog")
@js.native
object GameRequestDialog extends js.Object {
  
  /**
    * Check if the dialog can be shown.
    */
  def canShow(): js.Promise[_] = js.native
  
  /**
    * Shows the dialog using the specified content.
    */
  def show(gameRequestContent: GameRequestContent): js.Promise[_] = js.native
}

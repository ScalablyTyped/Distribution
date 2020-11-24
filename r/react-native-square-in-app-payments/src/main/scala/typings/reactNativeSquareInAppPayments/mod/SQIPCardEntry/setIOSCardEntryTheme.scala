package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCardEntry.setIOSCardEntryTheme")
@js.native
object setIOSCardEntryTheme extends js.Object {
  
  /**
    * Sets the customization theme for the card entry view controller in the native layer.
    * It is not necessary to call this method before starting Apple Pay. The SDK provides a default theme which can be customized to match the theme of your app.
    * @platform IOS
    * @param themeConfiguration - An object that defines the theme of an iOS card entry view controller.
    */
  def apply(themeConfiguration: ThemeIOS): js.Promise[Unit] = js.native
}

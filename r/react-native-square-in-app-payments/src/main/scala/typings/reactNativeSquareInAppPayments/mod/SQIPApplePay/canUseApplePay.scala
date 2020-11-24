package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPApplePay.canUseApplePay")
@js.native
object canUseApplePay extends js.Object {
  
  /**
    * Returns true if the device supports Apple Pay and the user has added at least one card that Square supports.
    * Not all brands supported by Apple Pay are supported by Square.
    * @platform IOS
    */
  def apply(): js.Promise[Boolean] = js.native
}

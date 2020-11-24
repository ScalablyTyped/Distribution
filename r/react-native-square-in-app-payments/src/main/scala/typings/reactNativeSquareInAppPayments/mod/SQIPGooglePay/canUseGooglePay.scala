package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPGooglePay.canUseGooglePay")
@js.native
object canUseGooglePay extends js.Object {
  
  /**
    * Returns true if the device supports Google Pay and the user has added at least one card that Square supports.
    * Square doesn't support all the brands apple pay supports.
    * @platform Android
    * @throws ex
    */
  def apply(): js.Promise[Boolean] = js.native
}

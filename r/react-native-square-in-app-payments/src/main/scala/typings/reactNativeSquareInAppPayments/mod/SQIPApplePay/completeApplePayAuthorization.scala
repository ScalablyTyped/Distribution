package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPApplePay.completeApplePayAuthorization")
@js.native
object completeApplePayAuthorization extends js.Object {
  
  /**
    * Notifies the native layer to close the Apple Pay sheet with success or failure status.
    * @platform IOS
    * @param isSuccess - Indicates success or failure.
    * @param [errorMessage] - The error message that Apple Pay displays in the native layer card entry view controller.
    * @throws ex
    */
  def apply(isSuccess: Boolean): js.Promise[Unit] = js.native
  def apply(isSuccess: Boolean, errorMessage: String): js.Promise[Unit] = js.native
}

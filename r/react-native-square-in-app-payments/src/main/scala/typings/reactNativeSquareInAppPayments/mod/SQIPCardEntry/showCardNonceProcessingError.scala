package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCardEntry.showCardNonceProcessingError")
@js.native
object showCardNonceProcessingError extends js.Object {
  
  /**
    * Called in the `onCardNonceRequestSuccess` callback. Returns execution to the card entry form with an error string to be shown in the form.
    * `showCardNonceProcessingError` should be called after all other callback logic is executed.
    * If callback logic makes a server call to request a payment with the supplied nonce, this method is called after getting an error response from the server call.
    * @param errorMessage - The error message to be shown in the card entry form.
    */
  def apply(errorMessage: String): js.Promise[Unit] = js.native
}

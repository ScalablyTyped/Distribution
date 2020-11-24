package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCardEntry.completeCardEntry")
@js.native
object completeCardEntry extends js.Object {
  
  /**
    * Called in the `onCardNonceRequestSuccess` callback. Closes the card entry form.
    * `completeCardEntry` should be called after all other callback logic is executed.
    * If callback logic makes a server call to process the supplied nonce, this method is called after getting a success response from the server.
    * If any nonce processing logic is to be executed after the card entry form is closed,
    * call completeCardEntry after getting the card nonce from the `onCardNonceRequestSuccess` cardDetails parameter.
    * @param onCardEntryComplete - The callback invoked when card entry is completed and is closed.
    */
  def apply(onCardEntryComplete: CardEntryCompleteCallback): js.Promise[Unit] = js.native
}

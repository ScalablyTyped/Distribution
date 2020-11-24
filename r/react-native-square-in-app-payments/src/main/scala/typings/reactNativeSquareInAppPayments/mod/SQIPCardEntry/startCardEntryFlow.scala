package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCardEntry.startCardEntryFlow")
@js.native
object startCardEntryFlow extends js.Object {
  
  def apply(
    cardEntryConfig: Null,
    onCardNonceRequestSuccess: CardEntryNonceRequestSuccessCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = js.native
  // Functions
  /**
    * Displays a full-screen card entry view.
    * The method takes one configuration object and two call back parameters which correspond to the possible results of the request.
    * @param cardEntryConfig - Configuration object for card entry behavior, pass null for default configuration
    * @param onCardNonceRequestSuccess - Invoked when card entry is completed and the SDK has processed the payment card information.
    * @param onCardEntryCancel - Invoked when card entry is canceled.
    */
  def apply(
    cardEntryConfig: CardEntryConfig,
    onCardNonceRequestSuccess: CardEntryNonceRequestSuccessCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = js.native
}

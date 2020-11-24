package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCardEntry.startCardEntryFlowWithBuyerVerification")
@js.native
object startCardEntryFlowWithBuyerVerification extends js.Object {
  
  def apply(
    cardEntryConfig: Null,
    onBuyerVerificationSuccess: BuyerVerificationSuccessCallback,
    onBuyerVerificationFailure: BuyerVerificationErrorCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = js.native
  /**
    * Displays a full-screen card entry view with buyer verification flow enabled.
    * The method takes one configuration object and three call back parameters which correspond to the possible results of the request
    * @param cardEntryConfig - Configuration object for card entry behavior, pass null for default configuration
    * @param onBuyerVerificationSuccess - Invoked when card entry with buyer verification is completed successfully.
    * @param onBuyerVerificationFailure - Invoked when card entry with buyer verification encounters errors.
    * @param onCardEntryCancel - Invoked when card entry is canceled.
    */
  def apply(
    cardEntryConfig: CardEntryConfig,
    onBuyerVerificationSuccess: BuyerVerificationSuccessCallback,
    onBuyerVerificationFailure: BuyerVerificationErrorCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = js.native
}

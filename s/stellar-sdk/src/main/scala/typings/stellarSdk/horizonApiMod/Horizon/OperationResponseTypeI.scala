package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationResponseTypeI extends js.Object

@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseTypeI")
@js.native
object OperationResponseTypeI extends js.Object {
  @js.native
  sealed trait accountMerge extends OperationResponseTypeI
  
  @js.native
  sealed trait allowTrust extends OperationResponseTypeI
  
  @js.native
  sealed trait bumpSequence extends OperationResponseTypeI
  
  @js.native
  sealed trait changeTrust extends OperationResponseTypeI
  
  @js.native
  sealed trait createAccount extends OperationResponseTypeI
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseTypeI
  
  @js.native
  sealed trait inflation extends OperationResponseTypeI
  
  @js.native
  sealed trait manageBuyOffer extends OperationResponseTypeI
  
  @js.native
  sealed trait manageData extends OperationResponseTypeI
  
  @js.native
  sealed trait manageOffer extends OperationResponseTypeI
  
  @js.native
  sealed trait pathPayment extends OperationResponseTypeI
  
  @js.native
  sealed trait pathPaymentStrictSend extends OperationResponseTypeI
  
  @js.native
  sealed trait payment extends OperationResponseTypeI
  
  @js.native
  sealed trait setOptions extends OperationResponseTypeI
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationResponseTypeI with Double] = js.native
  /* 8 */ @js.native
  object accountMerge extends TopLevel[accountMerge with Double]
  
  /* 7 */ @js.native
  object allowTrust extends TopLevel[allowTrust with Double]
  
  /* 11 */ @js.native
  object bumpSequence extends TopLevel[bumpSequence with Double]
  
  /* 6 */ @js.native
  object changeTrust extends TopLevel[changeTrust with Double]
  
  /* 0 */ @js.native
  object createAccount extends TopLevel[createAccount with Double]
  
  /* 3 */ @js.native
  object createPassiveOffer extends TopLevel[createPassiveOffer with Double]
  
  /* 9 */ @js.native
  object inflation extends TopLevel[inflation with Double]
  
  /* 12 */ @js.native
  object manageBuyOffer extends TopLevel[manageBuyOffer with Double]
  
  /* 10 */ @js.native
  object manageData extends TopLevel[manageData with Double]
  
  /* 4 */ @js.native
  object manageOffer extends TopLevel[manageOffer with Double]
  
  /* 2 */ @js.native
  object pathPayment extends TopLevel[pathPayment with Double]
  
  /* 13 */ @js.native
  object pathPaymentStrictSend extends TopLevel[pathPaymentStrictSend with Double]
  
  /* 1 */ @js.native
  object payment extends TopLevel[payment with Double]
  
  /* 5 */ @js.native
  object setOptions extends TopLevel[setOptions with Double]
  
}


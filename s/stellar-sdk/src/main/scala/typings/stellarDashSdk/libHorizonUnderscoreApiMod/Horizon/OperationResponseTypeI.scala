package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

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
  sealed trait manageData extends OperationResponseTypeI
  
  @js.native
  sealed trait manageOffer extends OperationResponseTypeI
  
  @js.native
  sealed trait pathPayment extends OperationResponseTypeI
  
  @js.native
  sealed trait payment extends OperationResponseTypeI
  
  @js.native
  sealed trait setOptions extends OperationResponseTypeI
  
  /* 8 */ val accountMerge: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.accountMerge with Double = js.native
  /* 7 */ val allowTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.allowTrust with Double = js.native
  /* 11 */ val bumpSequence: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.bumpSequence with Double = js.native
  /* 6 */ val changeTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.changeTrust with Double = js.native
  /* 0 */ val createAccount: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createAccount with Double = js.native
  /* 3 */ val createPassiveOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createPassiveOffer with Double = js.native
  /* 9 */ val inflation: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.inflation with Double = js.native
  /* 10 */ val manageData: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageData with Double = js.native
  /* 4 */ val manageOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageOffer with Double = js.native
  /* 2 */ val pathPayment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.pathPayment with Double = js.native
  /* 1 */ val payment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.payment with Double = js.native
  /* 5 */ val setOptions: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.setOptions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationResponseTypeI with Double] = js.native
}


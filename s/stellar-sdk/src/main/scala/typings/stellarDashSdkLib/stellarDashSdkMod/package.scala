package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stellarDashSdkMod {
  type CallCollectionFunction[T /* <: Record */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    stdLib.Promise[CollectionRecord[T]]
  ]
  type CallFunction[T /* <: Record */] = js.Function0[stdLib.Promise[T]]
  type OperationRecord = CreateAccountOperationRecord | PaymentOperationRecord | PathPaymentOperationRecord | ManageOfferOperationRecord | PassiveOfferOperationRecord | SetOptionsOperationRecord | ChangeTrustOperationRecord | AllowTrustOperationRecord | AccountMergeOperationRecord | InflationOperationRecord | ManageDataOperationRecord | BumpSequenceOperationRecord
  type TransactionOperation = stellarDashSdkLib.stellarDashSdkMod.OperationNs.CreateAccount | stellarDashSdkLib.stellarDashSdkMod.OperationNs.Payment | stellarDashSdkLib.stellarDashSdkMod.OperationNs.PathPayment | stellarDashSdkLib.stellarDashSdkMod.OperationNs.CreatePassiveOffer | stellarDashSdkLib.stellarDashSdkMod.OperationNs.ManageOffer | stellarDashSdkLib.stellarDashSdkMod.OperationNs.SetOptions | stellarDashSdkLib.stellarDashSdkMod.OperationNs.ChangeTrust | stellarDashSdkLib.stellarDashSdkMod.OperationNs.AllowTrust | stellarDashSdkLib.stellarDashSdkMod.OperationNs.AccountMerge | stellarDashSdkLib.stellarDashSdkMod.OperationNs.Inflation | stellarDashSdkLib.stellarDashSdkMod.OperationNs.ManageData | stellarDashSdkLib.stellarDashSdkMod.OperationNs.BumpSequence
}

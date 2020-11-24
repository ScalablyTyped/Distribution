package typings.stellarSdk.mod

import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.TransactionBuilder.TransactionBuilderOptions
import typings.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
class TransactionBuilder protected ()
  extends typings.stellarBase.mod.TransactionBuilder {
  def this(sourceAccount: typings.stellarBase.mod.Account) = this()
  def this(sourceAccount: typings.stellarBase.mod.Account, options: TransactionBuilderOptions) = this()
}
/* static members */
@JSImport("stellar-sdk", "TransactionBuilder")
@js.native
object TransactionBuilder extends js.Object {
  
  def buildFeeBumpTransaction(
    feeSource: typings.stellarBase.mod.Keypair,
    baseFee: String,
    innerTx: typings.stellarBase.mod.Transaction[
      typings.stellarBase.mod.Memo[MemoType], 
      js.Array[typings.stellarBase.mod.Operation]
    ],
    networkPassphrase: String
  ): typings.stellarBase.mod.FeeBumpTransaction = js.native
  
  def fromXDR(envelope: String, networkPassphrase: String): (typings.stellarBase.mod.Transaction[
    typings.stellarBase.mod.Memo[MemoType], 
    js.Array[typings.stellarBase.mod.Operation]
  ]) | typings.stellarBase.mod.FeeBumpTransaction = js.native
  def fromXDR(envelope: TransactionEnvelope, networkPassphrase: String): (typings.stellarBase.mod.Transaction[
    typings.stellarBase.mod.Memo[MemoType], 
    js.Array[typings.stellarBase.mod.Operation]
  ]) | typings.stellarBase.mod.FeeBumpTransaction = js.native
}

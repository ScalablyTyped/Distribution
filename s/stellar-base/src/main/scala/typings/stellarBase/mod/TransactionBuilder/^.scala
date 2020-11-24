package typings.stellarBase.mod.TransactionBuilder

import typings.stellarBase.mod.FeeBumpTransaction
import typings.stellarBase.mod.Keypair
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import typings.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "TransactionBuilder")
@js.native
object ^ extends js.Object {
  
  def buildFeeBumpTransaction(
    feeSource: Keypair,
    baseFee: String,
    innerTx: Transaction[Memo[MemoType], js.Array[Operation]],
    networkPassphrase: String
  ): FeeBumpTransaction = js.native
  
  def fromXDR(envelope: String, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
  def fromXDR(envelope: TransactionEnvelope, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
}

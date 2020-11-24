package typings.stellarSdk

import typings.stellarBase.mod.FeeBumpTransaction
import typings.stellarBase.mod.Keypair
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import typings.stellarSdk.anon.ClientAccountID
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  @js.native
  object Utils extends js.Object {
    
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      homeDomain: String,
      timeout: js.UndefOr[scala.Nothing],
      networkPassphrase: String
    ): String = js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      homeDomain: String,
      timeout: Double,
      networkPassphrase: String
    ): String = js.native
    
    def gatherTxSigners(transaction: FeeBumpTransaction, signers: js.Array[String]): js.Array[String] = js.native
    def gatherTxSigners(transaction: Transaction[Memo[MemoType], js.Array[Operation]], signers: js.Array[String]): js.Array[String] = js.native
    
    def readChallengeTx(challengeTx: String, serverAccountID: String, networkPassphrase: String, homeDomains: String): ClientAccountID = js.native
    def readChallengeTx(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      homeDomains: js.Array[String]
    ): ClientAccountID = js.native
    
    def verifyChallengeTxSigners(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      signers: js.Array[String],
      homeDomains: String
    ): js.Array[String] = js.native
    def verifyChallengeTxSigners(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      signers: js.Array[String],
      homeDomains: js.Array[String]
    ): js.Array[String] = js.native
    
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners],
      homeDomains: String
    ): js.Array[String] = js.native
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners],
      homeDomains: js.Array[String]
    ): js.Array[String] = js.native
    
    def verifyTxSignedBy(transaction: FeeBumpTransaction, accountID: String): Boolean = js.native
    def verifyTxSignedBy(transaction: Transaction[Memo[MemoType], js.Array[Operation]], accountID: String): Boolean = js.native
  }
}

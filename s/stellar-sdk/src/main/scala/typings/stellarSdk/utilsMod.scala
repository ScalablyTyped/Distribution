package typings.stellarSdk

import typings.stellarBase.mod.Keypair
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import typings.stellarSdk.anon.ClientAccountID
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  object Utils extends js.Object {
    def buildChallengeTx(serverKeypair: Keypair, clientAccountID: String, anchorName: String): String = js.native
    def buildChallengeTx(serverKeypair: Keypair, clientAccountID: String, anchorName: String, timeout: Double): String = js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      anchorName: String,
      timeout: Double,
      networkPassphrase: String
    ): String = js.native
    def gatherTxSigners(transaction: Transaction[Memo[MemoType], js.Array[Operation]], signers: js.Array[String]): js.Array[String] = js.native
    def readChallengeTx(challengeTx: String, serverAccountId: String): ClientAccountID = js.native
    def readChallengeTx(challengeTx: String, serverAccountId: String, networkPassphrase: String): ClientAccountID = js.native
    def verifyChallengeTx(challengeTx: String, serverAccountId: String): Boolean = js.native
    def verifyChallengeTx(challengeTx: String, serverAccountId: String, networkPassphrase: String): Boolean = js.native
    def verifyChallengeTxSigners(challengeTx: String, serverAccountID: String, networkPassphrase: String, signers: js.Array[String]): js.Array[String] = js.native
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners]
    ): js.Array[String] = js.native
    def verifyTxSignedBy(transaction: Transaction[Memo[MemoType], js.Array[Operation]], accountID: String): Boolean = js.native
  }
  
}


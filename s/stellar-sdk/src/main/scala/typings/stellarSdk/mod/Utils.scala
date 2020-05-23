package typings.stellarSdk.mod

import typings.stellarBase.mod.MemoType
import typings.stellarSdk.anon.ClientAccountID
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Utils")
@js.native
object Utils extends js.Object {
  def buildChallengeTx(serverKeypair: typings.stellarBase.mod.Keypair, clientAccountID: String, anchorName: String): String = js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarBase.mod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double
  ): String = js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarBase.mod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double,
    networkPassphrase: String
  ): String = js.native
  def gatherTxSigners(
    transaction: typings.stellarBase.mod.Transaction[
      typings.stellarBase.mod.Memo[MemoType], 
      js.Array[typings.stellarBase.mod.Operation]
    ],
    signers: js.Array[String]
  ): js.Array[String] = js.native
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
  def verifyTxSignedBy(
    transaction: typings.stellarBase.mod.Transaction[
      typings.stellarBase.mod.Memo[MemoType], 
      js.Array[typings.stellarBase.mod.Operation]
    ],
    accountID: String
  ): Boolean = js.native
}


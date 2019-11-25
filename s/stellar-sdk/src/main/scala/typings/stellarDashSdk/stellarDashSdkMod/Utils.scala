package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashBase.stellarDashBaseMod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Utils")
@js.native
object Utils extends js.Object {
  def buildChallengeTx(
    serverKeypair: typings.stellarDashBase.stellarDashBaseMod.Keypair,
    clientAccountID: String,
    anchorName: String
  ): String = js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarDashBase.stellarDashBaseMod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double
  ): String = js.native
  def buildChallengeTx(
    serverKeypair: typings.stellarDashBase.stellarDashBaseMod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double,
    networkPassphrase: String
  ): String = js.native
  def verifyChallengeTx(challengeTx: String, serverAccountId: String): Boolean = js.native
  def verifyChallengeTx(challengeTx: String, serverAccountId: String, networkPassphrase: String): Boolean = js.native
  def verifyTxSignedBy(
    transaction: typings.stellarDashBase.stellarDashBaseMod.Transaction[
      typings.stellarDashBase.stellarDashBaseMod.Memo[MemoType], 
      js.Array[typings.stellarDashBase.stellarDashBaseMod.Operation]
    ],
    accountId: String
  ): Boolean = js.native
}

